package com.zwz.model;

import lombok.Data;

@Data
public class MainTemplateConfig {
    private String author = "Neil";

    private String outputText = "Test";

    /**
     * 循环控制开关
     */
    private Boolean Loop;
}
