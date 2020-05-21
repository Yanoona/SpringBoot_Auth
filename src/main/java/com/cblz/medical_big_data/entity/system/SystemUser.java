package com.cblz.medical_big_data.entity.system;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.security.core.GrantedAuthority;

import java.io.Serializable;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Objects;

@TableName("t_user")
public class SystemUser implements Serializable {

    private static final long serialVersionUID = -70597888734449332L;

    // 用户状态：有效
    public static final String STATUS_VALID = "1";
    // 用户状态：锁定
    public static final String STATUS_LOCK = "0";
    // 默认头像
    public static final String DEFAULT_AVATAR = "default.jpg";
    // 默认密码
    public static final String DEFAULT_PASSWORD = "1234qwer";
    // 性别男
    public static final String SEX_MALE = "0";
    // 性别女
    public static final String SEX_FEMALE = "1";
    // 性别保密
    public static final String SEX_UNKNOW = "2";
    @TableId(value = "USER_ID", type = IdType.AUTO)
    private long userId;
    @TableField("USERNAME")
    private String username;
    @TableField("PASSWORD")
    private String password;
    @TableField("DEPT_ID")
    private long deptId;
    @TableField("EMAIL")
    private String email;
    @TableField("MOBILE")
    private String mobile;
    @TableField("STATUS")
    private String status;
    @TableField("CREATE_TIME")
    private LocalDateTime createTime;
    @TableField("MODIFY_TIME")
    private LocalDateTime modifyTime;
    @TableField("LAST_LOGIN_TIME")
    private LocalDateTime lastLoginTime;
    //    性别 0男 1女 2 保密
    @TableField("SSEX")
    private String ssex;
    @TableField("AVATAR")
    private String avatar;
    @TableField("DESCRIPTION")
    private String description;
    //部门名称
    @TableField(exist = false)
    private String deptName;
    @TableField(exist = false)
    private String createTimeFrom;
    @TableField(exist = false)
    private String createTimeTo;
    //  角色 ID
    @TableField(exist = false)
    private String roleId;
    @TableField(exist = false)
    private String roleName;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getDeptId() {
        return deptId;
    }

    public void setDeptId(long deptId) {
        this.deptId = deptId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    public LocalDateTime getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(LocalDateTime lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getCreateTimeFrom() {
        return createTimeFrom;
    }

    public void setCreateTimeFrom(String createTimeFrom) {
        this.createTimeFrom = createTimeFrom;
    }

    public String getCreateTimeTo() {
        return createTimeTo;
    }

    public void setCreateTimeTo(String createTimeTo) {
        this.createTimeTo = createTimeTo;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }



    public SystemUser(long userId, String username, String password, long deptId, String email, String mobile, String status, LocalDateTime createTime, LocalDateTime modifyTime, LocalDateTime lastLoginTime, String ssex, String avatar, String description, String deptName, String createTimeFrom, String createTimeTo, String roleId, String roleName) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.deptId = deptId;
        this.email = email;
        this.mobile = mobile;
        this.status = status;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
        this.lastLoginTime = lastLoginTime;
        this.ssex = ssex;
        this.avatar = avatar;
        this.description = description;
        this.deptName = deptName;
        this.createTimeFrom = createTimeFrom;
        this.createTimeTo = createTimeTo;
        this.roleId = roleId;
        this.roleName = roleName;
    }

    public SystemUser(long userId, String username, String email, String mobile, String password, String status, LocalDateTime createTime, String ssex, long deptId, LocalDateTime lastLoginTime, LocalDateTime modifyTime, String description, String avatar, String deptName, String roleId, String roleName) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.password = password;
        this.deptId = deptId;
        this.mobile = mobile;
        this.status = status;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
        this.lastLoginTime = lastLoginTime;
        this.ssex = ssex;
        this.avatar = avatar;
        this.description = description;
        this.deptName = deptName;
        this.roleId = roleId;
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SystemUser that = (SystemUser) o;
        return userId == that.userId &&
                deptId == that.deptId &&
                Objects.equals(username, that.username) &&
                Objects.equals(password, that.password) &&
                Objects.equals(email, that.email) &&
                Objects.equals(mobile, that.mobile) &&
                Objects.equals(status, that.status) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Objects.equals(lastLoginTime, that.lastLoginTime) &&
                Objects.equals(ssex, that.ssex) &&
                Objects.equals(avatar, that.avatar) &&
                Objects.equals(description, that.description) &&
                Objects.equals(deptName, that.deptName) &&
                Objects.equals(createTimeFrom, that.createTimeFrom) &&
                Objects.equals(createTimeTo, that.createTimeTo) &&
                Objects.equals(roleId, that.roleId) &&
                Objects.equals(roleName, that.roleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, username, password, deptId, email, mobile, status, createTime, modifyTime, lastLoginTime, ssex, avatar, description, deptName, createTimeFrom, createTimeTo, roleId, roleName);
    }
}
