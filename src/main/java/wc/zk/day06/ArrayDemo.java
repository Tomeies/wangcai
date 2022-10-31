package wc.zk.day06;

import java.util.Random;
import java.util.Scanner;

/**
 * 数组练习题
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-31 14:49:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-31      zk           v1.0.0               新建
 **/
public class ArrayDemo {
    public static void main(String[] args) {
//        在数组{4,5,6,2,3,1,9,8,7,10,12,14,15}中查找元素（先打印输出所有元素，输入一个数，如果找到了则打印输出其位置，没有找到则提示没有找到）
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] array = {4,5,6,2,3,1,9,8,7,10,12,14,15};
        for (int value : array){
            System.out.println(value);
        }
        System.out.println("*********************");
        while (true) {
            System.out.println("请输入你要查找的数");
            int number = scanner.nextInt();
            boolean count = false;
            for (int i = 0; i < array.length; i++) {
                if (number==array[i]){
                    System.out.println("改数的下标是："+i);
                    count=true;
                }
            }
            if (!count) {
                System.out.println("没有这个数");
                break;
            }
        }
    }
}
