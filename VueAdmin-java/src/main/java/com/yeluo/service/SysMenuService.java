package com.yeluo.service;

import com.yeluo.common.dto.SysMenuDto;
import com.yeluo.entity.SysMenu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yeluo
 * @since 2023-02-20
 */
public interface SysMenuService extends IService<SysMenu> {

    List<SysMenuDto> getCurrentUserNav();

    List<SysMenu> tree();

}
