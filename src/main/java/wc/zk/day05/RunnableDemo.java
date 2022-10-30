package wc.zk.day05;

/**
 * 线程的实例 通过实现runnable接口重写run方法创建线程
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-30 09:58:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-30      zk           v1.0.0               新建
 **/
public class RunnableDemo implements Runnable{
    private Thread t;
    private String threadName;

    RunnableDemo(String name){
        threadName = name;
        System.out.println("创建线程"+threadName);
    }
    @Override
    public void run() {
        System.out.println("运行" + threadName);
        for (int i = 4; i > 0; i--) {
            System.out.println("线程: " + threadName + ", " + i);
            //休眠 sleep
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("线程" + threadName + "中断了");
            }
            System.out.println("线程" + threadName + "结束了");
        }
        //开始线程
    }
    public void start(){
        System.out.println("开始线程"+threadName);
        if (t==null){
            t=new Thread(this,threadName);
            t.start();
        }
    }
}

