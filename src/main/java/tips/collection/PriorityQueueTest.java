package tips.collection;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * <p>Description: </p>
 * <p>@author: Created by YangZeying</p>.
 * <p>@Date: 2020/6/7.</p>
 */
public class PriorityQueueTest {

    public static void main(String[] args) {
        Queue<Integer> intQueue = new PriorityQueue();
        intQueue.add(21);
        intQueue.add(1);

        intQueue.poll();
        System.out.println(intQueue);
    }
}
