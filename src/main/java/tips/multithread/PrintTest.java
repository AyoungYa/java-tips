package tips.multithread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * <p>Description: 多线程输出ABCABC...</p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2018/5/17.</p>
 */
public class PrintTest {
    private static AtomicInteger currentNo = new AtomicInteger(0);
    public static void main(String[] args) throws InterruptedException {
        Thread a = new Thread(new InVolatileMethod("A", 0));
        Thread b = new Thread(new InVolatileMethod("B", 1));
        Thread c = new Thread(new InVolatileMethod("C", 2));
        a.start();
        b.start();
        c.start();
        a.join();
        b.join();
        c.join();
        System.out.println("Main thread is exit");
    }

    static class InVolatileMethod implements Runnable {
        private final String outString;
        private final int order;

        public InVolatileMethod(String outString, int order) {
            this.outString = outString;
            this.order = order;
        }

        @Override
        public void run() {
            while (true) {
                if (currentNo.get() % 3 == order) {
                    System.out.print(outString);
                    currentNo.getAndAdd(1);

                    //让他慢一点
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (currentNo.get() > 100)
                        break;
                }
            }
        }
    }
}
