package tips.multithread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * <p>Description: 使用yield的方式让多线程输出ABCABC...</p>
 * <p>@author: Created by YangZeying</p>.
 * <p>@Date: 2020/6/5.</p>
 */
public class YieldTest {
    private static volatile AtomicInteger flag = new AtomicInteger(0);
    private static final int COUNT = 10000;

    public static void main(String[] args) {
        PrintThread a = new PrintThread(0, "A");
        PrintThread b = new PrintThread(1, "B");
        PrintThread c = new PrintThread(2, "C");

        a.start();
        b.start();
        c.start();
    }

    public static class PrintThread extends Thread {
        private int number;
        private String c;

        public PrintThread(int number, String c) {
            this.number = number;
            this.c = c;
        }

        @Override
        public void run() {
            int i = 0;
            while (i < COUNT) {
                if (flag.get() % 3 == number) {
                    System.out.print(c);
                    flag.getAndAdd(1);
                    i++;
                    Thread.yield();
                }
            }
        }
    }
}
