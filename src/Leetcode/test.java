package Leetcode; /**
 * @Auther: tangweiyang
 * @Date: 2019/7/5 09:12
 * @Description:
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String args[]) {
      /*  byte [] requestContent={0x01,0x02,0x03};
        byte [] newRequestContent=new byte[3];
        System.arraycopy(requestContent,0,newRequestContent,0,3);
        requestContentDetail(newRequestContent);
        System.out.print(requestContent[1]);*/

        int[] a = {4, 2, 3};
        math(a);
        System.out.println(a[0]);

    }

    public static void math(int[] a) {
        a[0] = 100;
        Arrays.sort(a);
    }
}