package servelt;

import entity.Teacher;
import service.impl.TeacherServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName GetTeacher
 * @Description 类的描述
 * @Author 肖杰斌
 * @Date 2019/6/20 11:56
 * @Version 1.0
 */
@WebServlet("/getTeacher")
public class GetTeacher extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String ids = req.getParameter("id");
        int id = Integer.parseInt(ids);
        Teacher teacher = new TeacherServiceImpl().getTeacher(id);
        req.setAttribute("teacher",teacher);
        req.getRequestDispatcher("/insertTeacher.jsp").forward(req,resp);
    }
}
