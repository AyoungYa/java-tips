package JavaTips;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzeying</p>.
 * <p>@Date: 2019-06-08.</p>
 */
public class WaitNotify {
    static boolean flag = true;
    static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread waitThread = new Thread(new Wait(), "wait-thread");
        waitThread.start();
        TimeUnit.SECONDS.sleep(1);

        Thread notifyThread = new Thread(new Notify(), "notify-thread");
        notifyThread.start();
    }

    static class Wait implements Runnable {

        @Override
        public void run() {
            synchronized (lock) {
                while (flag) {
                    try {
                        System.out.println(Thread.currentThread() + " flag is true, wait @ "
                                + new SimpleDateFormat("HH:mm:ss").format(new Date()));
                        lock.wait();
                    } catch (Exception e) {
                    }
                }
                System.out.println(Thread.currentThread() + " flag is false, wait @ "
                        + new SimpleDateFormat("HH:mm:ss").format(new Date()));

            }
        }
    }

    static class Notify implements Runnable {

        @Override
        public void run() {
            synchronized (lock) {
                System.out.println(Thread.currentThread() + " hold lock. notify @ "
                        + new SimpleDateFormat("HH:mm:ss").format(new Date()));
                lock.notifyAll();
                flag = false;
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized (lock) {
                System.out.println(Thread.currentThread() + " hold lock again. notify @ "
                        + new SimpleDateFormat("HH:mm:ss").format(new Date()));
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
