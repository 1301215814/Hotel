package com.qf.demo.service.impl;

import com.qf.demo.mapper.JdUserMapper;
import com.qf.demo.pojo.JdRoom;
import com.qf.demo.pojo.JdUser;
import com.qf.demo.service.JdUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class JdUserServiceImpl implements JdUserService {

    @Autowired
    private JdUserMapper userMapper;

    @Override
    public void insert(JdUser jdUser) {
        userMapper.insert(jdUser);
    }

    @Override
    public JdUser findUserByName(String loginName) {
        return userMapper.findUserByName (loginName);
    }

    @Override
    public List<JdUser> selectByExample() {
        return userMapper.selectByExample();
    }

    @Override
    public int findUserType(String uname, String upassword) {
        return userMapper.findUserType (uname, upassword);
    }

    @Override
    public boolean deleteUserById(int uid) {
        return userMapper.deleteUserById (uid);
    }

    @Override
    public JdUser selectUserById(int uid) {
        return userMapper.selectUserById (uid);
    }

    @Override
    public List<JdUser> selectByExample2() {
        return userMapper.selectByExample2 ();
    }

    @Override
    public List<JdRoom> roomselect() {
        return userMapper.roomselect ();
    }

    @Override
    public boolean updateByPrimaryKeySelective(JdUser record) {
        return userMapper.updateByPrimaryKeySelective (record);
    }

    @Override
    public boolean updateStaff(JdUser jdUser) {
        return userMapper.updateStaff (jdUser);
    }

    @Override
    public List<JdUser> assignRole(int uid) {
        return userMapper.assignRole(uid);
    }

    @Override
    public List<JdUser> notAssignRole(int uid) {
        return userMapper.notAssignRole(uid);
    }

    @Override
    public void addRoleName(int uid, int rid) {
        userMapper.addRoleName(uid,rid);
    }

    @Override
    public void deleteRoleName(int uid, int rid) {
        userMapper.deleteRoleName(uid,rid);
    }

    @Override
    public List<JdUser> findPermission() {
        return userMapper.findPermission ();
    }
}
