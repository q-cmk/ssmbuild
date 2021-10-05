package www.wang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import www.wang.pojo.User;
import www.wang.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;

    @RequestMapping("/toLogin")
    public String toLogin(){
      return "Login";
    }
    @RequestMapping("/Login")
    public String login(String username,String password){
        System.out.println(username);
        User login = userService.login(username);
        if (login.getPassword().equals(password)){
            System.out.println("登录成功");
            return "sucessUser";
        }
        return "failUser";
    }

    @RequestMapping("toRegister")
    public String toRegister(){
        return "Register";
    }
    @RequestMapping("Register")
    public String register(User user){
        System.out.println(user);
        userService.addUser(user);
        return "redirect:/user/toLogin";
    }
}
