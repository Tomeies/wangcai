package wc.zk.day06;

/**
 * 学生类
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-31 11:41:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-31      zk           v1.0.0               新建
 **/
public class Student {
    private String name;
    private String age;
    public Student(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
