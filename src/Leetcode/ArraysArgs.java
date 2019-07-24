package Leetcode;

import java.util.Arrays;

/**
 * @Auther: tangweiyang
 * @Date: 2019/7/5 09:06
 * @Description:
 */
public class ArraysArgs {
    public static void main(String[] args) {
        int[] arrays = new int[]{10, 2, 4, 7, 8};
        sort(arrays);
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+"\t");
        }

    }

    public static void sort(int[] arrays) {
        Arrays.sort(arrays);
    }
}