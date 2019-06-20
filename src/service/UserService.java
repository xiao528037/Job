package service;

import entity.User;

/**
 * @ClassName UserServiceImpl
 * @Description 接口的描述
 * @Author 肖杰斌
 * @Date 2019/6/20 9:45
 * @Version 1.0
 */
public interface UserService {
    public User getUser(String username, String password);
    public User getUser();
    public void inserUser();
    public void updateUser();
    public void deleteUser();
}
