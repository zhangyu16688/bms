/*
 * Copyright (c) 2017 <l_iupeiyu@qq.com> All rights reserved.
 */

package com.zy.bms.dao;

import com.zy.bms.model.console.Admin;
import com.zy.bms.util.CustomerMapper;
import org.springframework.stereotype.Service;

/**
 * author growingbuds
 * date 2016/10/21 0021 下午 15:32
 */
@Service
public interface AdminMapper extends CustomerMapper<Admin> {
    Admin selectByUsername(String username);
    void deleteById(String Id);

    void updatePwd(String uid, String pwd);
}
