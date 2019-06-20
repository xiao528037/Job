package servelt;

import dao.TeacherDao;
import service.impl.TeacherServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName deleteTeacher
 * @Description 类的描述
 * @Author 肖杰斌
 * @Date 2019/6/20 11:40
 * @Version 1.0
 */
@WebServlet("/deleteTeacher")
public class deleteTeacher extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        Integer integer = Integer.parseInt(id);
        new TeacherServiceImpl().deleteTeacher(integer);
        req.getRequestDispatcher("/teacherServlet").forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
