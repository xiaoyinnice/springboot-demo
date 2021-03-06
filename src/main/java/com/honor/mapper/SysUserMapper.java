package com.honor.mapper;

import com.honor.config.Mapper2;
import com.honor.model.SysUser;

import java.util.List;

/**
 * Created by rongyaowen
 * on 2019/1/3.
 */
public interface SysUserMapper extends Mapper2<SysUser> {

    public List<SysUser> getAllUsers();
}
