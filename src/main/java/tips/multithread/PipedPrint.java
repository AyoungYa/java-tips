package tips.multithread;

import utils.SleepUtil;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzeying</p>.
 * <p>@Date: 2019-06-16.</p>
 */
public class PipedPrint {

    public static void main(String[] args) throws IOException {
        PipedWriter writer = new PipedWriter();
        PipedReader reader = new PipedReader();

        writer.connect(reader);

        Thread b = new Thread(new PrintB(reader), "Thread-B");
        b.start();
        try {
            while (true) {
                writer.write(1);
                System.out.println("A");
                SleepUtil.sleep(1);
            }
        } finally {
            writer.close();
        }

    }

    static class PrintB implements Runnable {
        private PipedReader in;
//        private PipedWriter out = new PipedWriter();

        public PrintB(PipedReader in) throws IOException {
            this.in = in;
//            in.connect(out);
        }

        @Override
        public void run() {
            PipedReader toNextIn = new PipedReader();
            PipedWriter toNextWriter = new PipedWriter();
            try {
                toNextIn.connect(toNextWriter);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Thread t = new Thread(new PrintC(toNextIn), "Thread-C");
            t.start();
            while (true) {
                try {
                    if (in.read() != -1) {
                        System.out.println("B");
                        toNextWriter.write(1);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        toNextWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        }

        static class PrintC implements Runnable {
            private PipedReader in;

            public PrintC(PipedReader in) {
                this.in = in;
            }

            @Override
            public void run() {
                while (true) {
                    try {
                        if (in.read() != -1) {
                            System.out.println("C");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }
        }
    }
}
