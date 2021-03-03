package com.heaboy.service.sys.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.heaboy.service.sys.entity.SysResource;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
  * $!{table.comment} 服务类
  * </p>
 *
 * @author heaboy
 * @since 2021-01-25
 */
public interface ISysResourceService extends IService<SysResource> {

    /**
    *
    * @param page
    * @param sysResource
    * @return
    */
    IPage<SysResource> index(Page<SysResource> page ,SysResource sysResource);

    List<SysResource> selectByUsername(String username);
}
