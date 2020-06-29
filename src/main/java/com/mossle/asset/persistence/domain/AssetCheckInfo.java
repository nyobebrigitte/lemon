package com.mossle.asset.persistence.domain;

// Generated by Hibernate Tools
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AssetCheckInfo 资产盘点.
 * 
 * @author Lingo
 */
@Entity
@Table(name = "ASSET_CHECK_INFO")
public class AssetCheckInfo implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private String code;

    /** null. */
    private String name;

    /** null. */
    private String userId;

    /** null. */
    private String deptCode;

    /** null. */
    private String deptName;

    /** null. */
    private Date createTime;

    /** null. */
    private String status;

    /** null. */
    private String description;

    /** null. */
    private String tenantId;

    /** . */
    private Set<AssetCheckItem> assetCheckItems = new HashSet<AssetCheckItem>(0);

    public AssetCheckInfo() {
    }

    public AssetCheckInfo(Long id) {
        this.id = id;
    }

    public AssetCheckInfo(Long id, String code, String name, String userId,
            String deptCode, String deptName, Date createTime, String status,
            String description, String tenantId,
            Set<AssetCheckItem> assetCheckItems) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.userId = userId;
        this.deptCode = deptCode;
        this.deptName = deptName;
        this.createTime = createTime;
        this.status = status;
        this.description = description;
        this.tenantId = tenantId;
        this.assetCheckItems = assetCheckItems;
    }

    /** @return null. */
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            null.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @Column(name = "CODE", length = 100)
    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     *            null.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** @return null. */
    @Column(name = "NAME", length = 200)
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     *            null.
     */
    public void setName(String name) {
        this.name = name;
    }

    /** @return null. */
    @Column(name = "USER_ID", length = 64)
    public String getUserId() {
        return this.userId;
    }

    /**
     * @param userId
     *            null.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /** @return null. */
    @Column(name = "DEPT_CODE", length = 50)
    public String getDeptCode() {
        return this.deptCode;
    }

    /**
     * @param deptCode
     *            null.
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /** @return null. */
    @Column(name = "DEPT_NAME", length = 200)
    public String getDeptName() {
        return this.deptName;
    }

    /**
     * @param deptName
     *            null.
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_TIME", length = 26)
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * @param createTime
     *            null.
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    /** @return null. */
    @Column(name = "DESCRIPTION", length = 200)
    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     *            null.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** @return null. */
    @Column(name = "TENANT_ID", length = 64)
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @param tenantId
     *            null.
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "assetCheckInfo")
    public Set<AssetCheckItem> getAssetCheckItems() {
        return this.assetCheckItems;
    }

    /**
     * @param assetCheckItems
     *            .
     */
    public void setAssetCheckItems(Set<AssetCheckItem> assetCheckItems) {
        this.assetCheckItems = assetCheckItems;
    }
}
