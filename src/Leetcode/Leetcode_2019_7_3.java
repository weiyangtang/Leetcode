package Leetcode;

/**
 * @Auther: tangweiyang
 * @Date: 2019/7/3 19:23
 * @Description: 无聊开始练习Leetcode
 */
public class Leetcode_2019_7_3 {
    // A-64=1
    public static void main(String[] args) {
        System.out.println(titleToNumber("ZY"));
    }

    public static int titleToNumber(String s) {
        char[] chars = s.toCharArray();
        int sum = 0;
        for (int i = chars.length - 1, j = 0; i >= 0; i--, j++) {
            sum = (int) (sum + (chars[i] - 64) * Math.pow(26, j));
        }
        return sum;
    }
}