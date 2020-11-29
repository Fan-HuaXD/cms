package team.cms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import team.cms.entity.Account;
import team.cms.entity.enums.Role;
import team.cms.result.Result;
import team.cms.result.data.LoginResultData;
import team.cms.service.AccountService;
import team.cms.util.JsonWebTokenUtil;

import javax.annotation.Resource;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Resource
    AccountService accountService;

    @Resource

    @RequestMapping(method = RequestMethod.POST)
    Result  login(Role role, String password, String username) {
        Account account = accountService.getAccountByUsername(username);
        if(account == null || account.getPassword().equals(password) || account.getRole() != role) {
            return Result.wrapSuccessfulResult("用户名或密码错误！", null);
        } else {
            LoginResultData data = new LoginResultData();
            data.setJwt(JsonWebTokenUtil.createJWT(account));
            data.setUsername(account.getUsername());
            data.setRole(role);

//            return Result.wrapSuccessfulResult("密码正确！", )
        }
        return null;
    }

}
