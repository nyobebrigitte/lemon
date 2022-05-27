package com.mossle.disk.persistence.domain;

// Generated by Hibernate Tools
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DiskDownload 下载.
 * 
 * @author Lingo
 */
@Entity
@Table(name = "DISK_DOWNLOAD")
public class DiskDownload implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** id. */
    private Long id;

    /** 节点id. */
    private DiskInfo diskInfo;

    /** 名称. */
    private String name;

    /** 类型. */
    private String type;

    /** 开始时间. */
    private Date startTime;

    /** 结束时间. */
    private Date endTime;

    /** 创建人. */
    private String creator;

    /** 创建时间. */
    private Date createTime;

    /** 更新人. */
    private String updater;

    /** 更新时间. */
    private Date updateTime;

    /** null. */
    private String status;

    /** 租户. */
    private String tenantId;

    public DiskDownload() {
    }

    public DiskDownload(Long id) {
        this.id = id;
    }

    public DiskDownload(Long id, DiskInfo diskInfo, String name, String type,
            Date startTime, Date endTime, String creator, Date createTime,
            String updater, Date updateTime, String status, String tenantId) {
        this.id = id;
        this.diskInfo = diskInfo;
        this.name = name;
        this.type = type;
        this.startTime = startTime;
        this.endTime = endTime;
        this.creator = creator;
        this.createTime = createTime;
        this.updater = updater;
        this.updateTime = updateTime;
        this.status = status;
        this.tenantId = tenantId;
    }

    /** @return id. */
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            id.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return 节点id. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INFO_ID")
    public DiskInfo getDiskInfo() {
        return this.diskInfo;
    }

    /**
     * @param diskInfo
     *            节点id.
     */
    public void setDiskInfo(DiskInfo diskInfo) {
        this.diskInfo = diskInfo;
    }

    /** @return 名称. */
    @Column(name = "NAME", length = 50)
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     *            名称.
     */
    public void setName(String name) {
        this.name = name;
    }

    /** @return 类型. */
    @Column(name = "TYPE", length = 50)
    public String getType() {
        return this.type;
    }

    /**
     * @param type
     *            类型.
     */
    public void setType(String type) {
        this.type = type;
    }

    /** @return 开始时间. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "START_TIME", length = 26)
    public Date getStartTime() {
        return this.startTime;
    }

    /**
     * @param startTime
     *            开始时间.
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /** @return 结束时间. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "END_TIME", length = 26)
    public Date getEndTime() {
        return this.endTime;
    }

    /**
     * @param endTime
     *            结束时间.
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /** @return 创建人. */
    @Column(name = "CREATOR", length = 64)
    public String getCreator() {
        return this.creator;
    }

    /**
     * @param creator
     *            创建人.
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /** @return 创建时间. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_TIME", length = 26)
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * @param createTime
     *            创建时间.
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** @return 更新人. */
    @Column(name = "UPDATER", length = 64)
    public String getUpdater() {
        return this.updater;
    }

    /**
     * @param updater
     *            更新人.
     */
    public void setUpdater(String updater) {
        this.updater = updater;
    }

    /** @return 更新时间. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATE_TIME", length = 26)
    public Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @param updateTime
     *            更新时间.
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /** @return null. */
    @Column(name = "STATUS", length = 50)
    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     *            null.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** @return 租户. */
    @Column(name = "TENANT_ID", length = 64)
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @param tenantId
     *            租户.
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
}