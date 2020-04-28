package com.xiao.service;

import com.xiao.domain.TestData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "server-one")
@RequestMapping("/server-one-test")
public interface ServerOneService {

    @RequestMapping(value = "/serverTwo", method = RequestMethod.GET)
    TestData serverTwoGetTestData(@RequestParam("type") Integer type,
                         @RequestParam("keyword") String keyword);
}
