package com.hanqing.project.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 资源表
 * </p>
 *
 * @author 含情
 * @since 2021-03-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Resource implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long resourceId;

    /**
     * 父id
     */
    private Long parentId;

    /**
     * 资源名称
     */
    private String resourceName;

    /**
     * 资源类型(0、目录 1、菜单 2、按钮)
     */
    private Integer resourceType;

    /**
     * 请求地址
     */
    private String url;

    /**
     * 权限标识码
     */
    private String code;

    /**
     * 排序
     */
    private Integer sort;


}
