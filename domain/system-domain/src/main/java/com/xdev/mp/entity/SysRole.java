package com.xdev.mp.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

@Data
public class SysRole  extends  BaseEntity{
    private String id;
    private String roleCode;
    private String roleName;
    private Integer roleType;
    private Integer authType;
    private String sortIndex;

    @TableLogic
    private Integer delFlag;
    private String remarks;
}
