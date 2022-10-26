package wc.zk.day02;

import java.util.ArrayList;

/**
 * ArrayList的一些使用
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-26 15:38:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-26      zk           v1.0.0               新建
 **/
public class Arr {
    public static void main(String[] args) {
        //添加操作
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("zk");
        arr.add("good");
        arr.add("job");
        System.out.println(arr);

        System.out.println("****************************");
        //访问操作 某一个元素
        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add("my name：zk");
        arr1.add("good");
        arr1.add("job");
        System.out.println(arr1.get(2));
        System.out.println("****************************");

        //修改操作 删除 数组大小
        ArrayList<String> arr2 = new ArrayList<String>();
        arr2.add("zk");
        arr2.add("good");
        arr2.add("job");
        arr2.add("nice");
        arr2.set(2,"bkK");
        arr2.remove(0);
        System.out.println(arr2);
        System.out.println(arr2.size());
    }
}
