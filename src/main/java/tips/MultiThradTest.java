package others;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzeying</p>.
 * <p>@Date: 2019-03-27.</p>
 */
public class MultiThradTest {
    public static void main(String[] args) {
        System.out.println("main start");
        new Thread(new A()).start();
        System.out.println("Main thread");
    }

   static class A implements Runnable {

        @Override
        public void run() {
            System.out.println("new Runnable " + Thread.currentThread().getName());
        }
    }
}
