package tips.sorts;

/**
 * <p>Description:
 * 首先在未排序序列中找到最小元素，存放到排序序列的起始位置，
 * 然后，再从剩余未排序元素中继续寻找最小元素，然后放到已排序序列的末尾。</p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2018/5/30.</p>
 */
public class ChooseSort {
    public static <T extends Comparable> void sort(T[] dataArray) {
        if (dataArray == null || dataArray.length < 2) return;

        T temp;
        for (int i = 0; i < dataArray.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < dataArray.length; j++) {
                if (dataArray[minIndex].compareTo(dataArray[j]) > 0) {
                    minIndex = j;
                }
            }
            temp = dataArray[i];
            dataArray[i] = dataArray[minIndex];
            dataArray[minIndex] = temp;
        }
    }
}
