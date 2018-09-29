package com.activiti.demo;


import com.activiti.demo.filter.CrossDomainFilter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.sql.DataSource;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableTransactionManagement()
@EnableSwagger2
@MapperScan("com.activiti.demo.*.mapper")
public class DemoApplication {
    /**
     * 跨域过滤器
     */

    @Bean
    public FilterRegistrationBean addCrossDomainFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new CrossDomainFilter());
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }

    @Bean
    public PlatformTransactionManager txManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
