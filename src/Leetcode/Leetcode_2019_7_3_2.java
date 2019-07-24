package Leetcode;

/**
 * @Auther: tangweiyang
 * @Date: 2019/7/3 20:20
 * @Description:
 */
public class Leetcode_2019_7_3_2 {
    public static void main(String[] args) {
        String s = "LEETCODEISHIRING";
        System.out.println(convert(s, 3));
    }

    public static String convert(String s, int numRows) {

        char[][] arrays = new char[s.length()][numRows];
        for (int j = 0; j < numRows; j++) {
            for (int i = 0; i < s.length(); i++) {
                arrays[i][j] = ' ';
            }
        }
        int count = 0;
        int row = 0, col = 0;
        while (count < s.length()) {
            for (row = 0; row < numRows && count < s.length(); row++) {
                arrays[col][row] = s.charAt(count);
                count++;
            }
            col += 1;
            for (row = row - 2; row > 0 && count < s.length(); row--, col++) {
                arrays[col][row] = s.charAt(count);
                count++;
            }
        }
        String ans = "";
        for (int j = 0; j < numRows; j++) {
            for (int i = 0; i < s.length(); i++) {
                if (arrays[i][j] != ' ') {
                    ans = ans + arrays[i][j];
                }
            }
        }
        return ans;
    }
}