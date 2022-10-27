package wc.zk.day03;

import java.io.*;

/**
 * java流、文件和IO
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-27 15:51:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-27      zk           v1.0.0               新建
 **/
public class StreamDemo {
    public static void main(String[] args) throws IOException{
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按下z退出程序");
        do {
            c = (char) br.read();
            System.out.print(c);
        }while (c!='Z');
        System.out.println("*******************");

        String str;
        System.out.println("输入一行文字");
        System.out.println("输入end结束");
        do {
            str = br.readLine();
            System.out.println(str);
        }while (!str.equals("end"));
        try {
            byte bWrite[] = {11,21,3,40,5};
            OutputStream os = new FileOutputStream("text.txt");
            for (int x = 0; x< bWrite.length; x++){
                os.write(bWrite[x]);
            }
            os.close();
            InputStream is  = new FileInputStream("text.txt");
            int size = is.available();

            for (int i = 0; i < size; i++) {
                System.out.println((char) is.read()+ "  ");
            }
            is.close();
        } catch (IOException e) {
            System.out.println("Exception");
        }
    }
}
