package JavaTips;

import sun.misc.Unsafe;
import sun.reflect.Reflection;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzeying</p>.
 * <p>@Date: 2019-07-05.</p>
 */
public class Shift {
    public static void main(String[] args) {
        int a = 7;
        System.out.println("原数据(7)二进制：\t" + Integer.toBinaryString(a));
        int b = -7;
        System.out.println("原数据(-7)二进制：\t" + Integer.toBinaryString(b));


        //左移一位，相当于 *2
        a = a << 1;
        System.out.println("普通左移一位：" + Integer.toBinaryString(a));

        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        Unsafe unsafe = Unsafe.getUnsafe();
        System.out.println(unsafe);
    }
}
