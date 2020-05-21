package com.cblz.medical_big_data.authenticate.exception;

/**
 * @BelongsProject: MedicalBigData
 * @BelongsPackage: com.cblz.medical_big_data.common.authenticate.exception
 * @Author: Yan
 * @CreateTime: 2020-05-18 11:07
 * @Description: 系统自定义异常类
 */
public class AuthException extends Exception {

    private static final long serialVersionUID = -5495748739495800111L;

    public AuthException(String message){
        super(message);
    }
}
