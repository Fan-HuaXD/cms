package team.cms.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import team.cms.entity.Account;
import team.cms.entity.enums.Role;
import team.cms.result.Result;
import team.cms.result.data.LoginResultData;
import team.cms.service.*;
import team.cms.util.JsonWebTokenUtil;

import javax.annotation.Resource;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Resource
    AccountService accountService;

    @PostMapping("/submit")
    Result loginSubmit(Role role, String username, String password) {

        Account account = accountService.getAccountByUsername(username);

        LoginResultData data = new LoginResultData();

        if(account == null || !account.getPassword().equals(password) || account.getRole() != role) {
            data.setLoginSuccess(false);
        } else {
            data.setLoginSuccess(true);
            data.setToken(JsonWebTokenUtil.createJWT(account));
            data.setUsername(username);
            data.setRole(role);
        }

        return Result.wrapSuccessfulResult(data);
    }

}
