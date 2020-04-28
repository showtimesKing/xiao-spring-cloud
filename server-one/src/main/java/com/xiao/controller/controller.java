package com.xiao.controller;

import com.xiao.domain.TestData;
import com.xiao.service.ServiceTwoFeign;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server-one-test")
public class controller {
    @Autowired
    private ServiceTwoFeign serviceTwoFeign;

    @ApiOperation(value = "测试")
    @RequestMapping(method = RequestMethod.GET)
    public TestData getTestData(@ApiParam("type") @RequestParam(value = "type", defaultValue = "") Integer type
            , @ApiParam("keyword") @RequestParam(value = "keyword", defaultValue = "") String keyword) {
        return serviceTwoFeign.getTestData(type, keyword);
    }

    @ApiOperation(value = "测试")
    @RequestMapping(value = "/serverTwo", method = RequestMethod.GET)
    public TestData serverTwoGetTestData(@ApiParam("type") @RequestParam(value = "type", defaultValue = "") Integer type
            , @ApiParam("keyword") @RequestParam(value = "keyword", defaultValue = "") String keyword) {
        return new TestData(keyword, type);
    }
}
