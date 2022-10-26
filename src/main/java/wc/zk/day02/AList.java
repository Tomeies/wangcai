package wc.zk.day02;

import java.util.*;

/**
 * 遍历ArrayList
 * 遍历map
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-26 14:59:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-26      zk           v1.0.0               新建
 **/
public class AList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("world");
        list.add("ZkZk");

        //第一种遍历方式： for-each 遍历 list
        for (String str : list){
            System.out.println(str);
        }

        //第二种遍历方式  将链表变为数组相关的内容进行遍历
        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

        //第三种方式： 使用迭代器进行相关遍历

        Iterator<String> ite = list.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }

        System.out.println("*********************************************");

        Map<String,String>map = new HashMap<String, String>();
        map.put("1","zk");
        map.put("2","zk1");
        map.put("3","zk3");

        //第一种  普遍使用的方法 二次取值
        System.out.println("通过map.keySet遍历键值对");
        for (String key : map.keySet()){
            System.out.println("key = " + key+"and value=" +map.get(key));
        }
        //第二种：
        System.out.println("通过map.entrySet使用迭代器遍历键值对");
        Iterator<Map.Entry<String,String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("key = " + entry.getKey()+"and value= "+ entry.getValue());
        }
        //第三种 大容量时使用
        System.out.println("通过map.entrySet遍历键值对");
        for (Map.Entry< String,String>entry : map.entrySet()){
            System.out.println("key = "+ entry.getKey() + "and value = "+entry.getValue());
        }
        //第四种
        System.out.println("通过map.values()遍历所有值，但不能遍历key");
        for (String v : map.values()){
            System.out.println("values = " + v);
        }
    }
}
