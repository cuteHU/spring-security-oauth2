package com.hu.oauth2.resource.controller;

import com.hu.oauth2.resource.domain.TbContent;
import com.hu.oauth2.resource.dto.ResponseResult;
import com.hu.oauth2.resource.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author coderHqr
 * @date 2020/1/21 16:32
 */
@RestController
public class TbContentController {

    @Autowired
    TbContentService tbContentService;

    @GetMapping("/")
    public ResponseResult list(){
        return new ResponseResult().ok(tbContentService.selectAll());
    }

}
