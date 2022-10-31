package wc.zk.day06;

import java.util.*;

/**
 * List集合实例 遍历HashTable的键值
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-31 17:14:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-31      zk           v1.0.0               新建
 **/
public class ListDemo {
    //使用Collections类中的rotate方法循环移动元素
    public static void main(String[] args) {
        List list = Arrays.asList("1,2,3,4,5,6".split(" "));
        System.out.println("List:"+list);
        Collections.rotate(list,2);
        System.out.println("rotate = " + list);
        //list元素替换
        Collections.replaceAll(list,"one","hundrea");
        System.out.println("list = " + list);

        Hashtable ht = new Hashtable();
        ht.put("1","one");
        ht.put("2", "tow");
        ht.put("3","three");
        Enumeration e = ht.keys();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
