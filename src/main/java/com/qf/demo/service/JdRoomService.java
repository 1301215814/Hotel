package com.qf.demo.service;

import com.qf.demo.pojo.JdRoom;

import java.util.List;

public interface JdRoomService {
    /*查询房间信息*/
    public List<JdRoom> selectRoom();

    //根据id查询房间信息去改房间状态
    public JdRoom selectRoomById(int roid);

    //清洁工查房间信息
    public List<JdRoom> roomselectQ();

    //修改房间状态信息
    public boolean updateState(JdRoom jdRoom);
}
