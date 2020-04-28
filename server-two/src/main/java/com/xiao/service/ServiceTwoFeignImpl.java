package com.xiao.service;

import com.xiao.domain.TestData;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceTwoFeignImpl implements ServiceTwoFeign {

    @Override
    public TestData getTestData(Integer type, String keyword) {
        return new TestData(keyword, type);
    }
}
