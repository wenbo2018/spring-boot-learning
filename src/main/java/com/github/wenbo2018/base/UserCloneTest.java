package com.github.wenbo2018.base;


import java.util.Arrays;

/**
 * Created by shenwenbo on 2018/7/4.
 */
public class UserCloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {


        int[] nums = new int[]{1, 3, 5};
        searchInsert(nums, 2);
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
                if (left <= right && nums[left] >= target) {
                    return left;
                }
            } else if (nums[mid] > target) {
                right = mid - 1;
                if (left <= right && nums[right] <= target) {
                    return right < 0 ? 0 : right;
                }
            } else {
                return mid;
            }
        }
        return Math.max(left, right);
    }
}
