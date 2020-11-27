package team.cms.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {

    private boolean success;

    private int code;

    private String message;

    private T data;

    public static <T> Result<T> wrapSuccessfulResult(T data) {
        Result<T> result = new Result<>();
        result.setSuccess(true);
        result.setCode(0);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> wrapSuccessfulResult(String message, T data) {
        Result<T> result = new Result<>();
        result.setSuccess(true);
        result.setCode(0);
        result.setMessage(message);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> wrapErrorResult(int code, String message) {
        Result<T> result = new Result<>();
        result.success = false;
        result.code = code;
        result.message = message;
        return result;
    }
}
