package consensusAlgorithm.raft;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2018/5/10.</p>
 */
@Getter
@Setter
@ToString
public class Point implements Runnable{
    private static final int MIN_TIMEOUT_SECOND = 4;
    private static final int RANDOM_INT = 20;
    private int id; //结点唯一ID
    private PointType pointType;
    private boolean isAlive; //当前结点是否还活着
    private List<Point> allPoints; //系统中的结点

    private final long timeOut; //超时时间(ms)，每个结点都不一样，初始化时决定

    public Point(int i, List<Point> allPoints) {
        this.setAlive(true); //假设每个新加入的结点都是存活的

        this.id = i;
        this.pointType = PointType.FOLLOWER;// 初始化为follower结点类型
        this.allPoints = new ArrayList<>(allPoints);
        allPoints.add(this);


        this.timeOut = (new Random().nextInt(RANDOM_INT) + MIN_TIMEOUT_SECOND) * 1000;
        new Thread(this).start();
        System.out.println("加入结点：" + i + ", 当前共有结点数: " + allPoints.size() + ", 当前结点超时时间(ms): " + timeOut);
    }

    public void sendHeart(List<Point> followerPoints) {
        for (Point point : followerPoints) {
            point.recvHeart();
        }
    }

    private boolean haveReceivedLeaderHeart;
    public boolean recvHeart() {
        return haveReceivedLeaderHeart = true;
    }

    public int requireCandidate(List<Point> points) {
        return 0;
    }

    @Override
    public void run() {
        System.out.println("Start point: " + this.id);
        while (true) {
            try {
                Thread.sleep(timeOut);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (pointType != PointType.LEADER && haveReceivedLeaderHeart)

            judgeIsShouldDie(); //在一定概率下，这个结点会挂掉
            if (! isAlive) { //判断当前结点是否还存活
                System.out.println("point: " + this.id + " is not alive. time: " + new Date());
                break;
            }

            if (pointType == PointType.LEADER) { //如果当前结点是主结点，则需要向其他结点发送心跳
                sendHeart(allPoints);
            }

        }
    }

    private void judgeIsShouldDie() {
        float a = new Random().nextFloat();
        if (a >= 0.9) {
            setAlive(false);
        }
    }
}
