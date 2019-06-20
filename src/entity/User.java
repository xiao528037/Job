package entity;

/**
 * @ClassName User
 * @Description 类的描述
 * @Author 肖杰斌
 * @Date 2019/6/20 9:46
 * @Version 1.0
 */
public class User {
    private String username;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
