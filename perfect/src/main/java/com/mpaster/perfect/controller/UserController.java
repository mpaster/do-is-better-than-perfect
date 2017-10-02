package com.mpaster.perfect.controller;

import java.util.HashMap;
import java.util.Map;

import com.mpaster.perfect.core.ViewModel;

public class UserController {
	
	public ViewModel login(String username){
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("id", "当前登录的用户为："+username);
		return new ViewModel("", model);
	}

}
