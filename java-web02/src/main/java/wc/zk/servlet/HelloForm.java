package wc.zk.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * servlet表单数据
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-11-09 11:01:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-11-09      zk           v1.0.0               新建
 **/
@WebServlet("/HelloForm")
public class HelloForm extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public HelloForm() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应内容类型
        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter out = resp.getWriter();
        String title = "使用GET方法读取表单数据";
        //处理中文
        String name = new String(req.getParameter("name").getBytes("ISO-8859-1"), "UTF-8");
        String docType = "<!DOCTYPE html> \n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<ul>\n" +
                "  <li><b>站点名</b>："
                + name + "\n" +
                "  <li><b>网址</b>："
                + req.getParameter("url") + "\n" +
                "</ul>\n" +
                "</body></html>");
    }
    //处理post方法请求的方法

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
