package com.gx.bean;

import java.util.Date;

public class FileType {
    private Integer id;

    private Date createTime;

    private String filetypeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getFiletypeName() {
        return filetypeName;
    }

    public void setFiletypeName(String filetypeName) {
        this.filetypeName = filetypeName == null ? null : filetypeName.trim();
    }
}