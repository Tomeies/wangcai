package wc.zk.day05;

/**
 * 继承Thread类去创建线程
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-30 10:16:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-30      zk           v1.0.0               新建
 **/
public class ThreadDemo extends Thread{
    private Thread t;
    private String threadName;

    ThreadDemo(String name) {
        threadName = name;
        System.out.println("创建线程 = " + threadName);
    }
    public void run() {
        System.out.println("运行中 = " + threadName);
        for (int i = 4; i>0; i--){
            System.out.println("线程"+threadName + ","+i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("线程"+threadName + "中断了");
            }
            System.out.println("线程"+threadName + "退出了");
        }
    }
    public void start () {
        System.out.println("运行 " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}
