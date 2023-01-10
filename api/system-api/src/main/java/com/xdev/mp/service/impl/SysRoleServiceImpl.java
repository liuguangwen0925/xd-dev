package com.xdev.mp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xdev.mp.entity.SysRole;
import com.xdev.mp.mapper.SysRoleMapper;
import com.xdev.mp.service.SysRoleService;
import org.springframework.stereotype.Service;

@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {
}
