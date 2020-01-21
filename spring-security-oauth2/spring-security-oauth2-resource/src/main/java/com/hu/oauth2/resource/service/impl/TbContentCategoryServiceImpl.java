package com.hu.oauth2.resource.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hu.oauth2.resource.mapper.TbContentCategoryMapper;
import com.hu.oauth2.resource.service.TbContentCategoryService;
/**
 * @author coderHqr
 * @date 2020/1/21 16:30
 */
@Service
public class TbContentCategoryServiceImpl implements TbContentCategoryService{

    @Resource
    private TbContentCategoryMapper tbContentCategoryMapper;

}
