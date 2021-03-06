package com.hanqing.project.vo;

import lombok.Data;

import java.util.List;

@Data
public class ResourceVO {
    /**
     * 主键
     */
    private Long resourceId;
    /**
     * 资源名称
     */
    private String resourceName;
    /**
     * 请求地址
     */
    private String url;
    private List<ResourceVO> subs;
}
