package com.yeluo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yeluo.entity.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yeluo
 * @since 2023-02-20
 */
@Repository
public interface SysUserMapper extends BaseMapper<SysUser> {

    List<Long> getNavMenuIds(Long userId);

    List<SysUser> listByMenuId(Long menuId);


}
