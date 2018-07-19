/*
 * Copyright (c) 2017 <l_iupeiyu@qq.com> All rights reserved.
 */

package com.zy.bms.core.shiro;

import com.zy.bms.model.console.Admin;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.InvalidSessionException;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * shiro工具类
 * author growingbuds
 * date 2016/12/6 0006 上午 10:45
 */
public class ShiroUtil {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 获取授权主要对象
     */
    public static Subject getSubject(){
        return SecurityUtils.getSubject();
    }

    public static Boolean isLogin(){
        return getSubject().isAuthenticated();
    }

    /**
     * 获取session信息
     * @return
     */
    public static Session getSession(){
        try{
            Session session = getSubject().getSession();
            if (session == null){
                session = getSubject().getSession();
            }
            if (session != null){
                return session;
            }
        }catch (InvalidSessionException e){
            throw new RuntimeException(e);
        }
        return null;
    }

    /**
     * 获取用户信息
     * @return
     */
    public static Admin getUserInfo(){
        try {
            if(getSession() != null){
                Admin admin = (Admin) getSubject().getPrincipals().getPrimaryPrincipal();
                return admin;
            }else{
                return null;
            }
        }catch (Exception e){

        }
        return null;
    }
}
