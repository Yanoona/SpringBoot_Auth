package com.cblz.medical_big_data.common.configure;

import com.cblz.medical_big_data.common.properties.ServerSystemProperties;
import com.cblz.medical_big_data.common.properties.SwaggerProperties;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.Collections;

/**
 * @BelongsProject: MedicalBigData
 * @BelongsPackage: com.cblz.medical_big_data.common.configure
 * @Author: Yan
 * @CreateTime: 2020-05-21 15:01
 * @Description: Swagger API生成配置
 */
@Configuration
@EnableSwagger2
public class SwaggerConfigure {

    @Autowired
    private ServerSystemProperties serverSystemProperties;

    @Bean
    public Docket swaggerAPI() {
        SwaggerProperties properties = serverSystemProperties.getSwagger();
//        根据控制类注解 来实现动态扫描 加入API
        Predicate<RequestHandler> requestHandlerSelector  = RequestHandlerSelectors.withMethodAnnotation(RequestBody.class);
        requestHandlerSelector  = Predicates.or(requestHandlerSelector,RequestHandlerSelectors.withClassAnnotation(Controller.class));

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(requestHandlerSelector)
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo(properties));
    }

    private ApiInfo apiInfo(SwaggerProperties properties) {
        return new ApiInfo(
                properties.getTitle(),
                properties.getDescription(),
                properties.getVersion(),
                null,
                new Contact(properties.getAuthor(), properties.getUrl(), properties.getEmail()),
                properties.getLicense(), properties.getLicenseUrl(), Collections.emptyList());
    }


}
