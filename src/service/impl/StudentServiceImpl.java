package service.impl;

import dao.StudentDao;
import entity.Student;
import service.StudentService;

import java.util.List;

/**
 * @ClassName StudentServiceImpl
 * @Description 类的描述
 * @Author 肖杰斌
 * @Date 2019/6/20 9:53
 * @Version 1.0
 */
public class StudentServiceImpl implements StudentService {
private StudentDao dao=new StudentDao();

    @Override
    public Student getStudent() {
        return dao.getStudent();
    }

    @Override
    public List<Student> getAll() {
        return dao.getAll();
    }

    @Override
    public void inserStudent(Student stu) {
        dao.inserStudent(stu);
    }

    @Override
    public void updateStudent(Student student) {
    dao.updateStudent(student);
    }

    @Override
    public void deleteStudent(Integer id) {
        dao.deleteStudent(id);

    }
}
