package com.heaboy.service.test.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.heaboy.common.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author heaboy
 * @since 2021-01-26
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("t_test")
public class Test extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 昵称
     */
    private String userName;

    /**
     * 账户
     */
    private String account;

    /**
     * 密码
     */
    private String pwd;

    /**
     * 职业编码
     */
    private String professionCode;

    /**
     * 头像
     */
    private String icon;

    private Integer status;

    private Integer deleteStatus;


}
