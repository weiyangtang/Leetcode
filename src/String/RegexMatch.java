package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Auther: tangweiyang
 * @Date: 2019/7/12 08:45
 * @Description: 正则表达式匹配问题
 */
public class RegexMatch {
    /***
     * 投机取巧，耍小聪明要不得
     * @param s
     * @param p
     * @return
     */
    public static boolean isMatch(String s, String p) {
//        1.字符串匹配的原始api
//        Pattern pattern = Pattern.compile(p);
//        Matcher matcher = pattern.matcher(s);
//        System.out.println(matcher.matches());
//        2. 稍微封装后的
        boolean matches = s.matches(p);
        return matches;
    }

    public static void main(String[] args) {
        isMatch("mississippi", "mis*is*p*.");
    }
}