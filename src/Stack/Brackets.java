package Stack;

import java.util.Stack;

/**
 * @Auther: tangweiyang
 * @Date: 2019/7/12 20:51
 * @Description: 栈括号匹配
 */
public class Brackets {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (!stack.empty()) {
                char top = stack.peek();
                if ((top == '{' && temp == '}') || (top == '(' && temp == ')') || (top == '[' && temp == ']'))
                    stack.pop();
                else stack.push(temp);
            } else stack.push(temp);
        }
        if (stack.empty())
            return true;
        return false;
    }

    public static void main(String[] args) {
        boolean valid = isValid("{[]}");
        System.out.println(valid);
    }
}