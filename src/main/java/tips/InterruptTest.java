package JavaTips;

import utils.SleepUtil;

import java.util.concurrent.TimeUnit;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzeying</p>.
 * <p>@Date: 2019-06-16.</p>
 */
public class InterruptTest {
    public static void main(String[] args) {
        Thread sleep = new Thread(new SleepThread(), "Sleep-Thread");
//        sleep.setDaemon(true);
        Thread busy = new Thread(new BusyThread(), "Busy-Thread");
//        busy.setDaemon(true);
        sleep.start();
        busy.start();

        SleepUtil.sleep(15);
        sleep.interrupt();
        System.out.println("Sleep interrupt");
        SleepUtil.sleep(10);
        busy.interrupt();
        System.out.println("busy interrupt");
        System.out.println("sleep interrupted is: " + sleep.isInterrupted());
        System.out.println("busy interrupted is: " + busy.isInterrupted());
    }

    static class SleepThread implements Runnable {

        @Override
        public void run() {
            SleepUtil.sleep(10);
//            while (true) {
//
//            }
        }
    }

    static class BusyThread implements Runnable {

        @Override
        public void run() {
            while (true) {
//                System.out.println("busy");
//                SleepUtil.sleep(1);
            }
        }
    }
}
