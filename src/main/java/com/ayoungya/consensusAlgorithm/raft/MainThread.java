package com.ayoungya.consensusAlgorithm.raft;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2018/5/10.</p>
 */
public class MainThread {
    private static final List<Point> systemPoints = new ArrayList<>();


    //负责开始发起整个系统
    public static void main(String[] args) throws InterruptedException {
        int totalPoint = 1;
        for (int i = 0; i < totalPoint; i++) {
            addPoint(i);
            Thread.sleep(new Random().nextInt(2000));
        }
    }

    private static void addPoint(int i) {
        Point point = new Point(i, systemPoints);
        systemPoints.add(point);
    }
}
