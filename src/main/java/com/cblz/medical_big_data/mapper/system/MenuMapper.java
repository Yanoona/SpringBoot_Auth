package com.cblz.medical_big_data.mapper.system;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cblz.medical_big_data.entity.system.Menu;

import java.util.List;

/**
 * @BelongsProject: MedicalBigData
 * @BelongsPackage: com.cblz.medical_big_data.mapper.system
 * @Author: Yan
 * @CreateTime: 2020-05-21 09:42
 * @Description: 菜单Dao层
 */
public interface MenuMapper extends BaseMapper<Menu> {
    List<Menu> findUserPermissions(String username);
}
