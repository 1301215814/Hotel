package com.qf.demo.pojo;

import java.util.List;

public class JdPermission {
    private Integer permissionId;

    private String perName;

    private String menuName;

    private List<JdUser> user;

    public List<JdUser> getUser() {
        return user;
    }

    public void setUser(List<JdUser> user) {
        this.user = user;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public String getPerName() {
        return perName;
    }

    public void setPerName(String perName) {
        this.perName = perName == null ? null : perName.trim();
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

}