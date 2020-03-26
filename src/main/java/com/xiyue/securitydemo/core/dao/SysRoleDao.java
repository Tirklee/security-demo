package com.xiyue.securitydemo.core.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiyue.securitydemo.core.entity.SysRoleEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description 角色DAO
 * @Author Sans
 * @CreateTime 2019/9/14 15:57
 */
@Mapper
public interface SysRoleDao extends BaseMapper<SysRoleEntity> {

}
