package com.pres.es.aop;

import cn.pres.cf.interceptor.AuthenticationInfo;
import cn.pres.cf.interceptor.Authenticator;
import cn.pres.cf.utils.AuthenticationUtils;
import com.pres.es.dto.UserInfo;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Dora
 * @date 2019/10/25 14:28
 **/
@Component
public class WebAuthentication implements Authenticator<UserInfo> {
    @Override
    public UserInfo authenticate(HttpServletRequest httpServletRequest) {
        UserInfo userInfo=new UserInfo();
        userInfo.setId("diadia");
        userInfo.setName("nainai");
        AuthenticationUtils.init(userInfo);
        UserInfo userInfo1 =AuthenticationUtils.getAuthenticationInfo();
        System.out.println("userInfo1.getId() = " + userInfo1.getId());
        return userInfo;
    }

}
