package tips.sorts;

import java.util.Arrays;
import java.util.Random;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2018/5/30.</p>
 */
public class BubbleSort {
    public static <T extends Comparable> void bubble(T[] list) {
        if (list == null || list.length == 1 || list.length == 0)
            return;
        for (int i = 1; i < list.length - 1; i++) {
            int flag = 0;
            for (int j = 0; j < (list.length - i); j++) {
                if (list[j].compareTo(list[j + 1]) > 0 ) {
                    T tmp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = tmp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        int size = 10;
        Random random = new Random();
        Integer[] a = new Integer[size];
        for (int i = 0; i < size; i++) {
            a[i] = random.nextInt(4 * size);
        }
        System.out.println(Arrays.asList(a));
//        BubbleSort.bubble(a);
//        InsertSort.insertSort2(a);
//        ChooseSort.sort(a);
        QuickSort.quickSort(a);

        System.out.println("-----------");
        System.out.println(Arrays.asList(a));

        boolean checkResult = checkIsSorted(a);
        if (checkResult) {
            System.out.println("排序正确!!!");
        } else {
            System.out.println("排序失败!!!");
        }
    }

    public static <T extends Comparable> boolean checkIsSorted(T[] list) {
        boolean isSorted = true;
        if (list == null || list.length < 2)
            return isSorted;
        T temp1 = list[0], temp2 = list[list.length - 1], very = list[0];
        int firstCompareLast = temp1.compareTo(temp2);
        if (firstCompareLast > 0) {
            System.out.println("递减排序");
        } else if (firstCompareLast < 0) {
            System.out.println("递增排序");
        } else {
            System.out.println("开始和结束元素相同");
        }

        for (int i = 1; i < list.length; i++) {
            if (very.compareTo(list[i]) == firstCompareLast || very.compareTo(list[i]) == 0) {
                very = list[i];
            } else {
                isSorted = false;
            }
        }
        return isSorted;
    }

}
