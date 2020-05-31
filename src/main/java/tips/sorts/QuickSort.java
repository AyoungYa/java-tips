package tips.sorts;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2018/6/1.</p>
 */
public class QuickSort {

    public static <T extends Comparable> void quickSort(T[] dataArray) {
        if (dataArray == null || dataArray.length < 2)
            return;

        sort(dataArray, 0, dataArray.length);
    }

    private static <T extends Comparable>void sort(T[] data, int left, int right) {
        if (left >= right)
            return;
        int j = partition(data, left, right);
        sort(data, left, j - 1);
        sort(data, j + 1, right);
    }

    private static <T extends Comparable> int partition(T[] data, int left, int right) {
        int i = left, j = right;
        T temp;
        T variable = data[left];
        while (true) {
            while (data[++i].compareTo(variable) < 0) {
                if (i == right) {
                    break;
                }
            }
            while (variable.compareTo(data[--j]) < 0) {
                if (j == left) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            temp = data[i];
            data[i] = data[j];
            data[j] = temp;
        }
        temp = data[left];
        data[left] = data[j];
        data[j] = temp;
        return j;

    }
}
