package com.hrban.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        //设置属性
        //允许跨域请求的地址，*表示所有
        corsConfiguration.addAllowedOrigin("*");
        //配置跨域的请求头
        corsConfiguration.addAllowedHeader("*");
        //配置跨域的请求方法
        corsConfiguration.addAllowedMethod("*");
        //表示跨域请求时是否使用同一个session
        corsConfiguration.setAllowCredentials(true);

        return corsConfiguration;
    }

    @Bean
    public CorsFilter corsFilter() {
        //TODO：SpringBoot 自动装配原理？？？
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**",buildConfig());
        return new CorsFilter(source);
    }
}
