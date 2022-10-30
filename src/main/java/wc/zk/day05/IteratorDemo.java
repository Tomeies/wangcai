package wc.zk.day05;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 迭代器
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-30 11:49:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-30      zk           v1.0.0               新建
 **/
public class IteratorDemo {
    //集合中使用迭代器去输出集合中的第一个元素
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("zk");
        arr.add("good");
        arr.add("job");

        //获取迭代器
        Iterator<String> it = arr.iterator();
        //去输出第一个元素
        System.out.println(it.next());
        //循环输出所有元素
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        ArrayList<Integer> num= new ArrayList<Integer>();
        num.add(12);
        num.add(4);
        num.add(5);
        num.add(55);
        Iterator<Integer> it1 = num.iterator();
        while (it1.hasNext()) {
            Integer i = it1.next();
            if (i<10){
                it1.remove();
            }
        }
        System.out.println("num = " + num);
    }
}
