package com.qf.demo.controller;

import com.qf.demo.pojo.JdRoom;
import com.qf.demo.pojo.JdUser;
import com.qf.demo.service.JdRoomService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller

public class roomController {
    private static final Logger logger = LogManager.getLogger( roomController.class);

    @Autowired
    private JdRoomService roomService;

    //清洁工查看内容

    @RequestMapping(value = "/roomselect2",method = RequestMethod.GET)

    public String selectRoomQ(Model model){
        List<JdRoom> rooms=roomService.roomselectQ();
        //  ResponseEntity responseEntity = new ResponseEntity(users, HttpStatus.OK);
        model.addAttribute("rooms",rooms);
        for (JdRoom room : rooms) {
            logger.info(room+"===============================");
        }
        return "roomManager2";
    }


    //跳转清洁工权限修改页面

    @RequestMapping("roomState")
    public String updatestaff(int roid, Model model){
        JdRoom jdRoom =roomService.selectRoomById(roid);
        model.addAttribute("room",jdRoom);
        logger.info(roid);
        logger.info(jdRoom);
        return "updatepage4";
    }

    //修改房间状态信息

    @RequestMapping("roomstateupdate")
    public String updateState(JdRoom jdRoom){
        logger.info("===================="+jdRoom);
        boolean b = roomService.updateState(jdRoom);
        logger.info(b+"======***********=================");
        return "redirect:roomselect2";
    }



    //跳转前台权限修改页面
    @RequiresPermissions( value = {"room_update"})
    @RequestMapping("roomState2")
    public String updatestaff2(int roid, Model model){
        JdRoom jdRoom =roomService.selectRoomById(roid);
        model.addAttribute("room",jdRoom);
        logger.info(roid);
        logger.info(jdRoom);
        return "updatepage5";
    }

    //前台修改房间状态信息
    @RequiresPermissions( value = {"room_update"})
    @RequestMapping("roomstateupdate2")
    public String updateState2(JdRoom jdRoom){
        logger.info("===================="+jdRoom);
        boolean b = roomService.updateState(jdRoom);
        logger.info(b+"======***********=================");
        return "redirect:roomselect2";
    }


}

