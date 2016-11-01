package com.guitar.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guitar.common.mapper.UserMapper;
import com.guitar.common.po.UserEntity;

@Service
public class UserService extends BaseService<UserEntity> {

	@Autowired
	private UserMapper userMapper;

	public List<UserEntity> queryAllUser(UserEntity user) {
		List<UserEntity> queryList = super.queryList(user);
		// List<UserEntity> queryList = userMapper.queryUserList();
		return queryList;
	}

	public List<UserEntity> queryAllUser2(UserEntity user) {
		List<UserEntity> queryList = userMapper.queryUserList(user);
		return queryList;
	}

	public PageInfo<UserEntity> queryUserByPage(Integer page, Integer pageSize,
			UserEntity user) {
		PageHelper.startPage(page, pageSize);
		List<UserEntity> queryList = userMapper.queryUserList(user);
		return new PageInfo<UserEntity>(queryList);
	}

}
