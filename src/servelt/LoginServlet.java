package servelt;

import entity.User;
import service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName LoginServlet
 * @Description 类的描述
 * @Author 肖杰斌
 * @Date 2019/6/20 10:18
 * @Version 1.0
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        UserServiceImpl userService = new UserServiceImpl();
        User user = userService.getUser(username, password);
        if (user.getUsername()!= null) {
            req.getRequestDispatcher("/teacherServlet").forward(req, resp);
        } else {
            resp.getWriter().write("Incorrect username or password。");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
