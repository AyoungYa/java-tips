package JavaTips;

import java.util.concurrent.TimeUnit;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzeying</p>.
 * <p>@Date: 2019-06-08.</p>
 */
public class Join {
    public static void main(String[] args) throws InterruptedException {
        ThreadLocal<Long> threadLocal = new ThreadLocal<Long>() {
            @Override
            protected Long initialValue() {
                return System.currentTimeMillis();
            }
        };
        Thread previous = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Demino(previous), String.valueOf(i));
            thread.start();
            previous = thread;
        }
        TimeUnit.SECONDS.sleep(2);
        System.out.println(Thread.currentThread().getName() + "=====");
    }

    static class Demino implements Runnable {
        Thread thread;

        public Demino(Thread thread) {
            this.thread = thread;
        }

        @Override
        public void run() {
            try {
                thread.join();
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ", Join了一个线程：" + thread.getName() + "-----");
        }
    }
}
