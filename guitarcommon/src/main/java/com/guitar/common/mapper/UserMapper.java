package com.guitar.common.mapper;

import java.util.List;

import com.guitar.common.base.mapper.GuitarMapper;
import com.guitar.common.po.UserEntity;

public interface UserMapper extends GuitarMapper<UserEntity> {
    
	List<UserEntity> queryUserList();

	List<UserEntity> queryUserList(UserEntity user);

}
