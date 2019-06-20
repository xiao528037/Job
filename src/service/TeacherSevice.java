package service;

import entity.Teacher;

import java.util.List;

/**
 * @ClassName TeacherSevice
 * @Description 接口的描述
 * @Author 肖杰斌
 * @Date 2019/6/20 9:50
 * @Version 1.0
 */
public interface TeacherSevice {
    public Teacher getTeacher(Integer id);
    public List<Teacher> getAll();
    public void inserTeacher(Teacher teacher);
    public void updateTeacher(Teacher teacher);
    public void deleteTeacher(Integer id);
}
