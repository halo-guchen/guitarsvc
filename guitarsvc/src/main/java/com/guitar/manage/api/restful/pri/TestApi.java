package com.guitar.manage.api.restful.pri;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.guitar.common.po.UserEntity;
import com.guitar.common.service.UserService;
import com.guitar.manage.entity.PageResult;
import com.guitar.manage.enums.WebReturnCode;
import com.guitar.manage.restful.api.BaseApi;
import com.guitar.manage.restful.bean.system.UserConvertUtil;
import com.guitar.manage.restful.bean.system.UserQueryBean;
import com.guitar.manage.restful.bean.system.UserResponseBean;
import com.guitar.manage.task.TestRabbitMqSender;
import com.guitar.manage.utils.ResponseBuilder;

@RequestMapping("v1/private")
@Controller
public class TestApi extends BaseApi {

	private final static Logger logger = Logger.getLogger(TestApi.class);

	@Autowired
	private TestRabbitMqSender send;

	@Autowired
	private UserService userService;

	@RequestMapping("test")
	public void testSend() {
		send.test();
	}

	@RequestMapping("test2/{id}")
	public void restContent(@PathVariable("id") String id) {
		System.out.println("---------------------->连接成功!" + id);
	}

	@ResponseBody
	@RequestMapping("user")
	public ResponseEntity queryAllUser(UserEntity user) {
		List<UserEntity> list = userService.queryAllUser(user);
		return ResponseEntity.ok(list);
	}

	@ResponseBody
	@RequestMapping("user2")
	public ResponseEntity queryAllUser2(UserQueryBean user) {
		try {
			List<UserResponseBean> userResponseBeanList = new ArrayList<UserResponseBean>();
			
			UserEntity userEntity = UserConvertUtil.convert(user);
			List<UserEntity> list = userService.queryAllUser2(userEntity);
			
			for (UserEntity ue : list) {
				UserResponseBean userResponse = new UserResponseBean();
				userResponse.setAcount(ue.getAcount());
				userResponse.setEmail(ue.getEmail());
				userResponse.setLevel(ue.getLevel());
				userResponse.setNickName(ue.getNickName());
				userResponse.setPhone(ue.getPhone());
				userResponse.setRoleId(ue.getRoleId());
				userResponse.setSalt(ue.getSalt());
				userResponse.setSex(ue.getSex());
				userResponse.setUserName(ue.getUserName());
				
				userResponseBeanList.add(userResponse);
				
			}
			return new ResponseBuilder().build(WebReturnCode.SUCCEED, "查询成功!",userResponseBeanList);

		} catch (Exception e) {
			String errMsg = String.format("%s系统错误", "queryAllUser2");
			logger.error(errMsg, e);
			return ResponseBuilder.build(WebReturnCode.SYS_ERR, errMsg, null);
		}

	}
	
	@RequestMapping("user/page")
	@ResponseBody
	public ResponseEntity queryUserByPage(@RequestParam("page") Integer page,
			@RequestParam("pageSize") Integer pageSize, UserQueryBean userQueryBean) {
		try {
			List<UserResponseBean> userResponseBeanList = new ArrayList<UserResponseBean>();
			UserEntity userEntity = UserConvertUtil.convert(userQueryBean);
			PageInfo<UserEntity> pageInfo = userService.queryUserByPage(page,pageSize,userEntity);
			List<UserEntity> list = pageInfo.getList();
			for (UserEntity ue : list) {
				UserResponseBean userResponse = new UserResponseBean();
				userResponse.setAcount(ue.getAcount());
				userResponse.setEmail(ue.getEmail());
				userResponse.setLevel(ue.getLevel());
				userResponse.setNickName(ue.getNickName());
				userResponse.setPhone(ue.getPhone());
				userResponse.setRoleId(ue.getRoleId());
				userResponse.setSalt(ue.getSalt());
				userResponse.setSex(ue.getSex());
				userResponse.setUserName(ue.getUserName());
				
				userResponseBeanList.add(userResponse);
			}
			PageResult<UserResponseBean> pageResult =new PageResult<UserResponseBean>(userResponseBeanList, pageInfo.getPageNum(), pageInfo.getPageSize(),(int)pageInfo.getTotal());
			return new ResponseBuilder().build(WebReturnCode.SUCCEED, "查询成功!",pageResult);
		} catch (Exception e) {
			String errMsg = String.format("%s系统错误", "queryUserByPage");
			logger.error(errMsg, e);
			return ResponseBuilder.build(WebReturnCode.SYS_ERR, errMsg, null);
		}

	}

}
