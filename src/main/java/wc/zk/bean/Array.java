package wc.zk.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 数组  时间格式
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-25 15:33:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-25      GongLe           v1.0.0               新建
 **/
public class Array {
    public static void main(String[] args) {
        // 数组大小
        int size = 10;
        // 定义数组
        double[] myList = new double[size];
        myList[0] = 5.6;
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;
        myList[5] = 34.33;
        myList[6] = 34.0;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 11123;
        // 计算所有元素的总和
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += myList[i];
        }
        System.out.println("总和为： " + total);
        //创建时间对象
        Date date = new Date();
        //toString转换
        System.out.println(date.toString());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh：mm:ss");

        System.out.println("当前时间是："+sdf.format(date));
    }
}