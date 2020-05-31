package algorithms.bookOfAlgorithms.ch01;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzeying</p>.
 * <p>@Date: 2018/10/6.</p>
 */
public class QuestionOne {
    public static void main(String[] args) {
        excise8();
    }

    private static void excise8() {
        System.out.println('b');
        System.out.println('b' + 'c');
        System.out.println((char) ('a' + 4));
    }

    private static void excise1() {
        System.out.println((15) / 2);

        System.out.println(2.0e-6 * 100000000.1);

        System.out.println(true);
    }

    private static void excise2() {
        System.out.println((1 + 2.236) / 2);
    }

    private static void excise7() {
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > 0.001) {
            t = (9.0/t + t) /2.0;
        }
        System.out.println(String.format("%.5f\n", t));
    }
}
