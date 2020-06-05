package tips.multithread;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzeying</p>.
 * <p>@Date: 2019-06-29.</p>
 */
public class FairAndUnfairTest {


    private static class ReentrantLock2 extends ReentrantLock {
        public ReentrantLock2(boolean fair) {
            super(fair);
        }
    }

//    public Collection<Thread> getQueuedThreads() {
//        List<Thread> ar = new ArrayList<Thread>(super.getQueuedThreads());
//    }
}
