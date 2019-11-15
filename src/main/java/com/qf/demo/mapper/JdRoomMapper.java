package com.qf.demo.mapper;

import com.qf.demo.pojo.JdRoom;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface JdRoomMapper {

    public List<JdRoom> selectRoom();

    //根据id查询房间信息去改房间状态
    public JdRoom selectRoomById(int roid);

    //清洁工查房间信息
    public List<JdRoom> roomselectQ();

    //修改房间状态信息
    public boolean updateState(JdRoom jdRoom);
}
