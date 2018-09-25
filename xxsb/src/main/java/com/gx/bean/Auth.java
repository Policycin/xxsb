package com.gx.bean;

import java.util.Date;

public class Auth {
    private Integer id;

    private Date createTime;

    private Integer isUploadable;

    private Integer isDownloadable;

    private Integer isVisiable;

    private Integer isDeletable;

    private Integer isUpdatable;

    private Integer userId;

    private Long imgId;

    private Long fileId;
    
	private User user;
	
    private Image image;
    
    private UploadFile Uploadfile;

    
    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public UploadFile getUploadfile() {
		return Uploadfile;
	}

	public void setUploadfile(UploadFile uploadfile) {
		Uploadfile = uploadfile;
	}


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

    public Integer getIsUploadable() {
        return isUploadable;
    }

    public void setIsUploadable(Integer isUploadable) {
        this.isUploadable = isUploadable;
    }

    public Integer getIsDownloadable() {
        return isDownloadable;
    }

    public void setIsDownloadable(Integer isDownloadable) {
        this.isDownloadable = isDownloadable;
    }

    public Integer getIsVisiable() {
        return isVisiable;
    }

    public void setIsVisiable(Integer isVisiable) {
        this.isVisiable = isVisiable;
    }

    public Integer getIsDeletable() {
        return isDeletable;
    }

    public void setIsDeletable(Integer isDeletable) {
        this.isDeletable = isDeletable;
    }

    public Integer getIsUpdatable() {
        return isUpdatable;
    }

    public void setIsUpdatable(Integer isUpdatable) {
        this.isUpdatable = isUpdatable;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getImgId() {
        return imgId;
    }

    public void setImgId(Long imgId) {
        this.imgId = imgId;
    }

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }
}