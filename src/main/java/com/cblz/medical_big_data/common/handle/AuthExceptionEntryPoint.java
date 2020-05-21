package com.cblz.medical_big_data.common.handle;

import com.cblz.medical_big_data.authenticate.entity.Response;
import com.cblz.medical_big_data.common.util.ResourceUtil;
import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;

/**
 * @BelongsProject: MedicalBigData
 * @BelongsPackage: com.cblz.medical_big_data.common.handle
 * @Author: Yan
 * @CreateTime: 2020-05-21 14:29
 * @Description:
 */
@Component
public class AuthExceptionEntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                         AuthenticationException e) throws IOException, ServletException {
        Response response = new Response();
        ResourceUtil.makeResponse(httpServletResponse, MediaType.APPLICATION_JSON_UTF8_VALUE,
                HttpServletResponse.SC_UNAUTHORIZED, response.message("ToKen无效"));
    }
}
