package service;

import entity.Student;
import entity.Student;

import java.util.List;

/**
 * @ClassName StudentService
 * @Description 接口的描述
 * @Author 肖杰斌
 * @Date 2019/6/20 9:48
 * @Version 1.0
 */
public interface StudentService {
    public Student getStudent();
    public List<Student> getAll();
    public void inserStudent(Student student);
    public void updateStudent(Student student);
    public void deleteStudent(Integer id);
}
