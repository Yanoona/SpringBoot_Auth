package com.cblz.medical_big_data.authenticate.service;

import com.cblz.medical_big_data.authenticate.entity.AuthUser;
import com.cblz.medical_big_data.entity.system.SystemUser;
import com.cblz.medical_big_data.service.system.SystemUserManager;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: MedicalBigData
 * @BelongsPackage: com.cblz.medical_big_data.common.authenticate.service
 * @Author: Yan
 * @CreateTime: 2020-05-18 10:57
 * @Description: 校验密码类
 */
@Slf4j
@Service
public class UserDetailService implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private SystemUserManager systemUserManager;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SystemUser systemUser = systemUserManager.findByName(username);
        if (systemUser != null) {
            String permissions = systemUserManager.findUserPermissions(systemUser.getUsername());
            boolean notLocked = false;
            if (StringUtils.equals(SystemUser.STATUS_VALID, systemUser.getStatus()))
                notLocked = true;
            AuthUser authUser = new AuthUser(systemUser.getUsername(), systemUser.getPassword(),
                    true, true, true, notLocked,
                    AuthorityUtils.commaSeparatedStringToAuthorityList(permissions));

            BeanUtils.copyProperties(systemUser, authUser);
            return authUser;
        } else {
            throw new UsernameNotFoundException("");
        }
    }

}
