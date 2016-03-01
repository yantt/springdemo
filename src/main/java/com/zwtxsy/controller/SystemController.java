package com.zwtxsy.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zwtxsy.entity.vo.User;
import com.zwtxsy.service.UserService;

@Controller
public class SystemController {

    @Resource 
    private UserService userService;
	
	@RequestMapping(value={"/",""})
	public String index(HttpServletRequest request,Model model){
		User user = userService.selectOneUser();
		model.addAttribute("user",user);
		return "index";
	}
}
