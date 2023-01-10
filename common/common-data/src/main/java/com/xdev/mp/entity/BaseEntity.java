package com.xdev.mp.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BaseEntity implements Serializable {
    protected static final long serialVersionUID = 1L;

    /**
     * 创建者ID
     */
    @TableField(value = "create_by", fill = FieldFill.INSERT)
    protected String createBy;

    /**
     * 创建人
     */
    @TableField(value = "create_user", fill = FieldFill.INSERT)
    protected String createUser;

    /**
     * 创建日期
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    protected Date createTime;

    /**
     * 修改人ID
     */
    @TableField(value = "update_by", fill = FieldFill.UPDATE)
    protected String updateBy;

    /**
     * 修改人
     */
    @TableField(value = " update_user", fill = FieldFill.UPDATE)
    protected String  updateUser;

    /**
     * 修改日期
     */
    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    protected Date updateTime;
}
