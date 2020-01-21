package com.hu.oauth2.server.service;

import com.hu.oauth2.server.domain.TbPermission;

import java.util.List;

/**
 * @author coderHqr
 * @date 2020/1/21 15:22
 */
public interface TbPermissionService {

    List<TbPermission> selectByUserId(Long userId);

}
