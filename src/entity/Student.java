package entity;

/**
 * @ClassName Student
 * @Description 类的描述
 * @Author 肖杰斌
 * @Date 2019/6/20 9:27
 * @Version 1.0
 */
public class Student {
    private int id;
    private String student_name;
    private int sutdent_age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public int getSutdent_age() {
        return sutdent_age;
    }

    public void setSutdent_age(int sutdent_age) {
        this.sutdent_age = sutdent_age;
    }
}
