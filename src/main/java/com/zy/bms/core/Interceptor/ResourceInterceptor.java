package com.zy.bms.core.Interceptor;

import com.zy.bms.util.IpUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class ResourceInterceptor extends HandlerInterceptorAdapter {

    private static final String USER_AGENT = "user-agent";
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        String uri = request.getRequestURI();
        logger.info(uri);
        logger.info("UserAgent: {}", request.getHeader(USER_AGENT));
        logger.info("用户访问地址: {}, 来路地址: {}", uri, IpUtil.getIpAddr(request));


        return true;
        //return super.preHandle(request, response, handler);
    }

}
