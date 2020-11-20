package team.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import team.cms.entity.User;
import team.cms.entity.enums.Role;
import team.cms.service.UserService;

import javax.annotation.Resource;
import java.sql.Date;

@Controller
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("/register")
    public String register(Model model) {
        return "register";
    }

    @RequestMapping("/register/submit")
    public String registerSubmit(User user) {
        userService.addUser(user);
        return "redirect:/login";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
