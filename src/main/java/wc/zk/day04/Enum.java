package wc.zk.day04;

/**
 * 枚举
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-27 10:51:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-27      zk           v1.0.0               新建
 **/
enum Color
{
    RED, GREEN, BLUE;
}
public class Enum {
    public static void main(String[] args) {
        Color myVar = Color.BLUE;

        switch(myVar) {
            case RED:
                System.out.println("红色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
        }
    }
}