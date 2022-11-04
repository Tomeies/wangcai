package wc.zk.excelToJson;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.*;

/**
 * 该类的功能描述
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-11-02 22:02:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-11-02      zk           v1.0.0               新建
 **/
public class ExcelToJson {

    public static void main(String[] args) throws IOException {

        Workbook workbook;
        Sheet sheet;
        Cell cell1,cell2,cell3,cell4,cell5,cell6,cell7,cell8,cell9,cell10;
        JSONArray jsons = new JSONArray();

        try {
            //获取一个Excel文件  只支持.xls格式
            workbook = Workbook.getWorkbook(new File( "D:\\用户信息.xls"));
            //获取文件里的某个表  从0开始
            sheet = workbook.getSheet(0);

            for(int i = 1; i < sheet.getRows(); i++) {
                //循环读出每一数据格的数据
                //sheet.getCell(列，行);
                cell1 = sheet.getCell(0 , i);
                cell2 = sheet.getCell(1 , i);
                cell4 = sheet.getCell(3 , i);
                cell3 = sheet.getCell(2 , i);
                cell5 = sheet.getCell(4 , i);
                cell6 = sheet.getCell(5 , i);
                cell7 = sheet.getCell(6 , i);
                cell8 = sheet.getCell(7 , i);
                cell9 = sheet.getCell(8 , i);
                cell10 = sheet.getCell(9, i);

                //每一行创建一个JSONObject对象
                JSONObject object = new JSONObject();
                object.put("user_id", cell1.getContents());
                object.put("yhdm", cell2.getContents());
                object.put("yhxm", cell3.getContents());
                object.put("sj", cell4.getContents());
                object.put("zjlx", cell5.getContents());
                object.put("优化比", cell6.getContents());
                object.put("sfz", cell7.getContents());
                object.put("created_by", cell8.getContents());
                object.put("created_by_login_name", cell9.getContents());
                object.put("created_by_date", cell10.getContents());

                //加入json队列
                jsons.add(object);
            }
            //对队列进行输出或者其他操作
            System.out.println(jsons.toJSONString());
            workbook.close();
        } catch (BiffException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        BufferedWriter writer = new BufferedWriter(new FileWriter("json.txt"));
//        for (Object s : jsons) {
//            writer.write((Integer) s);
//            writer.newLine();
//            writer.flush();
//        }
//        for (int i = 0; i <jsons.size(); i++){
//            Object s = jsons.get(i);
//
//            writer.write((Integer) s);
//
//            if (i != jsons.size() - 1){
//                writer.newLine();
//            }
//            writer.flush();
//        }
//        writer.close();
        File file = new File("D:/","word.txt");
        try {
            if (!file.exists()) {//如果文件不存在则新建文件

                file.createNewFile();

            }
            FileOutputStream output = new FileOutputStream(file);
            byte[] bytes = "Java数据交流管道——IO流".getBytes();
//            Object s = jsons;
            output.write(bytes);//将数组的信息写入文件中
            output.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block

            e.printStackTrace();

        }
    }
}