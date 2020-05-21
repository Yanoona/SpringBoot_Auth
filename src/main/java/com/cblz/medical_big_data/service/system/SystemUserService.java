package com.cblz.medical_big_data.service.system;

import com.cblz.medical_big_data.entity.system.SystemUser;

/**
 * @BelongsProject: MedicalBigData
 * @BelongsPackage: com.cblz.medical_big_data.service.system
 * @Author: Yan
 * @CreateTime: 2020-05-20 16:00
 * @Description: 系统用户服务层
 */
public interface SystemUserService {
    SystemUser findInfoByName(String userName);
}
