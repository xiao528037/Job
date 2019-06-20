package dao;

import entity.Teacher;
import service.TeacherSevice;
import utils.JdbcCollection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TeacherDao
 * @Description 类的描述
 * @Author 肖杰斌
 * @Date 2019/6/20 9:54
 * @Version 1.0
 */
public class TeacherDao {

    public Teacher getTeacher(Integer id) {
        Teacher teacher = new Teacher();
        String sql="select * from teacher where id=?";
        Connection connection = JdbcCollection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
          while (resultSet.next()){
              teacher.setId(resultSet.getInt(1));
              teacher.setTeacher_name(resultSet.getString(2));
              teacher.setTeacher_age(resultSet.getInt(3));
          }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return teacher;
    }

    public List<Teacher> getAll() {
        List<Teacher> all=new ArrayList<>();
        String sql="select * from teacher";
        Connection connection = JdbcCollection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Teacher teacher = new Teacher();
                teacher.setId(resultSet.getInt(1));
                teacher.setTeacher_name(resultSet.getString(2));
                teacher.setTeacher_age(resultSet.getInt(3));
                all.add(teacher);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return all;
    }


    public void inserTeacher(Teacher teacher) {
        String sql="insert into teacher (teacher_name,teacher_age) values (?,?)";
        Connection connection = JdbcCollection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,teacher.getTeacher_name());
            preparedStatement.setInt(2,teacher.getTeacher_age());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void updateTeacher(Teacher teacher) {
        String sql="update  teacher set teacher_name=?,teacher_age=? where id=? ";
        Connection connection = JdbcCollection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,teacher.getTeacher_name());
            preparedStatement.setInt(2,teacher.getTeacher_age());
            preparedStatement.setInt(3,teacher.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteTeacher(Integer id) {
        Teacher teacher = new Teacher();
        String sql="delete  from teacher where id=?";
        Connection connection = JdbcCollection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
