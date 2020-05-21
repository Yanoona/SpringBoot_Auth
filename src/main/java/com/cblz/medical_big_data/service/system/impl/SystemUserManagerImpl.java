package com.cblz.medical_big_data.service.system.impl;

import com.cblz.medical_big_data.entity.system.Menu;
import com.cblz.medical_big_data.entity.system.SystemUser;
import com.cblz.medical_big_data.mapper.system.MenuMapper;
import com.cblz.medical_big_data.mapper.system.SystemUserMapper;
import com.cblz.medical_big_data.service.system.SystemUserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @BelongsProject: MedicalBigData
 * @BelongsPackage: com.cblz.medical_big_data.service.system.impl
 * @Author: Yan
 * @CreateTime: 2020-05-21 09:46
 * @Description: 系统用户管理服务层实现类
 */
@Service
public class SystemUserManagerImpl implements SystemUserManager {

    @Autowired
    private SystemUserMapper systemUserMapper;
    @Autowired
    private MenuMapper menuMapper;

    @Override
    public SystemUser findByName(String username) {
        return systemUserMapper.findByName(username);
    }

    @Override
    public String findUserPermissions(String username) {
        List<Menu> menuList = menuMapper.findUserPermissions(username);
        return menuList.stream().map(Menu::getPerms).collect(Collectors.joining(","));
    }
}
