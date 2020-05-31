package tips.sorts;

/**
 * <p>Description:
 * 1. 从第一个元素开始，该元素可以认为已经被排序
 * 2. 取出下一个元素，在已经排序的元素序列中从后向前扫描
 * 3. 如果该元素（已排序）大于新元素，将该元素移到下一位置
 * 4. 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
 * 5. 将新元素插入到该位置后
 * 6. 重复步骤2~5
 * </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2018/5/30.</p>
 */
public class InsertSort {
    public static <T extends Comparable> void insertSort1(T[] dataArray) {
        if (dataArray == null || dataArray.length < 2)
            return;
        for (int i = 1; i < dataArray.length; i++) {
            for (int j = i; j > 0 && dataArray[j].compareTo(dataArray[j - 1]) < 0; j--) {
                T temp = dataArray[j];
                dataArray[j] = dataArray[j - 1];
                dataArray[j - 1] = temp;
            }
        }
    }

    public static <T extends Comparable> void insertSort2(T[] dataArray) {
        int length = dataArray.length;
        T temp;
        int j;
        for (int i = 1; i < length; i++) {
            temp = dataArray[i];
            for (j = i; j > 0 && temp.compareTo(dataArray[j - 1]) < 0; j--) {
                dataArray[j] = dataArray[j - 1];
            }
            dataArray[j] = temp;
        }
    }

    public static <T extends Comparable> void insertSort3(T[] dataArray) {
        int length = dataArray.length;
        T temp;
        int j;
        for (int i = 1; i < length; i++) {
            if (dataArray[i].compareTo(dataArray[i - 1]) < 0) {
                temp = dataArray[i];
                int index = binarySearch(dataArray, dataArray[i], 0, i - 1);
                for (j = i - 1; j >= index; j--) {
                    dataArray[j + 1] = dataArray[j];
                }
                dataArray[index] = temp;
            }
        }
    }

    private static int binarySearch(Comparable[] a, Comparable target, int start, int end) {
        int mid;
        while (start <= end) {
            mid = (start + end) >> 1;
            if (target.compareTo(a[mid]) < 0) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
