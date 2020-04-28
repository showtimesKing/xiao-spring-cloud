package com.xiao.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@Profile({"dev", "test"})
public class SwaggerConfig {

    @Value("${spring.profiles.active}")
    private String active;

    @Bean
    public Docket api() {
        //String host = "dev".equals(active) ? null : "";
        return new Docket(DocumentationType.SWAGGER_2)
                .host(null)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.xiao.controller"))
                .paths(PathSelectors.any())
                .build();
    }
}