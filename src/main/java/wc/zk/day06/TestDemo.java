package wc.zk.day06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 集合框架
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-31 09:08:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-31      zk           v1.0.0               新建
 **/
public class TestDemo {
    public static void main(String[] args) {
        //获取一个数组的长度 直接点length方法就可以
        int[] arr = {
            1,9,5,6,7,3
        };
        int length = arr.length;
        System.out.println("length = " + length);

        //遍历List
        List<String> list = new ArrayList<String>();
        list.add("zk");
        list.add("like");
        list.add("money");
        list.add("crash");
        for (String str :list){
            System.out.println(str);
        }
        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for (int i = 0; i < strArray.length; i++){
            System.out.println(strArray[i]);
        }

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
