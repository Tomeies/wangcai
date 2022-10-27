package wc.zk.day03;

/**
 * 或与非运算符
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-27 09:35:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-27      zk           v1.0.0               新建
 **/
public class TrueOrFalse {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("a&&b="+(a&&b));
        System.out.println("a||b="+(a||b));
        System.out.println("!(a&&b)="+(a&&b));

        int c = 5;
        boolean d = (c<4)&&(c++<10);
        System.out.println("使用短路逻辑运算符的结果为"+d);
        System.out.println("c的结果是："+c);

        int A = 2;
        int B = A<<=2;
        int C = A^2;
        System.out.println(C);
    }
}
