package com.cblz.medical_big_data.entity.system;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

@TableName("t_menu")
public class Menu implements Serializable {

    private static final long serialVersionUID = -2156654531877721314L;
    // 菜单
    public static final String TYPE_MENU = "0";
    // 按钮
    public static final String TYPE_BUTTON = "1";

    /**
     * 菜单/按钮ID
     */
    @TableId(value = "MENU_ID", type = IdType.AUTO)
    private Long menuId;

    /**
     * 上级菜单ID
     */
    @TableField("PARENT_ID")
    private Long parentId;

    /**
     * 菜单/按钮名称
     */
    @TableField("MENU_NAME")
    private String menuName;

    /**
     * 菜单URL
     */
    @TableField("PATH")
    private String path;

    /**
     * 对应 Vue组件
     */
    @TableField("COMPONENT")
    private String component;

    /**
     * 权限标识
     */
    @TableField("PERMS")
    private String perms;

    /**
     * 图标
     */
    @TableField("ICON")
    private String icon;

    /**
     * 类型 0菜单 1按钮
     */
    @TableField("TYPE")
    private String type;

    /**
     * 排序
     */
    @TableField("ORDER_NUM")
    private Integer orderNum;

    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private Date createTime;

    /**
     * 修改时间
     */
    @TableField("MODIFY_TIME")
    private Date modifyTime;

    /**
     * 非表字段除了使用@TableField(exist = false)注解标注外，也可以使用transient关键字。
     */
    private transient String createTimeFrom;
    private transient String createTimeTo;

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getPerms() {
        return perms;
    }

    public void setPerms(String perms) {
        this.perms = perms;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
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

    public Menu() {
    }

    public Menu(Long menuId, Long parentId, String menuName, String path, String component, String perms, String icon, String type, Integer orderNum, Date createTime, Date modifyTime) {
        this.menuId = menuId;
        this.parentId = parentId;
        this.menuName = menuName;
        this.path = path;
        this.component = component;
        this.perms = perms;
        this.icon = icon;
        this.type = type;
        this.orderNum = orderNum;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
    }

    public Menu(Long menuId, Long parentId, String menuName, String path, String component, String perms, String icon, String type, Integer orderNum, Date createTime, Date modifyTime, String createTimeFrom, String createTimeTo) {
        this.menuId = menuId;
        this.parentId = parentId;
        this.menuName = menuName;
        this.path = path;
        this.component = component;
        this.perms = perms;
        this.icon = icon;
        this.type = type;
        this.orderNum = orderNum;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
        this.createTimeFrom = createTimeFrom;
        this.createTimeTo = createTimeTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return Objects.equals(menuId, menu.menuId) &&
                Objects.equals(parentId, menu.parentId) &&
                Objects.equals(menuName, menu.menuName) &&
                Objects.equals(path, menu.path) &&
                Objects.equals(component, menu.component) &&
                Objects.equals(perms, menu.perms) &&
                Objects.equals(icon, menu.icon) &&
                Objects.equals(type, menu.type) &&
                Objects.equals(orderNum, menu.orderNum) &&
                Objects.equals(createTime, menu.createTime) &&
                Objects.equals(modifyTime, menu.modifyTime) &&
                Objects.equals(createTimeFrom, menu.createTimeFrom) &&
                Objects.equals(createTimeTo, menu.createTimeTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuId, parentId, menuName, path, component, perms, icon, type, orderNum, createTime, modifyTime, createTimeFrom, createTimeTo);
    }
}
