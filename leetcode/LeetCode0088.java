package leetcode;

import java.util.Arrays;

public class LeetCode0088 {

    public static void main(String[] args) {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        merge(nums1, m, nums2, n);
        System.out.println("--------------------");
        System.out.println(Arrays.toString(nums1));
        System.out.println("--------------------");
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int totalSize = m + n;
        int pointerNums1 = m - 1;
        int pointerNums2 = n - 1;
        for (int pointerMerged = totalSize - 1; pointerMerged >= 0; --pointerMerged) {
            if (pointerNums1 < 0) {
                int num2 = nums2[pointerNums2];
                nums1[pointerMerged] = num2;
                --pointerNums2;
            } else if (pointerNums2 < 0) {
                int num1 = nums1[pointerNums1];
                nums1[pointerMerged] = num1;
                --pointerNums1;
            } else {
                int num1 = nums1[pointerNums1];
                int num2 = nums2[pointerNums2];
                if (num1 >= num2) {
                    nums1[pointerMerged] = num1;
                    --pointerNums1;
                } else {
                    nums1[pointerMerged] = num2;
                    --pointerNums2;
                }
            }
        }
    }

}
