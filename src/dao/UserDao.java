package dao;

import entity.Teacher;
import entity.User;
import utils.JdbcCollection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ClassName UserDao
 * @Description 类的描述
 * @Author 肖杰斌
 * @Date 2019/6/20 9:54
 * @Version 1.0
 */
public class UserDao {
    /**
     * 功能待完善
     */
    public User getUser(String username, String password) {
        User user = new User();
        String sql="select * from job_user where username=? and password=?";
        Connection connection = JdbcCollection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                user.setUsername(resultSet.getString(1));
                user.setPassword(resultSet.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
