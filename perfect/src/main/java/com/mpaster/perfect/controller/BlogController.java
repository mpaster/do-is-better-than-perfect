package com.mpaster.perfect.controller;

import java.util.HashMap;
import java.util.Map;

import com.mpaster.perfect.core.ViewModel;

public class BlogController {

	public ViewModel list(String id){
		Map<String, Object> model = new HashMap<String,Object>();
		model.put("id", id+"555555555555");
		System.out.println("执行了该方法！");
		return new ViewModel("", model);
	}
	
	public ViewModel get(String id){
		Map<String, Object> model = new HashMap<String,Object>();
		model.put("id", "当前获取到的id为："+id);
		System.out.println("执行了该方法！");
		return new ViewModel("", model);
	}
}
