package team.cms.result;

import io.jsonwebtoken.Claims;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TokenCheckResult {

    private boolean success;

    private Integer code;

    private String message;

    private Claims claims;
}
