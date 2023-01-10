package com.xdev.mp.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

@Data
public class SysUser extends BaseEntity {
    private String id;
    private String userCode;
    private String username;
    private String password;
    private String nickname;
    private String userType;
    private Integer gender;
    private String birthday;
    private String mobile;
    private String phone;
    private String email;
    private String address;
    private String avatar;
    private String postName;
    private String companyId;
    private String company;
    private String unitId;
    private String unit;
    private String deptId;
    private String dept;
    private Boolean enable;
    private String sortIndex;
    @TableLogic
    private Integer delFlag;
    private String remarks;
}
