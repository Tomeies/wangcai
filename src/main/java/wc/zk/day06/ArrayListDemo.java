package wc.zk.day06;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 该类的功能描述
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
public class ArrayListDemo {
    public static void main(String[] args) {
//        //创建集合对象
        ArrayList<Student> array = new ArrayList<Student>();
//        //从键盘输入学生对象需要的数据
//        Scanner sc = new Scanner(System.in);
//        System.out.println("输入学生姓名");
//        String name = sc.nextLine();
//        System.out.println("请输入学生年龄");
//        String age = sc.nextLine();
//
//        //创建学生对象
//        Student s = new Student();
//        s.setAge("65");
//        s.setName("mike");
//        array.add(s);
        addStudent(array);
        addStudent(array);
        addStudent(array);
        for (int i =0;i<array.size(); i++){
            Student s = array.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }
    }
    public static void addStudent(ArrayList<Student> array){
        //从键盘输入学生对象需要的数据
        Scanner sc = new Scanner(System.in);
        System.out.println("输入学生姓名");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄");
        String age = sc.nextLine();

        //创建学生对象
//        Student s = new Student();
//        s.setAge("65");
//        s.setName("mike");
//        array.add(s);
    }
}
