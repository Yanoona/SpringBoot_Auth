package com.cblz.medical_big_data.service.system.impl;

import com.cblz.medical_big_data.entity.system.SystemUser;
import com.cblz.medical_big_data.mapper.system.SystemUserMapper;
import com.cblz.medical_big_data.service.system.SystemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: MedicalBigData
 * @BelongsPackage: com.cblz.medical_big_data.service.system.impl
 * @Author: Yan
 * @CreateTime: 2020-05-20 16:00
 * @Description: 系统用户服务实现层
 */
@Service
public class SystemUserServiceImpl implements SystemUserService {

    @Autowired
    private SystemUserMapper systemUserDao;

    @Override
    public SystemUser findInfoByName(String userName) {
        return systemUserDao.findByName(userName);
    }
}
