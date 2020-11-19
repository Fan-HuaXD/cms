package team.cms.entity;

import lombok.Data;
import team.cms.entity.enums.Role;

import java.sql.Date;

@Data
public class User {
    private int id;
    private String userName;
    private String passWord;
    private Date birthday;
    private String telephone;
    private String email;
    private Role role;
}
