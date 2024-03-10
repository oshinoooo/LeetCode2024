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
        int slow = 0;
        for (int fast = 0; fast < size; ++fast) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                ++slow;
            }
        }
        return slow;
    }

}
