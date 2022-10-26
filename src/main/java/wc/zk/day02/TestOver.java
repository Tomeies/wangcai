package wc.zk.day02;

/**
 * 重写父类
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-26 09:50:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-26      GongLe           v1.0.0               新建
 **/
public class TestOver {
    public static void main(String[] args) {
        OverRide o = new OverRide();
        OverRide o1 = new Over();

        o.go();
        o1.go();
    }
}
