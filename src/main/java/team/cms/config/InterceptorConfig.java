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
                .addPathPatterns("/api/user/**")
                .addPathPatterns("/api/conference/**")
                .addPathPatterns("/api/admin/**")
                .addPathPatterns("/api/hotel/**")
                .addPathPatterns("/api/driver/**");

        registry.addInterceptor(new UserInterceptor())
                .addPathPatterns("/api/user/**")
                .addPathPatterns("/api/conference/**");

        registry.addInterceptor(new AdminInterceptor())
                .addPathPatterns("/api/admin/**");

        registry.addInterceptor(new HotelInterceptor())
                .addPathPatterns("/api/hotel/**");

        registry.addInterceptor(new DriverInterceptor())
                .addPathPatterns("/api/driver/**");
    }
}
