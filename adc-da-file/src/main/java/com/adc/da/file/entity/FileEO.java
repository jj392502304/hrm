package com.adc.da.file.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>TS_FILE FileEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2017-12-24 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class FileEO extends BaseEntity {

    private String userId;
    private String url;
    private String savePath;
    private String remark;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastUpdateTime;
    private String fileType;
    private String fileName;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    private String contentType;
    private String fileId;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>userId -> user_id</li>
     * <li>url -> url</li>
     * <li>savePath -> save_path</li>
     * <li>remark -> remark</li>
     * <li>lastUpdateTime -> last_update_time</li>
     * <li>fileType -> file_type</li>
     * <li>fileName -> file_name</li>
     * <li>createTime -> create_time</li>
     * <li>contentType -> content_type</li>
     * <li>fileId -> file_id</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "userId": return "user_id";
            case "url": return "url";
            case "savePath": return "save_path";
            case "remark": return "remark";
            case "lastUpdateTime": return "last_update_time";
            case "fileType": return "file_type";
            case "fileName": return "file_name";
            case "createTime": return "create_time";
            case "contentType": return "content_type";
            case "fileId": return "file_id";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>user_id -> userId</li>
     * <li>url -> url</li>
     * <li>save_path -> savePath</li>
     * <li>remark -> remark</li>
     * <li>last_update_time -> lastUpdateTime</li>
     * <li>file_type -> fileType</li>
     * <li>file_name -> fileName</li>
     * <li>create_time -> createTime</li>
     * <li>content_type -> contentType</li>
     * <li>file_id -> fileId</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "user_id": return "userId";
            case "url": return "url";
            case "save_path": return "savePath";
            case "remark": return "remark";
            case "last_update_time": return "lastUpdateTime";
            case "file_type": return "fileType";
            case "file_name": return "fileName";
            case "create_time": return "createTime";
            case "content_type": return "contentType";
            case "file_id": return "fileId";
            default: return null;
        }
    }
    
    /**  **/
    public String getUserId() {
        return this.userId;
    }

    /**  **/
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**  **/
    public String getUrl() {
        return this.url;
    }

    /**  **/
    public void setUrl(String url) {
        this.url = url;
    }

    /**  **/
    public String getSavePath() {
        return this.savePath;
    }

    /**  **/
    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    /**  **/
    public String getRemark() {
        return this.remark;
    }

    /**  **/
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**  **/
    public Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**  **/
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**  **/
    public String getFileType() {
        return this.fileType;
    }

    /**  **/
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    /**  **/
    public String getFileName() {
        return this.fileName;
    }

    /**  **/
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**  **/
    public Date getCreateTime() {
        return this.createTime;
    }

    /**  **/
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**  **/
    public String getContentType() {
        return this.contentType;
    }

    /**  **/
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**  **/
    public String getFileId() {
        return this.fileId;
    }

    /**  **/
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

}
