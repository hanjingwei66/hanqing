//package com.hanqing.project.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration
//@EnableSwagger2
//public class Swagger2Configuration {
//
//    @Bean
//    public Docket buildDocket(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(buildApiInf())
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.hanqing.project.controller"))
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//    private ApiInfo buildApiInf(){
//        return new ApiInfoBuilder()
//                    .title("伟安接口文档规范")
//                    .description("springboot-swagger-weian")
//                    .termsOfServiceUrl("网址链接")
//                    .contact(new Contact("hanjingwei", "我的官网", "email"))
//                    .build();
//
//    }
//
//}