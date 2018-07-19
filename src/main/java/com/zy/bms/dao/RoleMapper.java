/*
 * Copyright (c) 2017 <l_iupeiyu@qq.com> All rights reserved.
 */

package com.zy.bms.dao;

import com.zy.bms.model.console.Role;
import com.zy.bms.util.CustomerMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * author growingbuds
 * date 2016/10/21 0021 下午 15:32
 */
@Service
public interface RoleMapper extends CustomerMapper<Role> {
    Set<String> findRoleByUserId(String userId);
    List<Role> selectRoleListByAdminId(String Id);
}
