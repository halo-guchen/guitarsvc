package com.guitar.manage.restful.bean.system;

import com.guitar.common.po.UserEntity;

public class UserConvertUtil {

	public static UserEntity convert(UserQueryBean user) {
		if (null == user) {
			return null;
		}
		UserEntity userEntity = new UserEntity();
		userEntity.setAcount(user.getAcount());
		userEntity.setEmail(user.getEmail());
		userEntity.setLevel(user.getLevel());
		userEntity.setNickName(user.getNickName());
		userEntity.setPhone(user.getPhone());
		userEntity.setRoleId(user.getRoleId());
		userEntity.setSex(user.getSex());
		userEntity.setUserName(user.getUserName());

		return userEntity;
	}

}
