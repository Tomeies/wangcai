package wc.zk.day02;

/**
 * 实现类
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-26 10:37:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-26      GongLe           v1.0.0               新建
 **/
public class ZkImpl implements zk{
    @Override
    public void fun() {
        System.out.println("fun");
    }

    @Override
    public void dance() {
        System.out.println("dance");
    }

    public static void main(String[] args) {
        ZkImpl zk = new ZkImpl();
        zk.fun();
        zk.dance();
    }
}
