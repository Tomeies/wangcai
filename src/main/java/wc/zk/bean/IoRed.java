package wc.zk.bean;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 字节流输出
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-26 09:37:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-26      GongLe           v1.0.0               新建
 **/
public class IoRed {
    public static void main(String[] args)throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按下q结束");

        do {
            c = (char) br.read();
            System.out.println(c);
        }while (c!='q');

    }
}
