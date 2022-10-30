package wc.zk.day05;

/**
 * runnable测试类
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-30 10:12:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-30      zk           v1.0.0               新建
 **/
public class RunnableTest {
    public static void main(String[] args) {
        RunnableDemo r = new RunnableDemo("线程一");
        r.start();

        RunnableDemo r1 = new RunnableDemo("线程二");
        r1.start();
    }
}
