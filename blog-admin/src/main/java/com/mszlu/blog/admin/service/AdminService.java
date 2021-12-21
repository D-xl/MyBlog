package com.mszlu.blog.admin.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.mszlu.blog.admin.mapper.AdminMapper;
import com.mszlu.blog.admin.mapper.PermissionMapper;
import com.mszlu.blog.admin.pojo.Admin;
import com.mszlu.blog.admin.pojo.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Autowired
    private PermissionMapper permissionMapper;
    public Admin findAdminByUsername(String username){
        LambdaQueryWrapper<Admin> adminLambdaQueryWrapper = new LambdaQueryWrapper<>();
        adminLambdaQueryWrapper.eq(Admin::getUsername,username);
        adminLambdaQueryWrapper.last("limit 1");
        Admin admin = adminMapper.selectOne(adminLambdaQueryWrapper);
        return admin;
    }

    public List<Permission> findPermissionsByAdminId(Long id) {
        return permissionMapper.findPermissionsByAdminId(id);
    }
}
