package team.cms.interceptor;

import com.alibaba.fastjson.JSON;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import team.cms.entity.enums.Role;
import team.cms.result.Result;
import team.cms.result.ResultCode;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@Configuration
public class UserInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        Role role = (Role) request.getAttribute("role");

        if (role == Role.USER) {
            return true;
        } else {
            response.setContentType("text/json");
            PrintWriter out = response.getWriter();
            out.println(JSON.toJSONString(Result.wrapErrorResult(ResultCode.HTTP_FORBIDDEN, "无访问权限")));
            return false;
        }
    }
}
