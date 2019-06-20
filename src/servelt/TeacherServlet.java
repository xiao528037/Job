package servelt;

import entity.Teacher;
import service.impl.TeacherServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @ClassName TeacherServlet
 * @Description 类的描述
 * @Author 肖杰斌
 * @Date 2019/6/20 10:36
 * @Version 1.0
 */
@WebServlet("/teacherServlet")
public class TeacherServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        TeacherServiceImpl teacherService = new TeacherServiceImpl();
        List<Teacher> all = teacherService.getAll();
        req.setAttribute("list",all);
        req.getRequestDispatcher("/queryTeacher.jsp").forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doPost(req,resp);
    }
}
