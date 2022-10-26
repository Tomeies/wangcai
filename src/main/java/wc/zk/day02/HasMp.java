package wc.zk.day02;

import java.util.HashMap;

/**
 * HashMap的一些使用
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-26 16:36:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-26      zk           v1.0.0               新建
 **/
public class HasMp {
    public static void main(String[] args) {
        HashMap<Integer,String> hasMp = new HashMap<Integer,String>();
        //添加键值对
        hasMp.put(1,"zk");
        hasMp.put(2, "a1");
        hasMp.put(3, "b2");
        hasMp.put(4, "c3");
        System.out.println("hasMp = " + hasMp);
        //获取某个元素
        System.out.println(hasMp.get(3));
        //删除某个元素
        hasMp.remove(2);
        System.out.println(hasMp);
        //删除集合中所有键值对的方法
//        hasMp.clear();
        //计算数组大小
        System.out.println(hasMp.size());
        //迭代hashmap
        for (Integer i : hasMp.keySet()){
            System.out.println("key:"+ i +"value: "+hasMp.get(i));
        }
        //返回所有的value的值
        for (String value : hasMp.values()){
            System.out.print(value+",");
        }
    }
}
