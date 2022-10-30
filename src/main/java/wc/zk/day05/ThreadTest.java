package wc.zk.day05;

/**
 * thread测试类
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-30 10:44:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-30      zk           v1.0.0               新建
 **/
public class ThreadTest {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo("线程一");
        t1.start();
        ThreadDemo t2 = new ThreadDemo("线程二");
        t2.start();
    }
}
