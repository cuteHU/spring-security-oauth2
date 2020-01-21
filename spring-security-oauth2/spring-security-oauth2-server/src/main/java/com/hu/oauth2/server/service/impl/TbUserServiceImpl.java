package com.hu.oauth2.server.service.impl;

import com.hu.oauth2.server.domain.TbUser;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hu.oauth2.server.mapper.TbUserMapper;
import com.hu.oauth2.server.service.TbUserService;
import tk.mybatis.mapper.entity.Example;

/**
 * @author coderHqr
 * @date 2020/1/21 15:12
 */
@Service
public class TbUserServiceImpl implements TbUserService{

    @Resource
    private TbUserMapper tbUserMapper;

    @Override
    public TbUser getByUsername(String username) {
        Example example = new Example(TbUser.class);
        example.createCriteria().andEqualTo(username);
        return tbUserMapper.selectOneByExample(example);
    }
}
