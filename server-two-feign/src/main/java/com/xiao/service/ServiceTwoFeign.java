package com.xiao.service;

import com.xiao.domain.TestData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "server-two")
public interface ServiceTwoFeign {

    @RequestMapping(value = "/getTestData", method = RequestMethod.GET)
    TestData getTestData(@RequestParam("type") Integer type,
                                           @RequestParam("keyword") String keyword);
}
