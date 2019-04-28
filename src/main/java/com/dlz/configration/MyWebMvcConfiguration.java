package com.dlz.configration;

import com.dlz.interceptor.SomeInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * <p> Package: com.dlz.configration </p>
 * <p> Description: (用一句话描述该文件做什么) </p>
 *
 * @author lizhi_duan
 * @version 1.0
 * @date 2019/4/28 15:24
 */
@Configuration
public class MyWebMvcConfiguration extends WebMvcConfigurationSupport {
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        SomeInterceptor interceptor = new SomeInterceptor();
        registry.addInterceptor(interceptor)
                .addPathPatterns("/first/**")//拦截first开头的路径
                .excludePathPatterns("second/**");//不拦截second开头的路径
    }
}
