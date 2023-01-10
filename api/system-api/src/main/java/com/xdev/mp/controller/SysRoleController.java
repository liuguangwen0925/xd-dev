package com.xdev.mp.controller;

import com.xdev.mp.JsonResult.Result;
import com.xdev.mp.entity.SysRole;
import com.xdev.mp.service.SysRoleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("system")
public class SysRoleController {

    @Resource
    private SysRoleService sysRoleService;

    @GetMapping("/list")
    public Result getList() {
        List<SysRole> list = sysRoleService.list();
        if (!Objects.isNull(list)) {
            return Result.ok(list);
        } else {
            return Result.fail();
        }
    }
}
