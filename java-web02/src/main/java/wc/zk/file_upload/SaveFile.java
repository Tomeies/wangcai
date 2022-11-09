package wc.zk.file_upload;

/**
 * 该类的功能描述
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-11-09 17:42:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-11-09      zk           v1.0.0               新建
 **/
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
@MultipartConfig
@WebServlet("/filesave")
public class SaveFile extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Part file = req.getPart("file");
//        获得文件的名称
        String submittedFileName = file.getSubmittedFileName();
//        把文件复制到一指定路径
//        System.out.println(submittedFileName);
//        String filename = "D:\\A\\" + submittedFileName;
//        System.out.println(filename);
//        直接调用writ方法，保存到本地
//        file.write(filename);


//        把绝对路径替换成运行时路径，直接根据运行时路径就可以访问到该资源，就是复制到webapp下
        String realPath = req.getServletContext().getRealPath("/upload");
        System.out.println(realPath);
        new File(realPath).mkdirs();
        String path2 = realPath + "\\" + submittedFileName;
        file.write(path2);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        System.out.println("doPost");
    }
}

