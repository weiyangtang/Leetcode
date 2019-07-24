package Leetcode;

import java.util.*;

/**
 * @Auther: tangweiyang
 * @Date: 2019/7/4 13:15
 * @Description:
 */
public class Leetcode_2019_7_4 {
    static List<String> res = new LinkedList<>();

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        return null;
    }

    public static void main(String[] args) {
        int n = 3;
        int nums[] = new int[]{1, 7, 2, 5,2};
        int selected[] = new int[n];
        boolean empty[] = new boolean[nums.length];
        Arrays.fill(empty, false);
        dfs(nums, selected, empty, 0, n);
        res.forEach(System.out::println);
    }


    /***
     *
     *深度优先遍历算法，从nums[]中n排列的组合
     * @param nums
     * @param selected,记录索引
     * @param index
     * @param n
     *
     */
    public static void dfs(int[] nums, int[] selected, boolean[] empty, int index, int n) {
        if (index == n) {
            String s = "";
            int temp[] = new int[n];
            for (int i = 0; i < selected.length; i++) {
                temp[i] = nums[selected[i]];
            }
            Arrays.sort(temp);
            for (int num : temp) {
                s = s + "\t" + num;
            }
            //鸡贼的地方，哈哈
            if (!res.contains(s)) res.add(s);
            return;
        } else {
            for (int i = 0; i < nums.length; i++) {
                selected[index] = i;
                if (judge(selected, index) == false) {
                    dfs(nums, selected, empty, index + 1, n);
                }
            }
        }
    }

    // true 重复了，false 未重复
    public static boolean judge(int[] selected, int index) {
        for (int i = 0; i < index; i++) {
            if (selected[i] == selected[index])
                return true;
        }
        return false;
    }

}