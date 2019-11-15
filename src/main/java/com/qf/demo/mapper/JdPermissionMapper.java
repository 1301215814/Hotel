package com.qf.demo.mapper;

import com.qf.demo.pojo.JdPermission;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface JdPermissionMapper {
    /*根据用户名查用户拥有的权限*/
    public List<JdPermission> findPermByLoginName(@Param("uname") String name);
    /*根据职工ID查职工所拥有的权限*/
    public List<JdPermission> findPermissionById(@Param ("uid") int uid);
    /*根据职工ID查职工所未拥有的权限*/
    public List<JdPermission> findNotPermissionById(@Param ("uid") int uid);

}