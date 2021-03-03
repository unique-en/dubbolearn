package com.heaboy.provider.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.heaboy.service.sys.entity.SysUserRoles;
import com.baomidou.mybatisplus.extension.service.IService;
import com.heaboy.provider.sys.mapper.SysUserRolesMapper;
import com.heaboy.service.sys.service.ISysUserRolesService;
import org.springframework.util.ObjectUtils;
import org.apache.dubbo.config.annotation.Service;
import java.util.List;

/**
 * <p>
  * $!{table.comment} 服务类
  * </p>
 *
 * @author heaboy
 * @since 2021-01-25
 */
@Service
public class SysUserRolesServiceImpl extends ServiceImpl<SysUserRolesMapper, SysUserRoles> implements ISysUserRolesService {

    @Override
    public IPage<SysUserRoles> index(Page<SysUserRoles> page ,SysUserRoles sysUserRoles){

        QueryWrapper<SysUserRoles> queryWrapper = new QueryWrapper<SysUserRoles>();
        if(!ObjectUtils.isEmpty(sysUserRoles.getSysUserId())) {
            queryWrapper = queryWrapper.like("sys_user_id",sysUserRoles.getSysUserId());
        }
        if(!ObjectUtils.isEmpty(sysUserRoles.getRolesId())) {
            queryWrapper = queryWrapper.like("roles_id",sysUserRoles.getRolesId());
        }
        IPage<SysUserRoles> pageInfo = page(page,queryWrapper);
        return pageInfo;
    }
}
