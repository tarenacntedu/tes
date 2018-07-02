package com.tarena.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;

import com.tarena.entity.User;
import com.tarena.vo.Page;
import com.tarena.vo.Result;

public interface IUserService {
	//登录
	public boolean loginuser(User user);
	
	


	
}
