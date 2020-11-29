package team.cms.result.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import team.cms.entity.enums.Role;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginResultData<T> {

    private String token;

    private String username;

    private Role role;

    private T detail;

}
