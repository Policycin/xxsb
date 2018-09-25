package com.gx.bean;

import java.util.Date;

public class LogManager {
    private Long id;

    private Date createTime;

    private Integer userId;

    private Long fileId;

    private Long imgId;

    private String option;

    


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
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public Long getImgId() {
        return imgId;
    }

    public void setImgId(Long imgId) {
        this.imgId = imgId;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option == null ? null : option.trim();
    }
}