package leetcode;

import java.util.Arrays;

public class LeetCode0026 {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newLength = removeDuplicates(nums);
        System.out.println("--------------------");
        System.out.println("newLength: " + newLength + ", nums: " + Arrays.toString(nums));
        System.out.println("-------------------- ");
    }

    public static int removeDuplicates(int[] nums) {
        int size = nums.length;
        int slow = 0;
        for (int fast = 1; fast < size; ++fast) {
            if (nums[slow] < nums[fast]) {
                nums[slow + 1] = nums[fast];
                slow = slow + 1;
            }
        }
        return slow + 1;
    }

}
