package com.activiti.demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket createRestApi() {
        ParameterBuilder tokenPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<Parameter>();
        tokenPar.name("Authorization").description("令牌").defaultValue("eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImNyZWF0ZWQiOjE1MjY0NTMwNzQyMDMsImV4cCI6MTUyNzA1Nzg3NH0.iahrcI43mGFq1AMvDIlYRRWCHUq_as5c1jzSa-nxH3qOdnO22OgPnh_WlVcmILjUAUn3ZFC8ASdFwLb5EdpSHg").modelRef(new ModelRef("string")).parameterType("header").required(false).build();
        pars.add(tokenPar.build());
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(ApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.activiti"))
                .paths(PathSelectors.any())
                .build()
                .globalOperationParameters(pars)
                ;
    }
    private ApiInfo ApiInfo() {
        return new ApiInfoBuilder()
                .title("创新创业大赛Api")
                .version("1.0")
                .build();
    }
}