package com.etoak.action;


import com.etoak.bean.User;
import com.etoak.service.UserService;

/*@Controller*/
public class UserAction {
	/* @Autowired */
   private UserService userService;
		
		public void setUserService(UserService userService) {
			this.userService = userService;
		}
   public User getById(Integer id) {
	   return userService.getById(id);
   }
}
