package wc.zk.bean;

/**
 * 继承
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-26 09:43:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-26      GongLe           v1.0.0               新建
 **/
public class ExTen {
    void eat(){
        System.out.println("吃东西");
    }
}
class User1 extends ExTen{
    void eat() {
        System.out.println("不吃了");
    }
}
