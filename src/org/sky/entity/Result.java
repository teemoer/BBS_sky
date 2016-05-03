package org.sky.entity;

import java.io.Serializable;

/**
 * jion格式类
 */
public class Result implements Serializable{
    private int status;//成功或者失败内容
    private String msg;//提示信息
    private Object data;//对象

    public Object getData2() {
        return data2;
    }

    public void setData2(Object data2) {
        this.data2 = data2;
    }

    private Object data2;//对象2
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }

}
