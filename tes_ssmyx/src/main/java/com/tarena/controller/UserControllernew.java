package com.tarena.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tarena.entity.User;
import com.tarena.service.IUserService;
import com.tarena.vo.Result;

@Controller
@RequestMapping("/user")
public class UserControllernew {
	@Resource(name = "userService")
	private IUserService userService;

	@RequestMapping(value = "/login_for/{name}/{pwd}", method = RequestMethod.GET)
	@ResponseBody
	public Result login(@PathVariable("name") String loginname, @PathVariable("pwd") String password,
			HttpSession session) {
		System.out.println(loginname + password);
		Result result = new Result();
		User user = new User();
		user.setLoginName(loginname);
		user.setPassword(password);
		if (this.userService.loginuser(user)) {
			result.setStatus(1);
			result.setMessage("登录成功");
		} else {
			result.setStatus(0);
			result.setMessage("用户名和密码错误！！！");
		}
		return result;

	}
}
