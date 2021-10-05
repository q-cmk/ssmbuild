package www.wang.dao;

import www.wang.pojo.User;

public interface UserMapper {
    //登录
    User login(String username);
    //注册
    int addUser(User user);
}
