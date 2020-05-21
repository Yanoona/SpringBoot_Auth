package com.cblz.medical_big_data.entity.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * @BelongsProject: febs-cloud
 * @BelongsPackage: com.yan.febscommon.entity.system
 * @Author: Yan
 * @CreateTime: 2020-04-30 15:45
 * @Description:
 */

@TableName(value = "t_user_role")
public class UserRole implements Serializable {

    private static final long serialVersionUID = -126835590667998909L;

    @TableField(value = "USER_ID")
    private Long userId;

    @TableField(value = "ROLE_ID")
    private Long roleId;
}
