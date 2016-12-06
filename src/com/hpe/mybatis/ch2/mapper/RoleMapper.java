package com.hpe.mybatis.ch2.mapper;

import com.hpe.mybatis.ch2.po.Role;

public interface RoleMapper {
	public Role getRole(Long id);
	public void deleteRole(Long id);
	public void insertRole(Role role);
	public Role findRole(String string);
}
