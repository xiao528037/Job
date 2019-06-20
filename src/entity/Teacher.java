package entity;

/**
 * @ClassName TeacherSevice
 * @Description 类的描述
 * @Author 肖杰斌
 * @Date 2019/6/20 9:28
 * @Version 1.0
 */
public class Teacher {
    private int id;
    private String teacher_name;
    private int teacher_age;

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public int getTeacher_age() {
        return teacher_age;
    }

    public void setTeacher_age(int teacher_age) {
        this.teacher_age = teacher_age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", teacher_name='" + teacher_name + '\'' +
                ", teacher_age=" + teacher_age +
                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
