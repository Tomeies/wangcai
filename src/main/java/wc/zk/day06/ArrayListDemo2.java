package wc.zk.day06;

import java.util.ArrayList;

/**
 * 集合框架（ArrayList）的常用方法
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-31 14:24:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-31      zk           v1.0.0               新建
 **/
public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("你好");
        array.add("名字");
        array.add("年龄");
        array.add("性别");
        System.out.println(array);//打印整个数组
        System.out.println(array.get(2));//获取下标第二个
        System.out.println(array.isEmpty());//判断是否为空
        array.set(1,"炸炸炸");//替换
        System.out.println(array);
        for (String i :array){
            System.out.println(i);//循环打印每个元素
        }

        int[] arrays = {9,1,6,5,3,4,7,8,2};
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length-1-i; j++) {
                if (arrays[j]> arrays[j+1]){
                    int temp = arrays[j+1];
                    arrays[j+1] = arrays[j];
                    arrays[j] = temp;
                }
            }
        }
        for (int value :
                arrays) {
            System.out.println("value = " + value);
        }

        int [] arry = {20,45,78,34,16,3,99,56};
        int Big = 0; int Small = 0;
        for (int i=0;i < arry.length; i++){
            if (arry[i]>50) {
                Big++;
            } else if (arry[i] < 50) {
                Small++;
            }
        }
        for (int value1 : arry){
            System.out.println(value1+"\t");
        }
        System.out.println("********");
        System.out.println("大雨50的有"+Big);
        System.out.println("小于50的有"+Small);
    }
}
