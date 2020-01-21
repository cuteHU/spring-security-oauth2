package com.hu.oauth2.resource.service;

import com.hu.oauth2.resource.domain.TbContent;

import java.util.List;

/**
 * @author coderHqr
 * @date 2020/1/21 16:30
 */
public interface TbContentService {

    List<TbContent> selectAll();

}
