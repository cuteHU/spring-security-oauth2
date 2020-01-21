package com.hu.oauth2.server.service.impl;

import com.hu.oauth2.server.domain.TbPermission;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.hu.oauth2.server.mapper.TbPermissionMapper;
import com.hu.oauth2.server.service.TbPermissionService;

import java.util.List;

/**
 * @author coderHqr
 * @date 2020/1/21 15:22
 */
@Service
public class TbPermissionServiceImpl implements TbPermissionService {

    @Resource
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public List<TbPermission> selectByUserId(Long userId) {
        return tbPermissionMapper.selectByUserId(userId);
    }
}
