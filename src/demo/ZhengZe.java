package demo;

import java.util.regex.Pattern;

public class ZhengZe {
    public static void main(String[] args) {
        String email1 = "1506845740@qq.com";
        String email2 = "da@qq.com";
        System.out.println(ZhengZe.isEmail(email1));
        System.out.println(ZhengZe.isEmail(email2));
    }
    public static boolean isEmail(String email) {
        if ((email != null) && (!email.isEmpty())) {
            return Pattern.matches("^(\\w+([-.][A-Za-z0-9]+)*){3,18}@\\w+([-.][A-Za-z0-9]+)*\\.\\w+([-.][A-Za-z0-9]+)*$", email);
        }
        return false;
    }

}
