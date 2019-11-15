package com.qf.demo.pojo;

import lombok.Data;

import java.util.List;

@Data
public class JdRole {
    private int rid;
    private String rname;
    private List<JdUser> user;
}
