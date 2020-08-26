package com.excel.configuration;

import io.swagger.annotations.Api;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Optional;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

  @Bean
  public Docket userApi() {
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.excel"))
        .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
        .build()
        .genericModelSubstitutes(Optional.class);
  }
}
