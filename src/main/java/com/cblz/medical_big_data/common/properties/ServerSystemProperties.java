package com.cblz.medical_big_data.common.properties;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @BelongsProject: MedicalBigData
 * @BelongsPackage: com.cblz.medical_big_data.common.properties
 * @Author: Yan
 * @CreateTime: 2020-05-21 15:06
 * @Description: Swagger 配置文件类
 */
@Configuration
@PropertySource("classpath:swagger.properties")
@ConfigurationProperties(prefix = "server.system")
public class ServerSystemProperties {
//    免认证 URI，多个值的话以逗号分隔
    private String anonURL;

    private SwaggerProperties swagger = new SwaggerProperties();

    public SwaggerProperties getSwagger() {
        return swagger;
    }

    public void setSwagger(SwaggerProperties swagger) {
        this.swagger = swagger;
    }

    public String getAnonURL() {
        return anonURL;
    }

    public void setAnonURL(String anonURL) {
        this.anonURL = anonURL;
    }
}
