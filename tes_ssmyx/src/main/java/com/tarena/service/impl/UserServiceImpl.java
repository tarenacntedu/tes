package com.tarena.service.impl;

import java.io.File;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.tarena.dao.ActivityMapper;
import com.tarena.dao.CommentMapper;
import com.tarena.dao.ParticipationMapper;
import com.tarena.dao.UserMapper;
import com.tarena.dao.VideoMapper;
import com.tarena.entity.User;
import com.tarena.entity.UserRole;
import com.tarena.service.IUserService;
import com.tarena.util.CommonValue;
import com.tarena.util.ExcelUtil;
import com.tarena.util.PageUtil;
import com.tarena.util.PrintWriterUtil;
import com.tarena.util.UUIDUtil;
import com.tarena.util.UploadUtil;
import com.tarena.vo.Page;
import com.tarena.vo.Result;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource(name = "userMapper")
	private UserMapper userMapper;
	@Override
	public boolean loginuser(User user) {
		boolean flag=false;
		String user_id=this.userMapper.login(user);
		if(user_id!=null){
			flag=true;
		}
			return flag;
	}
}


	
	