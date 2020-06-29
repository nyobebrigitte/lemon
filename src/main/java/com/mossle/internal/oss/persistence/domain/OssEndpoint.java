package com.mossle.internal.oss.persistence.domain;

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
 * OssEndpoint 域名.
 * 
 * @author Lingo
 */
@Entity
@Table(name = "OSS_ENDPOINT")
public class OssEndpoint implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** 主键. */
    private Long id;

    /** 外键. */
    private OssRegion ossRegion;

    /** 类型: internal, external. */
    private String type;

    /** 编码（备用）. */
    private String code;

    /** 名称. */
    private String name;

    /** 状态: active,inactive. */
    private String status;

    /** 创建时间. */
    private Date createTime;

    /** 描述(备用). */
    private String description;

    /** 租户. */
    private String tenantId;

    public OssEndpoint() {
    }

    public OssEndpoint(Long id) {
        this.id = id;
    }

    public OssEndpoint(Long id, OssRegion ossRegion, String type, String code,
            String name, String status, Date createTime, String description,
            String tenantId) {
        this.id = id;
        this.ossRegion = ossRegion;
        this.type = type;
        this.code = code;
        this.name = name;
        this.status = status;
        this.createTime = createTime;
        this.description = description;
        this.tenantId = tenantId;
    }

    /** @return 主键. */
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            主键.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return 外键. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REGION_ID")
    public OssRegion getOssRegion() {
        return this.ossRegion;
    }

    /**
     * @param ossRegion
     *            外键.
     */
    public void setOssRegion(OssRegion ossRegion) {
        this.ossRegion = ossRegion;
    }

    /** @return 类型: internal, external. */
    @Column(name = "TYPE", length = 50)
    public String getType() {
        return this.type;
    }

    /**
     * @param type
     *            类型: internal, external.
     */
    public void setType(String type) {
        this.type = type;
    }

    /** @return 编码（备用）. */
    @Column(name = "CODE", length = 50)
    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     *            编码（备用）.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** @return 名称. */
    @Column(name = "NAME", length = 200)
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

    /** @return 状态: active,inactive. */
    @Column(name = "STATUS", length = 50)
    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     *            状态: active,inactive.
     */
    public void setStatus(String status) {
        this.status = status;
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

    /** @return 描述(备用). */
    @Column(name = "DESCRIPTION", length = 200)
    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     *            描述(备用).
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** @return 租户. */
    @Column(name = "TENANT_ID", length = 50)
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
