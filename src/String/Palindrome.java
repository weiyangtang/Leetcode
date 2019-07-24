package String;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: tangweiyang
 * @Date: 2019/7/12 20:23
 * @Description: 判断数字是否是回文形式
 */
public class Palindrome {
    /***
     * 考虑不将数字转成字符串
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        List<Integer> list = new ArrayList<>();
        while (x > 0) {
            list.add(x % 10);
            x = x / 10;
        }
        Integer[] array = list.toArray(new Integer[1]);
        int left = 0, right = array.length - 1;
        while (left < right) {
            if (array[left] != array[right])
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean palindrome = isPalindrome(2121);
        System.out.println(palindrome);
    }
}