package com.yeluo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yeluo.entity.SysUser;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yeluo
 * @since 2023-02-20
 */
public interface SysUserService extends IService<SysUser> {

    SysUser getByUsername(String username);

    String getUserAuthorityInfo(Long userId);

    void clearUserAuthorityInfo(String username);

    void clearUserAuthorityInfoByRoleId(Long roleId);

    void clearUserAuthorityInfoByMenuId(Long menuId);
}
