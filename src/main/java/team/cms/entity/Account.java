package team.cms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import team.cms.entity.enums.Role;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    private Integer id;

    private String username;

    private String password;

    private Role role;

}
