package wc.zk.day05;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列的用法
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-30 15:23:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-30      zk           v1.0.0               新建
 **/
public class QueueDemo {
    public static void main(String[] args) {
        //add()添加和删除remove方法在失败的时候就会抛出异常
        Queue<String> queue = new LinkedList<String>();
        //添加元素
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        for (String q: queue){
            System.out.println(q);
        }
        System.out.println("****");
        //返回第一个元素，并在队列中删除
        System.out.println("poll="+queue.poll());
        for (String q : queue){
            System.out.println(q);
        }
        System.out.println("****");
        //返回第一个元素
        System.out.println("元素="+queue.element());
        for (String q : queue) {
            System.out.println(q);
        }
        System.out.println("****");
        System.out.println("peek="+queue.peek());
        for (String q : queue) {
            System.out.println(q);
        }
    }
}
