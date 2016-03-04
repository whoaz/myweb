package com.yida.myweb.common.persistance;

import com.yida.myweb.sys.domain.User;

import java.util.Date;

/**
 * Created by zhouk on 2016/3/4.
 */
public class BaseEntity {
    private String id;
    protected String remarks;	// 备注
    protected User createBy;	// 创建者
    protected Date createAt;	// 创建日期
    protected User updateBy;	// 更新者
    protected Date updateAt;	// 更新日期
    protected int delFlag; 	// 删除标记（0：正常；1：删除；2：审核）

    public BaseEntity() {
        delFlag = DEL_FLAG_NORMAL;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public User getCreateBy() {
        return createBy;
    }

    public void setCreateBy(User createBy) {
        this.createBy = createBy;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public User getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(User updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public int getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(int delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * 删除标记（0：正常；1：删除；2：审核；）
     */
    protected static final int DEL_FLAG_NORMAL = 0;
    protected static final int DEL_FLAG_DELETE = 1;
    protected static final int DEL_FLAG_AUDIT = 2;
}
