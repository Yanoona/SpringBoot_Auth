package com.cblz.medical_big_data.service.system;

import com.cblz.medical_big_data.entity.system.SystemUser;

/**
 * @BelongsProject: MedicalBigData
 * @BelongsPackage: com.cblz.medical_big_data.service.system
 * @Author: Yan
 * @CreateTime: 2020-05-21 09:45
 * @Description: 系统用户管理服务层
 */
public interface SystemUserManager {
    SystemUser findByName(String username);
    String findUserPermissions(String username);
}
