package wc.zk.day03;

/**
 * java循环
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-27 09:45:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-27      zk           v1.0.0               新建
 **/
public class ForLoop {
    public static void main(String[] args) {
        //while循环 只要满足条件就会一直执行
        int a = 1;
        while (a<5) {
            System.out.println("a的值："+a);
            a++;
            System.out.println("");
        }
        System.out.println("*************************");
        //do while循环 不管条件如何 都会先执行一次程序
        int b = 1;
        do {
            System.out.println("b的值："+b);
            b++;
            System.out.println();
        }while (b <=5);
        System.out.println("*************************");

        //for循环
        for (int i = 0; i <= 10; i++) {
            System.out.print("i的值："+i);
            System.out.println();
        }
        //增强for循环
        int[]num = {10,20,30,40};
        for (int x :num){
            System.out.print(x);
            System.out.print(",");
        }
        System.out.println();
        System.out.println("***************");
        //若想跳出循环 直接在循环结构中插入break关键字就行
        int[]num1 = {10,20,30,40};
        for (int x :num1){
            if (x == 30) {
                break;
            }
            System.out.print(x);
            System.out.print(",");
        }
    }

}
