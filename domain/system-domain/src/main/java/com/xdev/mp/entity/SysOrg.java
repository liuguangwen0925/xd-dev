package com.xdev.mp.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

@Data
public class SysOrg extends BaseEntity {
    private String id;
    private String orgCode;
    private String orgName;
    private String realName;
    private Integer orgType;
    private String parentId;
    private String fullId;
    private String fullPath;
    private Integer level;
    private String phone;
    private String fax;
    private String email;
    private String address;
    private Integer isCompany;
    private Integer isUnit;
    private Integer isSubCompany;
    private String sortIndex;
    @TableLogic
    private Integer delFlag;
    private String remarks;
}
