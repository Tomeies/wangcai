package wc.zk.day03;

/**
 * 自动转换和强转
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-27 09:10:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-27      zk           v1.0.0               新建
 **/
public class AutomaticConversion {
    public static void main(String[] args) {
        char c1 = 'a';//char型
        int b = c1;//char自动转换成int
        System.out.println("char转成int之后的值是："+b);
        char c2 = 'A';
        int b1 = c2;
        System.out.println("char转成int之后的值是："+b1);

        //强转
        int a1 = 123;
        byte b2 = (byte) a1;//转换成byte
        System.out.println("b2 = " + b2);
        //整数的默认类型是int 小叔默认是double 在定义float类型上必须在数字后面跟上F或者f

    }
}
