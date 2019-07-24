package Leetcode;

import java.util.*;

/**
 * @Auther: tangweiyang
 * @Date: 2019/7/4 13:15
 * @Description: 从m个数字中（可能有重复数字比如1 2 1 5 6）选出n个数 有多少种可能，肯定是比C(m,n)小或等于
 * 21
 */
public class Leetcode_2019_7_4_debug {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        String numstr = "";
        List<String> totalAns = new ArrayList<>();
        for (int num : nums) {
            numstr = numstr + "" + num;
        }
        int n = 3;
        List<List<Integer>> lists = new LinkedList<>();
        List<String> res = new LinkedList<>();
        dfs(nums, new int[n], new boolean[nums.length], 0, n, res);
        for (String re : res) {
            int sum = 0;
            String[] split = re.trim().split(" +");
            LinkedList<Integer> integers = new LinkedList<>();
            for (String s : split) {
                int temp = Integer.parseInt(s);
                sum = sum + temp;
                integers.add(temp);
            }
            int fourthNum = target - sum;//第四个数字
            integers.add(fourthNum);
            boolean flag = true;
            String tempStr = numstr;
            for (Integer integer : integers) {
                if (!tempStr.contains(integer + ""))
                    flag = false;
                else tempStr = tempStr.replaceFirst(integer + "", "");
            }
            if (flag == true) {
                integers.sort(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return Integer.compare(o1, o2);
                    }
                });
                String s = integers.toString().trim();
                if (!totalAns.contains(s)) {
                    lists.add(integers);
                    totalAns.add(s);
                }

            }

            flag = true;
        }
        return lists;
    }


    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<List<Integer>> lists = fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
        System.out.println(System.currentTimeMillis() - start);


    }


    /***
     *  @param nums
     * @param selected
     * @param empty
     * @param index
     * @param n
     * @return
     */
    public static void dfs(int[] nums, int[] selected, boolean[] empty, int index, int n, List<String> res) {
        if (index == n) {
            String s = "";
            int[] temp = selected.clone();
            Arrays.sort(temp);
            for (int i = 0; i < temp.length; i++) {
                s = s + " " + temp[i];
            }
            //鸡贼的地方，哈哈
            if (!res.contains(s.trim())) res.add(s.trim());
            return;
        } else {
            for (int i = 0; i < nums.length; i++) {
                selected[index] = nums[i];
                if (empty[i] == false) {
                    empty[i] = true;
                    dfs(nums, selected, empty, index + 1, n, res);
                    empty[i] = false;
                }
            }
        }
    }
}