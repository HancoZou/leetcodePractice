package pers.hanco.leetcode.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Hanco on 2020/11/14
 */
public class FindRepeatNumber_03 {
    public static void main(String[] args) {
        int[] arrays = {2, 3, 1, 0, 2, 5, 3};
        int result = new FindRepeatNumber_03().findRepeatNumber(arrays);
        System.out.println(result);
    }

    private int findRepeatNumber(int[] nums) {
        int size = nums.length;
        int result = -1;
        Set<Integer> numSet = new HashSet<>(size);
        for(int each : nums) {
            if (!numSet.add(each)) {
                result = each;
                break;
            }
        }
        return result;
    }
}
