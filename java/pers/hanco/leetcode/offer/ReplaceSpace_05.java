package pers.hanco.leetcode.offer;

/**
 * @author Hanco on 2020/11/14
 */
public class ReplaceSpace_05 {
    public static void main(String[] args) {
        String msg = "We are happy.";
        String result = new ReplaceSpace_05().replaceSpace(msg);
        System.out.println(result);
    }

    private String replaceSpace(String s) {
        StringBuilder result = new StringBuilder();
        char[] toChars = s.toCharArray();
        for (char each : toChars) {
            if (each == " ".charAt(0)) {
                result.append("%20");
            } else {
                result.append(each);
            }
        }

        return result.toString();
    }
}
