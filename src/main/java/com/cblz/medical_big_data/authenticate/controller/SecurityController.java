package com.cblz.medical_big_data.authenticate.controller;

import com.cblz.medical_big_data.authenticate.entity.Response;
import com.cblz.medical_big_data.authenticate.exception.AuthException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.time.LocalDateTime;

/**
 * @BelongsProject: MedicalBigData
 * @BelongsPackage: com.cblz.medical_big_data.common.authenticate.configure
 * @Author: Yan
 * @CreateTime: 2020-05-18 11:03
 * @Description:
 */
@Slf4j
@Controller
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityController {
    @Autowired
    private ConsumerTokenServices consumerTokenServices;

    @GetMapping("oauth/test")
    public String testOauth() {
        return "oauth";
    }

    /**
     * 测试权限控制
     * @return
     */
    @GetMapping("test1")
    @PreAuthorize("hasAnyAuthority('user:add')")
    @ResponseBody
    public String testAuth() {
        return "拥有user：add权限";
    }

    @GetMapping("test2")
    @PreAuthorize("hasAnyAuthority('user:update')")
    @ResponseBody
    public String testAuth2() {
        return "拥有user：update权限";
    }

    @GetMapping("test3")
    @PreAuthorize("hasAuthority('admin:select')")
    @ResponseBody
    public String testAuth3() {
        return "拥有user：select权限";
    }

    @GetMapping("user")
    @ResponseBody
    public Principal currentUser(Principal principal) {
        log.info("用户信息：" + principal.toString());
        return principal;
    }

    @DeleteMapping("signout")
    @ResponseBody
    public Response signout(HttpServletRequest request) throws AuthException {
        String authorization = request.getHeader("Authorization");
        String token = StringUtils.replace(authorization, "bearer ", "");
        Response response = new Response();
        if (!consumerTokenServices.revokeToken(token)) {
            log.warn(LocalDateTime.now() + " :退出登录失败");
            throw new AuthException("退出登录失败");
        }
        log.info(LocalDateTime.now() + " :退出登录成功");
        return response.message("退出登录成功");
    }
}
