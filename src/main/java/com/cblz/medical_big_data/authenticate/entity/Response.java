package com.cblz.medical_big_data.authenticate.entity;

import java.util.HashMap;

/**
 * @BelongsProject: MedicalBigData
 * @BelongsPackage: com.cblz.medical_big_data.common.authenticate.entity
 * @Author: Yan
 * @CreateTime: 2020-05-18 11:06
 * @Description: 系统的统一相应格式类
 */
public class Response extends HashMap<String, Object> {

    private static final long serialVersionUID = 4989745374591767548L;

    public Response message(String message) {
        this.put("message", message);
        return this;
    }

    public Response data(Object data) {
        this.put("data", data);
        return this;
    }

    @Override
    public Response put(String key, Object value) {
        super.put(key, value);
        return this;
    }

    public String getMessage() {
        return String.valueOf(get("message"));
    }

    public Object getData() {
        return get("data");
    }
}
