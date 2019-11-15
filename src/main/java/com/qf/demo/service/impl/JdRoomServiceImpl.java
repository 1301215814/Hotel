package com.qf.demo.service.impl;

import com.qf.demo.mapper.JdRoomMapper;
import com.qf.demo.pojo.JdRoom;
import com.qf.demo.service.JdRoomService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JdRoomServiceImpl implements JdRoomService {

    public static final Logger logger= LogManager.getLogger(JdRoomServiceImpl.class);
    @Autowired
    private JdRoomMapper roomMapper;

    @Override
    public List<JdRoom> selectRoom() {
        return roomMapper.selectRoom ();
    }

    @Override
    public JdRoom selectRoomById(int roid) {
        return roomMapper.selectRoomById (roid);
    }

    @Override
    public List<JdRoom> roomselectQ() {
        return roomMapper.roomselectQ ();
    }

    @Override
    public boolean updateState(JdRoom jdRoom) {
        logger.info(roomMapper.updateState(jdRoom)+"111111111111111111111111111111111111111111111");
        return roomMapper.updateState (jdRoom);
    }
}
