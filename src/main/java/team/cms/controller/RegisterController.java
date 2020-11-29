package team.cms.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import team.cms.result.Result;

@RestController
@RequestMapping("/register")
public class RegisterController {

    @RequestMapping("/checkUsername")
    Result checkUsername(String username) {
        return null;
    }

    @PostMapping("/submit")
    Result register() {
        return null;
    }
}
