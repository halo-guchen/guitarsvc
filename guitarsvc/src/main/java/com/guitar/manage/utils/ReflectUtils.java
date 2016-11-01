package com.guitar.manage.utils;

import java.lang.reflect.Field;

import com.guitar.common.po.UserEntity;
import com.guitar.manage.restful.bean.system.UserResponseBean;

public class ReflectUtils {

	/**
	 * 两对象直接赋值
	 * @param cls1
	 * @param cls2
	 * @throws Exception
	 */
	public static void generateGetAndSet(Class cls1, Class cls2)
			throws Exception {

		String classTName = GeneralUtil.toLowerCaseFirstOne(cls1.getSimpleName());// 默认定义新实例名称为对象类名的小写(Test -->test)
		String classVName = GeneralUtil.toLowerCaseFirstOne(cls2.getSimpleName());

		// 获得对象的所有成员变量
		Field[] fields = cls1.getDeclaredFields();
		for (Field field : fields) {
			// 获取成员变量的名字
			String name = field.getName(); // 获取成员变量的名字，此处为id，name,age

			// 获取get和set方法的名字
			String getMethodName = "get"+ GeneralUtil.toUpperCaseFirstOne(name);
			String setMethodName = "set"+ GeneralUtil.toUpperCaseFirstOne(name);
			System.out.println(classTName + "." + setMethodName + "("+ classVName + "." + getMethodName + "()" + ")");

			// 获取方法对象
			// Method getMethod = classType.getMethod(getMethodName, new
			// Class[]{});
			// Method setMethod = classType.getMethod(setMethodName, new
			// Class[]{field.getType()});//注意set方法需要传入参数类型
		}

	}

	public static void main(String[] args) throws Exception {
		generateGetAndSet(UserEntity.class, UserResponseBean.class);
	}
}
