/*
 * Copyright (c) 2017 <l_iupeiyu@qq.com> All rights reserved.
 */

package com.zy.bms.dao;

import com.zy.bms.model.console.RoleMenu;
import com.zy.bms.util.CustomerMapper;
import org.springframework.stereotype.Service;

@Service
public interface RoleMenuMapper extends CustomerMapper<RoleMenu> {
}