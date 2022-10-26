package wc.zk.day02;

import java.util.LinkedList;

/**
 * LinkedList的使用
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-26 15:47:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-26      zk           v1.0.0               新建
 **/
public class Link {
    public static void main(String[] args) {
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("zk");
        sites.add("good");
        sites.add("job");
        // 使用 addFirst() 在头部添加元素
        sites.addFirst("Hello");
        // 使用 addLast() 在尾部添加元素
        sites.addLast("ffff");
        // 使用 removeFirst() 移除头部元素
        sites.removeFirst();
        // 使用 removeLast() 移除尾部元素
        sites.removeLast();
        System.out.println(sites);
        // 使用 getFirst() 获取头部元素
        System.out.println(sites.getFirst());
        System.out.println(sites.contains("zk"));
    }
}
