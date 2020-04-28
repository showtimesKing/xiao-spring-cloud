package com.xiao.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class TestData {
    private Long id;
    private String keyword;
    private Integer type;

    public TestData(String keyword, Integer type) {
        this.id = System.currentTimeMillis()/1000;
        this.keyword = keyword;
        this.type = type;
    }
}
