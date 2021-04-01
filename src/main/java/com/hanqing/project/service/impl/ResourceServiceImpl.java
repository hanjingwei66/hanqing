package com.hanqing.project.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.ArrayUtils;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.hanqing.project.entity.Resource;
import com.hanqing.project.mapper.ResourceMapper;
import com.hanqing.project.service.IResourceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hanqing.project.vo.ResourceVO;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;
import java.util.List;

/**
 * <p>
 * 资源表 服务实现类
 * </p>
 *
 * @author 含情
 * @since 2021-03-24
 */
@Service
public class ResourceServiceImpl extends ServiceImpl<ResourceMapper, Resource> implements IResourceService {

    @Override
    public List<ResourceVO> listResourceById(Long roleId) {
        QueryWrapper<Resource> query = Wrappers.<Resource>query();
        query.eq("rr.role_id", roleId).isNull("re.parent_id");
        List<ResourceVO> resourceVOS = baseMapper.listResouves(query);
        resourceVOS.forEach(r->{
            Long resourceId = r.getResourceId();
            QueryWrapper<Resource> subQuery = Wrappers.<Resource>query();
            subQuery.eq("rr.role_id", roleId).eq("re.parent_id",resourceId);
            List<ResourceVO> subSources = baseMapper.listResouves(subQuery);
            if(CollectionUtils.isNotEmpty(subSources)){
                r.setSubs(subSources);
            }
        });

        return resourceVOS;
    }
}
