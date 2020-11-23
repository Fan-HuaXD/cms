package team.cms.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {

    private boolean success;

    private Integer code;

    private String message;

    private T data;

    public static <T> Result<T> wrapSuccessfulResult(T data) {
        Result<T> result = new Result<T>();
        result.data = data;
        result.success = true;
        result.code = 0;
        return result;
    }

    public static <T> Result<T> wrapSuccessfulResult(String message, T data) {
        Result<T> result = new Result<T>();
        result.data = data;
        result.success = true;
        result.code = 0;
        result.message = message;
        return result;
    }


    public static <T> Result<T> wrapErrorResult(Integer code, String message) {
        Result<T> result = new Result<T>();
        result.success = false;
        result.code = code;
        result.message = message;
        return result;
    }
}
