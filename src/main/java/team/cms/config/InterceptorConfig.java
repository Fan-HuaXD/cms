package team.cms.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import team.cms.interceptor.*;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new VisitorInterceptor())
                .addPathPatterns("/user/**")
                .addPathPatterns("/conference/**")
                .addPathPatterns("/admin/**")
                .addPathPatterns("/hotel/**")
                .addPathPatterns("/driver/**");

        registry.addInterceptor(new UserInterceptor())
                .addPathPatterns("/user/**")
                .addPathPatterns("/conference/**");

        registry.addInterceptor(new AdminInterceptor())
                .addPathPatterns("/admin/**");

        registry.addInterceptor(new HotelInterceptor())
                .addPathPatterns("/hotel/**");

        registry.addInterceptor(new DriverInterceptor())
                .addPathPatterns("/driver/**");
    }
}
