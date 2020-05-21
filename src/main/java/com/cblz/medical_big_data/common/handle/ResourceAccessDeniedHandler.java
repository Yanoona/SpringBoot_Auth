package com.cblz.medical_big_data.common.handle;

import com.cblz.medical_big_data.authenticate.entity.Response;
import com.cblz.medical_big_data.common.util.ResourceUtil;
import org.springframework.http.MediaType;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @BelongsProject: MedicalBigData
 * @BelongsPackage: com.cblz.medical_big_data.common.handle
 * @Author: Yan
 * @CreateTime: 2020-05-21 14:32
 * @Description:
 */
@Component
public class ResourceAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                       AccessDeniedException e) throws IOException, ServletException {
        Response response = new Response();
        ResourceUtil.makeResponse(httpServletResponse, MediaType.APPLICATION_JSON_UTF8_VALUE,
                HttpServletResponse.SC_FORBIDDEN, response.message("没有足够的权限访问此资源"));
    }
}
