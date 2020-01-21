package com.hu.oauth2.resource.service.impl;

import com.hu.oauth2.resource.domain.TbContent;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hu.oauth2.resource.mapper.TbContentMapper;
import com.hu.oauth2.resource.service.TbContentService;

import java.util.List;

/**
 * @author coderHqr
 * @date 2020/1/21 16:30
 */
@Service
public class TbContentServiceImpl implements TbContentService{

    @Resource
    private TbContentMapper tbContentMapper;

    @Override
    public List<TbContent> selectAll() {
        return tbContentMapper.selectAll();
    }
}
