package com.bdvenda.products.relay.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.bdvenda.products.relay"))
        .build();
  }

  ApiInfo metaInfo() {
    return new ApiInfo(
        "B&D Systems",
        "Products API",
        "1.0",
        "Terms of Service",
        new Contact("Benicius Claro", "", "beniciusclaro@hotmail.com"),
        "https://www.apache.org./licensen.html",
        null,
        null);
  }
}
