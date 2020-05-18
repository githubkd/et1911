package com.etoak.config;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.etoak.action.UserAction;
import com.etoak.service.UserService;

@Configuration /* 相当于<beans/> 是IOC容器 */
public class UserConfig {
      // 使用@Bean
	  //返回类型相当于<bean> 标签类型class 属性
	@Bean("userService")
	public UserService userService() {
		return new UserService();
	}
	@Bean
	public UserAction userAction(@Qualifier("userService")
	UserService userService) {
		UserAction userAction = new UserAction();
		// userAction.setUserService(this.userService());
		
		// 配合@Qualifier使用
		userAction.setUserService(userService);
		return userAction;
	}

}