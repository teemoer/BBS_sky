package org.sky.entity;

import java.sql.Timestamp;

/**
 * Created by Administrator on 2016/4/30 0030.
 */
public class bk {
    Integer bid;
    Integer uid;
    String bname;
    Integer bclass;
    String uname;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public Integer getBclass() {
        return bclass;
    }

    public void setBclass(Integer bclass) {
        this.bclass = bclass;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
}
