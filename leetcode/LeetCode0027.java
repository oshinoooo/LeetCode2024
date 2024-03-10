package leetcode;

import java.util.Arrays;

public class LeetCode0027 {

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int newLength = removeElement(nums, val);
        System.out.println("--------------------");
        System.out.println("newLength: " + newLength + ", nums: " + Arrays.toString(nums));
        System.out.println("-------------------- ");
    }

    public static int removeElement(int[] nums, int val) {
        int size = nums.length;
        int switchTimes = 0;
        for (int i = 0; i < size; ++i) {
            if (nums[i] == val) {
                for (int m = i + 1; m < size; ++m) {
                    if (nums[m] != val) {
                        nums[i] = nums[m];
                        nums[m] = val;
                        ++switchTimes;
                        break;
                    }
                }
            }
        }
        return size - switchTimes;
    }

}
