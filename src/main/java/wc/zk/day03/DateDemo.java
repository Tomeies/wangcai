package wc.zk.day03;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * date时间类
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-27 15:22:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-27      zk           v1.0.0               新建
 **/
public class DateDemo {
    public static void main(String[] args) {
        //获取当前时间
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        System.out.println("当前时间是:"+sdf.format(date));
    }
}
