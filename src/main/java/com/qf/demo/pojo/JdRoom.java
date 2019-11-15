package com.qf.demo.pojo;

import lombok.Data;

import java.util.List;

@Data
public class JdRoom {
    private int roId;

    private int roWifi;

    private int roShower;

    private int roWindow;

    private int roBreakfast;

    private String roBed;

    private int roMen;

    private int roArea;

    private String roName;

    private int stid;

    private List<JdState> states;

    private List<JdOrder> orders;

    private List<JdUser> users;



}
