package wc.zk.bean;

/**
 * 冒泡排序
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-25 15:36:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-25      GongLe           v1.0.0               新建
 **/
public class Bubble {
    public static void main(String[] args) {
        int[] numbers=new int[]{1,5,8,2,3,9,4,6};
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = 0; j <numbers.length-1-i ; j++) {
                if (numbers[j]>numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        System.out.println("排序结果：");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();
        int a = 1;
        int b = 1;
        for (a=1;a<=9;a++){
            for (b=1;b<=a;b++){
                System.out.print(a+"*"+b+"="+a*b+"\t");
            }
            System.out.println();
        }
    }
}
