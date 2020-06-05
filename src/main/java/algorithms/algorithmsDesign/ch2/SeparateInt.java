package algorithms.algorithmsDesign.ch2;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Description: </p>
 * <p>@author: Created by YangZeying</p>.
 * <p>@Date: 2020/5/31.</p>
 */
public class SeparateInt {
    /**
     * 整数划分问题
     */
    public static void main(String[] args) {

    }

    private int separate(int target, int maxAdded) {
        if (maxAdded == 1) {
            return 1;
        }
        if (maxAdded == target) {
            return 1;
        }
        if (target > 1 && maxAdded == target - 1) {
            return 1;
        }
        return 0;
    }
}
