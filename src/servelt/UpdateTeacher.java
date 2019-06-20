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
 * @ClassName UpdateTeacher
 * @Description 类的描述
 * @Author 肖杰斌
 * @Date 2019/6/20 12:06
 * @Version 1.0
 */
@WebServlet("/updateTeacher")
public class UpdateTeacher extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");

        String name = req.getParameter("name");
        String age = req.getParameter("age");
        int i1 = Integer.parseInt(age);
        Teacher teacher = new Teacher();

        teacher.setTeacher_name(name);
        teacher.setTeacher_age(i1);
        if (id != null && id!="") {
                int i = Integer.parseInt(id);
                teacher.setId(i);
            new TeacherServiceImpl().updateTeacher(teacher);
        } else {
            new TeacherServiceImpl().inserTeacher(teacher);
        }
        req.getRequestDispatcher("/teacherServlet").forward(req, resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
