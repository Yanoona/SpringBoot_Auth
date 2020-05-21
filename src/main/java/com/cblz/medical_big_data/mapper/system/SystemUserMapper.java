package com.cblz.medical_big_data.mapper.system;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cblz.medical_big_data.entity.system.SystemUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @BelongsProject: MedicalBigData
 * @BelongsPackage: com.cblz.medical_big_data.mapper.system
 * @Author: Yan
 * @CreateTime: 2020-05-20 16:38
 * @Description:
 */
@Mapper
public interface SystemUserMapper extends BaseMapper<SystemUser> {
    SystemUser findByName(String username);
}
