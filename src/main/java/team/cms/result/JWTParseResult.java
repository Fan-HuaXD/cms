package team.cms.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JWTParseResult<T> {

    private boolean success;

    private String message;

    private T data;
}
