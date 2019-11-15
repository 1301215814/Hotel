package com.qf.demo.service.impl;

import com.qf.demo.mapper.JdPermissionMapper;
import com.qf.demo.pojo.JdPermission;
import com.qf.demo.service.JdPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JdPermissionServiceImpl implements JdPermissionService {

    @Autowired
    private JdPermissionMapper permissionMapper;

    @Override
    public List<JdPermission> findPermissionById(int uid) {
        return permissionMapper.findPermissionById (uid);
    }

    @Override
    public List<JdPermission> findNotPermissionById(int uid) {
        return permissionMapper.findNotPermissionById (uid);
    }

    @Override
    public List<JdPermission> findPermByLoginName(String name) {
        return permissionMapper.findPermByLoginName (name);
    }
}
