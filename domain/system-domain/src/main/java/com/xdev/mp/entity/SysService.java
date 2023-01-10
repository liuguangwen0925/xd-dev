package com.xdev.mp.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

@Data
public class SysService extends BaseEntity {

    private String id;
    private String serviceCode;
    private String serviceName;
    private String sortIndex;

    @TableLogic
    private Integer delFlag;
    private String remarks;
}
