package JavaTips;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzeying</p>.
 * <p>@Date: 2019-06-08.</p>
 */
public class Piped {

    public static void main(String[] args) throws IOException {
        PipedWriter out = new PipedWriter();
        PipedReader in = new PipedReader();

//        out.connect(in);
        in.connect(out);

        Thread print = new Thread(new Print(in), "print-thread");
        print.start();

        int receive = 0;
        try {
            while ((receive = System.in.read()) != -1) {
                System.out.println("in time: " + System.currentTimeMillis());
                out.write(receive);
            }
        } finally {
            out.close();
        }
    }

    static class Print implements Runnable {
        PipedReader in;

        public Print(PipedReader in) {
            this.in = in;
        }

        @Override
        public void run() {
            int reveive = 0;

            try {
                while ((reveive = in.read()) != -1) {
                    System.out.println("out thread time: " + System.currentTimeMillis());
                    System.out.println("print thread print: " + (char)reveive);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
