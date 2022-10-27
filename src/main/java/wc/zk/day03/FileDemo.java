package wc.zk.day03;

import java.io.File;

/**
 * java中的目录
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-27 16:18:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-27      zk           v1.0.0               新建
 **/
public class FileDemo {
    public static void main(String[] args) {
        String dirName = "D:\\bin";
        File d = new File(dirName);

        d.mkdirs();
    }
}
