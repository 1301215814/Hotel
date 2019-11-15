package com.qf.demo.pojo;

import java.io.Serializable;
import java.util.List;

public class JdUser implements Serializable {
    private Integer uid;

    private String upassword;

    private String uphone;

    private String uname;

    private String uemail;

    private Integer rid;

    private String usex;

    private String uidcard;

    private List<JdPermission> permission;

    private List<JdRole> roles;

    private List<JdOrder> orders;

    private List<JdRoom> rooms;

    private List<JdState> states;

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public List<JdRole> getRoles() {
        return roles;
    }

    public void setRoles(List<JdRole> roles) {
        this.roles = roles;
    }

    public List<JdOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<JdOrder> orders) {
        this.orders = orders;
    }

    public List<JdRoom> getRooms() {
        return rooms;
    }

    public void setRooms(List<JdRoom> rooms) {
        this.rooms = rooms;
    }

    public List<JdState> getStates() {
        return states;
    }

    public void setStates(List<JdState> states) {
        this.states = states;
    }



    public List<JdPermission> getPermission() {
        return permission;
    }

    public void setPermission(List<JdPermission> permission) {
        this.permission = permission;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword == null ? null : upassword.trim();
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone == null ? null : uphone.trim();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail == null ? null : uemail.trim();
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getUidcard() {
        return uidcard;
    }

    public void setUidcard(String uidcard) {
        this.uidcard = uidcard == null ? null : uidcard.trim();
    }
}