package com.mszlu.blog.service;

import com.mszlu.blog.dao.pojo.SysUser;
import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.UserVo;

public interface SysUserService {
    SysUser findUserById(Long userId);

    SysUser findUser(String account, String pwd);

    Result findUserByToken(String token);

    /**
     * 根据account查找Sysuser
     * @param account
     * @return
     */

    SysUser findUserByAccount(String account);

    /**
     * 保存用户
     * @param sysUser
     */

    void save(SysUser sysUser);

    /**
     * 通过userId查询用户信息
     * @param authorId
     * @return
     */

    UserVo findUserVoById(Long authorId);
}
