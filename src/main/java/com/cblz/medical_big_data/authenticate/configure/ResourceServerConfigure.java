package com.cblz.medical_big_data.authenticate.configure;

import com.cblz.medical_big_data.authenticate.translator.AuthWebResponseExceptionTranslator;
import com.cblz.medical_big_data.common.handle.AuthExceptionEntryPoint;
import com.cblz.medical_big_data.common.handle.ResourceAccessDeniedHandler;
import com.cblz.medical_big_data.common.properties.ServerSystemProperties;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

/**
 * @BelongsProject: MedicalBigData
 * @BelongsPackage: com.cblz.medical_big_data.common.authenticate.configure
 * @Author: Yan
 * @CreateTime: 2020-05-18 10:38
 * @Description: 资源服务器配置类--ResourceServerConfigure用于处理非/oauth/开头的请求，其主要用于资源的保护，客户端只能通过OAuth2协议发放的令牌来从资源服务器中获取受保护的资源。
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfigure extends ResourceServerConfigurerAdapter {

    @Autowired
    private AuthExceptionEntryPoint authExceptionEntryPoint;
    @Autowired
    private ResourceAccessDeniedHandler resourceAccessDeniedHandler;
    @Autowired
    private ServerSystemProperties serverSystemProperties;

    @Override
    public void configure(HttpSecurity http) throws Exception {
//        用于Swagger界面免认证
        String[] anonUrls = StringUtils.
                splitByWholeSeparatorPreserveAllTokens(serverSystemProperties.getAnonURL(), ",");

        http.csrf().disable()
                .requestMatchers()
//                该安全配置对所有请求都生效
                .antMatchers("/**")
                .and()
                .authorizeRequests()
                .antMatchers(anonUrls).permitAll()
                .antMatchers("/**").authenticated();
    }

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        resources.accessDeniedHandler(resourceAccessDeniedHandler)
                .authenticationEntryPoint(authExceptionEntryPoint);
    }
}
