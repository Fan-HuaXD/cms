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

    @Resource
    UserService userService;

    @Resource
    AdminService adminService;

    @Resource
    HotelService hotelService;

    @Resource
    DriverService driverService;

    @PostMapping("/submit")
    Result loginSubmit(Role role, String username, String password) {

        Account account = accountService.getAccountByUsername(username);

        if(account == null || !account.getPassword().equals(password) || account.getRole() != role) {
            return Result.wrapSuccessfulResult("用户名或密码错误！", null);
        } else {
            LoginResultData data = new LoginResultData();
            data.setToken(JsonWebTokenUtil.createJWT(account));
            data.setUsername(username);
            data.setRole(role);
            switch (role) {
                case USER:
                    data.setDetail(userService.getUserByAccountId(account.getId()));
                    break;
                case ADMIN:
                    data.setDetail(adminService.getAdminByAccountId(account.getId()));
                    break;
                case HOTEL:
                    data.setDetail(hotelService.getHotelByAccountId(account.getId()));
                    break;
                case DRIVER:
                    data.setDetail(driverService.getDriverByAccountId(account.getId()));
                    break;
            }
            return Result.wrapSuccessfulResult(data);
        }
    }

}
