package wc.zk.day03;

import java.util.regex.Pattern;

/**
 * 正则表达式
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-27 15:27:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-27      zk           v1.0.0               新建
 **/
public class RegularDemo {
    public static void main(String[] args) {
        String content = "i an zk"+"from china，basket";
        String pattern = "basket";
        boolean isMatch = Pattern.matches(pattern,content);
        System.out.println("字符串中是否包含了 basket 字符串" + isMatch);

    }
}
