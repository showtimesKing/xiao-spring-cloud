package com.xiao.controller;

import com.xiao.domain.TestData;
import com.xiao.service.ServerOneService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/serverTwo")
public class ServerTwoController {
    @Autowired
    private ServerOneService serverOneService;

    @ApiOperation(value = "测试")
    @RequestMapping(method = RequestMethod.GET)
    public TestData getTestList(@ApiParam("type") @RequestParam(value = "type", defaultValue = "") Integer type
            , @ApiParam("keyword") @RequestParam(value = "keyword", defaultValue = "") String keyword) {

        return serverOneService.serverTwoGetTestData(type, keyword);
    }
}
