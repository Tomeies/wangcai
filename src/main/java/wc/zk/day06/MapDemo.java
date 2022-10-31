package wc.zk.day06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * map的遍历方式
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-31 10:32:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-31      zk           v1.0.0               新建
 **/
public class MapDemo {
    public static void main(String[] args) {
        Map<String,String>map= new HashMap<String, String>();
        map.put("1","value1");
        map.put("2", "value2");
        map.put("3","value3");
        System.out.println("通过map.keySet遍历键值对");
        for (String key : map.keySet()) {
            System.out.println("键="+key+"值="+map.get(key));
        }
        System.out.println("**************************");

        System.out.println("通过Map.entrySet使用iterator遍历key和value：");
        Iterator<Map.Entry<String,String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("key="+entry.getKey()+"value="+entry.getValue());
        }
        System.out.println("****************************");
        System.out.println("通过Map.entry遍历key和value");
        for (Map.Entry< String,String>entry : map.entrySet()){
            System.out.println("key="+entry.getKey() + "value="+entry.getValue());
        }
        System.out.println("****************************");
        System.out.println("通过map.values遍历所有的value 但是不能遍历key");
        for (String value : map.values()){
            System.out.println("value="+value);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段字符串");
        String lines = sc.nextLine();
    }
}
