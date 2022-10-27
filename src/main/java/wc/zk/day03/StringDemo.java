package wc.zk.day03;

/**
 * String的使用
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-27 10:36:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-27      zk           v1.0.0               新建
 **/
public class StringDemo {
    public static void main(String[] args) {
        char[] zk = {
            'h','e','l','l','o'
        };
        String toString = new String(zk);
        System.out.println(toString);

        String a = "www.baidu.com";
        int len = a.length();
        System.out.println(len);//字符串的长度

        //字符串拼接
        String str = "123";
        System.out.println("1、"+str+"456");

        //String 中常用的方法：
        /*
        charAt 返回索引处的char值
        int compareTo 将这个字符和另外一个对象对比
        boolean endWith 判断是否是以某个字符后缀结束
        int indexOf 返回该字符第一次出现指定字符处的索引
        int lastIndexOf 返回字符最后一次出现的索引
        length 返回字符串的长度
         */
    }
}
