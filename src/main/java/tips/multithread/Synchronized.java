package JavaTips;

import utils.SleepUtil;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzeying</p>.
 * <p>@Date: 2019-06-16.</p>
 */
public class Synchronized {
    public static void main(String[] args) {
//        synchronized (Synchronized.class) {
//            SleepUtil.sleep(20);
//        }
        for (int i = 0; i < 200; i++) {
            Thread t = new Thread(new T(), "Thread-" + i);
            t.start();
        }
    }

    static class T implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "is running");
            Synchronized.m();
        }
    }

    public static synchronized void m() {
        SleepUtil.sleep(20);
    }

}
