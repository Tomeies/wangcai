package wc.zk.file_upload;

/**
 * 该类的功能描述
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-11-09 17:41:00
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
import java.io.IOException;
import java.io.InputStream;

//读取的是文件，必须加这个注释，否则会保500错误
@MultipartConfig
@WebServlet("/upload")
public class UploadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        其他数据还可以跟之前一样正常读，当然，也可以用req.getPart读
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username);
        System.out.println(password);
//        读取文件
        Part file = req.getPart("file");
        System.out.println(file.getName());
//        输出文件内容
        InputStream inputStream = file.getInputStream();
        byte[] buf = new byte[1024];
        int n = inputStream.read(buf);
        String s = new String(buf,0,n,"utf-8");
        System.out.println(s);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        System.out.println("doPost");
    }
}

