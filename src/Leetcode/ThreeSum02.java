package Leetcode;

import java.util.*;

/**
 * @Auther: tangweiyang
 * @Date: 2019/7/7 17:08
 * @Description: 三数之和为0
 */
public class ThreeSum02 {
    public static void main(String[] args) {
        List<List<Integer>> lists = threeSum(new int[]{-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6});
        System.out.println();
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        int left = 0, right = n - 1;
        while (left < right - 1) {
            List<Integer> list = new ArrayList<>();
            int mid = left + 1;
            while (mid < right) {
                int sum = nums[left] + nums[mid] + nums[right];
                if (sum == 0) {
                    list.add(nums[left]);
                    list.add(nums[mid]);
                    list.add(nums[right]);
                    set.add(list);
                    list = new ArrayList<>();
                    if (mid == right - 1)
                        left++;
                    mid++;
                } else if (sum > 0) {
                    right--;
                    break;
                } else if (sum < 0) {
                    if (mid == right - 1)
                        left++;
                    mid++;
                }
            }
        }
        return new ArrayList<>(set);
    }
}