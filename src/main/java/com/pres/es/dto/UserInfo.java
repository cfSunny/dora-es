package com.pres.es.dto;

import cn.pres.cf.interceptor.AuthenticationInfo;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Dora
 * @date 2019/10/25 14:29
 **/
@Data
@Accessors(chain = true)
public class UserInfo extends AuthenticationInfo {
    private String id;

    private String name;
}
