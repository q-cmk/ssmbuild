package www.wang.service;

import www.wang.dao.BookMapper;
import www.wang.dao.UserMapper;
import www.wang.pojo.User;

public class UserServicesImpl implements UserService{
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User login(String username) {
        return userMapper.login(username);
    }

    public int addUser(User user) {
        return userMapper.addUser(user);
    }
}
