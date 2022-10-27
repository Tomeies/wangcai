package wc.zk.day03;

/**
 * switch case 的案例
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-27 10:12:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-27      zk           v1.0.0               新建
 **/
public class SwitchAndCase {
    public static void main(String[] args) {
        char  grade = 'C';
        switch(grade){
            case 'A' :
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("还行");
                break;
            case 'C' :
                System.out.println("良好");
                break;
            case 'D' :
                System.out.println("拜拜");
                break;
                default :
                    System.out.println("没交");
        }
        System.out.println("你的评价："+grade);
        System.out.println("****************************");

        int a = 2;
        switch (a){
            case 0 :
                System.out.println("0");
                break;
            case 1 :
                System.out.println("1");
                break;
            case 2 :
                System.out.println("4");
                break;
            default:
                System.out.println("数值过大");
                break;
        }
    }
}
