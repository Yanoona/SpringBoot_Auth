package com.cblz.medical_big_data.authenticate.entity;

import com.cblz.medical_big_data.entity.system.SystemUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Objects;

/**
 * @BelongsProject: MedicalBigData
 * @BelongsPackage: com.cblz.medical_big_data.common.authenticate.entity
 * @Author: Yan
 * @CreateTime: 2020-05-18 11:00
 * @Description:
 */
public class AuthUser extends User implements Serializable {

    private static final long serialVersionUID = 7054756273776288702L;

    private long userId;

    private String avatar;

    private String email;

    private String mobile;

    private String sex;

    private long deptId;

    private String deptName;

    private String roleId;

    private String roleName;

    private LocalDateTime lastLoginTime;

    private String description;

    private String status;

    public AuthUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public AuthUser(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public long getDeptId() {
        return deptId;
    }

    public void setDeptId(long deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
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

    public LocalDateTime getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(LocalDateTime lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AuthUser authUser = (AuthUser) o;
        return userId == authUser.userId &&
                deptId == authUser.deptId &&
                Objects.equals(avatar, authUser.avatar) &&
                Objects.equals(email, authUser.email) &&
                Objects.equals(mobile, authUser.mobile) &&
                Objects.equals(sex, authUser.sex) &&
                Objects.equals(deptName, authUser.deptName) &&
                Objects.equals(roleId, authUser.roleId) &&
                Objects.equals(roleName, authUser.roleName) &&
                Objects.equals(lastLoginTime, authUser.lastLoginTime) &&
                Objects.equals(description, authUser.description) &&
                Objects.equals(status, authUser.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), userId, avatar, email, mobile, sex, deptId, deptName, roleId, roleName, lastLoginTime, description, status);
    }
}
