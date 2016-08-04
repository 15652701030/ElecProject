package com.chenqi.elec.controller;

import javax.servlet.http.HttpServletRequest;

import com.chenqi.elec.domain.User;
import com.chenqi.elec.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value="/{id}/showUser", method = RequestMethod.POST)
	public String toIndex(HttpServletRequest request,@PathVariable String id){
        User u = userService.getUserById(id);
        request.setAttribute("user", u);
        return "showUser";
	}
	
}
