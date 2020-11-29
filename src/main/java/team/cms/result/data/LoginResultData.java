package team.cms.result.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import team.cms.entity.User;
import team.cms.entity.enums.Role;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginResultData<T> {

    private String jwt;

    private String username;

    private Role role;

    private T detail;

}
