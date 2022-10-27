package wc.zk.day03;

/**
 * 方法
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-27 15:37:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-27      zk           v1.0.0               新建
 **/
public class MethodDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = max(a,b);
        System.out.println(a+"和"+b+"比较，大的是"+c);

        System.out.println("********************");

        printGrade(100.0);
    }

    private static void printGrade(double score) {
        if (score >=90.0 ) {
            System.out.println('A');
        }else if (score >= 80.0){
            System.out.println('B');
        }else if (score >= 70.0){
            System.out.println('C');
        }else if (score >= 60.0){
            System.out.println('D');
        }else {
            System.out.println('F');
        }
    }

    public static int max(int num1,int num2){
        int sum;
        if (num1>num2){
            sum = num1;
        }else sum = num2;
        return sum;
    }
    //构造方法
    class MyClass{
        int x;
    }

}
