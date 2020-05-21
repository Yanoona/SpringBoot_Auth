package com.cblz.medical_big_data.authenticate.properties;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

/**
 * @BelongsProject: MedicalBigData
 * @BelongsPackage: com.cblz.medical_big_data.authenticate.properties
 * @Author: Yan
 * @CreateTime: 2020-05-18 15:05
 * @Description: 认证配置类
 */
@SpringBootConfiguration
@PropertySource(value = {"classpath:auth.properties"})
@ConfigurationProperties(prefix = "auth")
public class AuthProperties {

    private ClientsProperties[] clients = {};
    private int accessTokenValiditySeconds = 60 * 60 * 24;
    private int refreshTokenValiditySeconds = 60 * 60 * 24 * 7;

    public ClientsProperties[] getClients() {
        return clients;
    }

    public void setClients(ClientsProperties[] clients) {
        this.clients = clients;
    }

    public int getAccessTokenValiditySeconds() {
        return accessTokenValiditySeconds;
    }

    public void setAccessTokenValiditySeconds(int accessTokenValiditySeconds) {
        this.accessTokenValiditySeconds = accessTokenValiditySeconds;
    }

    public int getRefreshTokenValiditySeconds() {
        return refreshTokenValiditySeconds;
    }

    public void setRefreshTokenValiditySeconds(int refreshTokenValiditySeconds) {
        this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
    }
}
