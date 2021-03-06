package com.qf.demo.mapper;

import com.qf.demo.pojo.JdRoom;
import com.qf.demo.pojo.JdUser;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface JdUserMapper {


    //注册
    public void insert(JdUser jdUser);
    /*根据用户名和密码查询用户类型*/
    public int findUserType(String uname,String upassword);
    /*根据用户名查用户信息*/
    public JdUser findUserByName(@Param("uname") String uname);

    public List<JdUser> findPermission();

    //根据id删除
    public boolean deleteUserById(int uid);
    //根据id查
    public JdUser selectUserById(int uid);
    //全查用户信息
    public List<JdUser> selectByExample();
    //全查职工信息
    public List<JdUser> selectByExample2();

    //查房间信息
    public List<JdRoom> roomselect();
    //修改信息
    public boolean updateByPrimaryKeySelective(JdUser record);

    //修改身份权限信息
    public boolean updateStaff(JdUser jdUser);

    public List<JdUser> assignRole(int uid);

    public List<JdUser> notAssignRole(int uid);

    public void addRoleName(int uid,int rid);

    public void deleteRoleName(int uid,int rid);

}