package com.tarena.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tarena.service.IRoleService;
import com.tarena.vo.Page;
import com.tarena.vo.Result;

@Controller
@RequestMapping("/role")
public class RoleControllernew {
@Resource(name="rolleservice")
private IRoleService roleservice;
@RequestMapping(value="/roleservice",method=RequestMethod.GET)
@ResponseBody
public Result rolefie(Page page){
	Result result=null;
	page.setRoleKeyword("undefined".equals(page.getRoleKeyword())?"%%":"%"+page.getRoleKeyword()+"%");
	result=this.roleservice.rolefiefindbypage(page);
	return result;
}
}
