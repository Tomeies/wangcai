package wc.zk.bean;

/**
 * 对象和类
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-25 14:37:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-25      GongLe           v1.0.0               新建
 **/
public class Dog {
    int dogAge;
    public Dog(String name){
        System.out.println("gou的名字是"+name);
    }
    public void setAge(int age){
        dogAge = age;
    }
    public int getAge() {
        System.out.println("狗的年龄是："+dogAge);
        return dogAge;
    }
    public static void main(String[] args) {
        Dog dog = new Dog("张三");
        dog.setAge(20);
        dog.getAge();
        System.out.println(dog.dogAge);
    }
}
