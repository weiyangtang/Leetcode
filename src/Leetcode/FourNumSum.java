package Leetcode;

import java.util.*;

/**
 * @Auther: tangweiyang
 * @Date: 2019/7/7 15:14
 * @Description: 四个数之和为target
 */
public class FourNumSum {
    public static void main(String[] args) {
        List<List<Integer>> lists = fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n - 3; i++) {
            for (int j = n - 1; j > i + 2; j--) {
                int left = i + 1, right = j - 1;
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        set.add(list);
                        list = new ArrayList<>();
                        left++;
                    } else if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}