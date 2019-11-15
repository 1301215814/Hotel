package com.qf.demo.service;

import com.qf.demo.pojo.JdPermission;

import java.util.List;

public interface JdPermissionService {
    /*查询所有权限*/
    public List<JdPermission> findPermByLoginName(String name);

    public List<JdPermission> findPermissionById(int uid);

    public List<JdPermission> findNotPermissionById(int uid);
}
