package service.impl;

import dao.TeacherDao;
import entity.Teacher;
import org.junit.Test;
import service.TeacherSevice;

import java.util.List;

/**
 * @ClassName TeacherServiceImpl
 * @Description 类的描述
 * @Author 肖杰斌
 * @Date 2019/6/20 9:52
 * @Version 1.0
 */
public class TeacherServiceImpl implements TeacherSevice {

    @Test
    public void test(){
        Teacher teacher = getTeacher(1);
        System.out.println(teacher);
    }
    TeacherDao dao=new TeacherDao();
    @Override
    public Teacher getTeacher(Integer id) {
        return dao.getTeacher(id);
    }

    @Override
    public List<Teacher> getAll() {
        return dao.getAll();
    }

    @Override
    public void inserTeacher(Teacher teacher) {
        dao.inserTeacher(teacher);
    }

    @Override
    public void updateTeacher(Teacher teacher) {
        dao.updateTeacher(teacher);
    }

    @Override
    public void deleteTeacher(Integer id) {
        dao.deleteTeacher(id);
    }
}
