package service.impl;

import dao.TeacherDao;
import dao.UserDao;
import entity.User;
import org.junit.Test;
import service.UserService;

/**
 * @ClassName UserServiceImpl
 * @Description 类的描述
 * @Author 肖杰斌
 * @Date 2019/6/20 9:51
 * @Version 1.0
 */
public class UserServiceImpl implements UserService {

   UserDao dao= new UserDao();
   @Test
   public void test(){
       System.out.println(dao.getUser("123","123"));
    }
    public User getUser(String username, String password) {
       return dao.getUser(username,password);
    }

    @Override
    public User getUser() {
        return null;
    }

    @Override
    public void inserUser() {

    }

    @Override
    public void updateUser() {

    }

    @Override
    public void deleteUser() {

    }
}
