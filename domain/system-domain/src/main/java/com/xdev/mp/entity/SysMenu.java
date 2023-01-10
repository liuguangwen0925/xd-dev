package com.xdev.mp.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

@Data
public class SysMenu extends BaseEntity {
    private String id;
    private String menuCode;
    private String menuName;
    private Integer type;
    private String parentId;
    private String fullId;
    private String path;
    private String component;
    private String target;
    private String icon;
    private String sortIndex;

    @TableLogic
    private Integer delFlag;
    private String remarks;
}
