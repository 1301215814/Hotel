package com.qf.demo.pojo;

public class JdOrder {
    private Integer oid;

    private String oname;

    private Integer onum;

    private String uname;

    private String odate;

    private String ointime;

    private String oouttime;

    private String ophone;

    private Integer oidcard;

    private Integer oday;

    private Integer omoney;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname == null ? null : oname.trim();
    }

    public Integer getOnum() {
        return onum;
    }

    public void setOnum(Integer onum) {
        this.onum = onum;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getOdate() {
        return odate;
    }

    public void setOdate(String odate) {
        this.odate = odate == null ? null : odate.trim();
    }

    public String getOintime() {
        return ointime;
    }

    public void setOintime(String ointime) {
        this.ointime = ointime == null ? null : ointime.trim();
    }

    public String getOouttime() {
        return oouttime;
    }

    public void setOouttime(String oouttime) {
        this.oouttime = oouttime == null ? null : oouttime.trim();
    }

    public String getOphone() {
        return ophone;
    }

    public void setOphone(String ophone) {
        this.ophone = ophone == null ? null : ophone.trim();
    }

    public Integer getOidcard() {
        return oidcard;
    }

    public void setOidcard(Integer oidcard) {
        this.oidcard = oidcard;
    }

    public Integer getOday() {
        return oday;
    }

    public void setOday(Integer oday) {
        this.oday = oday;
    }

    public Integer getOmoney() {
        return omoney;
    }

    public void setOmoney(Integer omoney) {
        this.omoney = omoney;
    }
}