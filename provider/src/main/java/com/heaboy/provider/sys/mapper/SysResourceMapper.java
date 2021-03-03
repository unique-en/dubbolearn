package com.heaboy.provider.sys.mapper;

import com.heaboy.service.sys.entity.SysResource;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author heaboy
 * @since 2021-01-25
 */
public interface SysResourceMapper extends BaseMapper<SysResource> {

    List<SysResource> selectByUsername(String username);
}
