package wc.zk.day05;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 打乱集合的顺序
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-30 16:28:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-30      zk           v1.0.0               新建
 **/
public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(new Integer(i));
            System.out.println("打印前:"+list);

            for (int j = 1; j < 6; j++) {
                System.out.println("第"+i+"次打乱之后的顺序");
                Collections.shuffle(list);
                System.out.println("list = " + list);
            }
        }
    }
}
