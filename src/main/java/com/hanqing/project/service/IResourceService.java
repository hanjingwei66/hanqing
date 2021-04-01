package com.hanqing.project.service;

import com.hanqing.project.entity.Resource;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hanqing.project.vo.ResourceVO;

import java.util.List;

/**
 * <p>
 * 资源表 服务类
 * </p>
 *
 * @author 含情
 * @since 2021-03-24
 */
public interface IResourceService extends IService<Resource> {
    List<ResourceVO> listResourceById(Long roleId);
}
