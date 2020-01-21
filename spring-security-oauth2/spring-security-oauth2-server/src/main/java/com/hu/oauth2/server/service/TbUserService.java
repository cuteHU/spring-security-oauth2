package com.hu.oauth2.server.service;

import com.hu.oauth2.server.domain.TbUser;

/**
 * @author coderHqr
 * @date 2020/1/21 15:12
 */
public interface TbUserService {

    TbUser getByUsername(String username);

}
