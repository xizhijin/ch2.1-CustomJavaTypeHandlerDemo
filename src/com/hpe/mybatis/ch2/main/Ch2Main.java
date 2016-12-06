package com.hpe.mybatis.ch2.main;

import org.apache.ibatis.session.SqlSession;

import com.hpe.mybatis.ch2.mapper.RoleMapper;
import com.hpe.mybatis.ch2.util.SqlSessionFactoryUtil;

public class Ch2Main {

	public static void main(String[] args) {
		SqlSession sqlSession = null;
		try {
			sqlSession = SqlSessionFactoryUtil.openSqlSession();
			RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
			roleMapper.findRole("test");
			sqlSession.commit();
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
			sqlSession.rollback();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
	}
}
