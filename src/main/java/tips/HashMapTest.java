package JavaTips;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzeying</p>.
 * <p>@Date: 2019-04-03.</p>
 */
public class HashMapTest {
    public static class Test extends Thread {
        static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(2);
        static AtomicInteger at = new AtomicInteger();

        public void run() {
            while (at.get() < 1000000) {
                map.put(at.get(), at.get());
                at.incrementAndGet();
            }
        }
    }

    public static void main(String[] args) {
        int i = 0;
        while (i++ < 1000) {
            Test t0 = new Test();
            Test t1 = new Test();
            Test t2 = new Test();
            Test t3 = new Test();
            Test t4 = new Test();
            Test t5 = new Test();
            Test t6 = new Test();
            Test t7 = new Test();
            Test t8 = new Test();
            Test t9 = new Test();

            t0.start();
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();
            t6.start();
            t7.start();
            t8.start();
            t9.start();
        }
    }
}
