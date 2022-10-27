package wc.zk.day03;

/**
 * if...else语句
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-27 10:00:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-27      zk           v1.0.0               新建
 **/
public class IfAndElse {
    public static void main(String[] args) {
        int x = 30;

        if (x<10){
            System.out.println("if正确");
        }else if (x>40){
            System.out.println("else if正确");
        }else if (x >10) {
            System.out.println("第二个else if正确");
        }else {
            System.out.println("else正确");
        }
    }
}
