package com.gx.bean;

import java.util.Date;

public class UploadFile {
    private Long id;

    private String contributor;

    private String phone;

    private String author;

    private String authorunit;

    private String filename;

    private String suffix;

    private Long size;

    private String language;

    private String summaryCn;

    private String summaryEn;

    private String localUrl;

    private String visitUrl;

    private Integer isOriginal;

    private Long views;

    private Long downloads;

    private String original;

    private Integer isNews;

    private Date lastModifyTime;

    private Date createTime;

    private Integer isDownloadable;

    private Integer isUploadable;

    private Integer isVisiable;

    private Integer isUpdatable;

    private Integer userId;

    private Integer categoryId;

    private Integer filetypeId;
    


	private User user;   
	
	private Category category;
	
	private FileType fileType;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public FileType getFileType() {
		return fileType;
	}

	public void setFileType(FileType fileType) {
		this.fileType = fileType;
	}
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContributor() {
        return contributor;
    }

    public void setContributor(String contributor) {
        this.contributor = contributor == null ? null : contributor.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getAuthorunit() {
        return authorunit;
    }

    public void setAuthorunit(String authorunit) {
        this.authorunit = authorunit == null ? null : authorunit.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix == null ? null : suffix.trim();
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getSummaryCn() {
        return summaryCn;
    }

    public void setSummaryCn(String summaryCn) {
        this.summaryCn = summaryCn == null ? null : summaryCn.trim();
    }

    public String getSummaryEn() {
        return summaryEn;
    }

    public void setSummaryEn(String summaryEn) {
        this.summaryEn = summaryEn == null ? null : summaryEn.trim();
    }

    public String getLocalUrl() {
        return localUrl;
    }

    public void setLocalUrl(String localUrl) {
        this.localUrl = localUrl == null ? null : localUrl.trim();
    }

    public String getVisitUrl() {
        return visitUrl;
    }

    public void setVisitUrl(String visitUrl) {
        this.visitUrl = visitUrl == null ? null : visitUrl.trim();
    }

    public Integer getIsOriginal() {
        return isOriginal;
    }

    public void setIsOriginal(Integer isOriginal) {
        this.isOriginal = isOriginal;
    }

    public Long getViews() {
        return views;
    }

    public void setViews(Long views) {
        this.views = views;
    }

    public Long getDownloads() {
        return downloads;
    }

    public void setDownloads(Long downloads) {
        this.downloads = downloads;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original == null ? null : original.trim();
    }

    public Integer getIsNews() {
        return isNews;
    }

    public void setIsNews(Integer isNews) {
        this.isNews = isNews;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsDownloadable() {
        return isDownloadable;
    }

    public void setIsDownloadable(Integer isDownloadable) {
        this.isDownloadable = isDownloadable;
    }

    public Integer getIsUploadable() {
        return isUploadable;
    }

    public void setIsUploadable(Integer isUploadable) {
        this.isUploadable = isUploadable;
    }

    public Integer getIsVisiable() {
        return isVisiable;
    }

    public void setIsVisiable(Integer isVisiable) {
        this.isVisiable = isVisiable;
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

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getFiletypeId() {
        return filetypeId;
    }

    public void setFiletypeId(Integer filetypeId) {
        this.filetypeId = filetypeId;
    }
}