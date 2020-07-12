package pers.hanco.leetcode.arrays;

/**
 * @author Hanco on 2020/7/11
 * <p>
 * 给定一个二进制数组， 计算其中最大连续1的个数。
 * <p>
 * 输入的数组只包含 0 和1。
 * 输入数组的长度是正整数，且不超过 10,000。
 */
public class findMaxConsecutiveOnes_485 {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 1, 0, 1, 1, 1};

        int result = new findMaxConsecutiveOnes_485().findMaxConsecutiveOnes(nums);
        System.out.println(result);

        result = new findMaxConsecutiveOnes_485().answer2(nums);
        System.out.println(result);
    }

    private int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
        }

        if (count > max) {
            max = count;
        }

        return max;
    }

    /**
     * 滑动窗口
     */
    private int answer2(int[] nums) {
        int max = 0;
        int size = nums.length;
        int left = 0;
        int right = 0;
        while (right < size) {
            if (nums[right++] == 0) {
                max = Math.max(max, right - left -1);
                left = right;
            }
        }

        return Math.max(max, right - left);
    }
}
