package www.wang.service;

import www.wang.pojo.User;

public interface UserService {
    //登录
    User login(String username);
    //注册
    int addUser(User user);
}
