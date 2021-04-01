package com.hanqing.project.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.hanqing.project.entity.Resource;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hanqing.project.vo.ResourceVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 资源表 Mapper 接口
 * </p>
 *
 * @author 含情
 * @since 2021-03-24
 */
public interface ResourceMapper extends BaseMapper<Resource> {
List<ResourceVO> listResouves(@Param(Constants.WRAPPER)Wrapper<Resource> wrapper);
}
