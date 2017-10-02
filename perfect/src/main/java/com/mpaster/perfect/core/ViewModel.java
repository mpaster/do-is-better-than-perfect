package com.mpaster.perfect.core;

import java.util.Map;

public class ViewModel {

	private String responsePath;
	private Map<String, Object> model;
	
	public ViewModel(String responsePath, Map<String, Object> model){
		this.responsePath = responsePath;
		this.model = model;
	}
	
	public String getResponsePath() {
		return responsePath;
	}
	public void setResponsePath(String responsePath) {
		this.responsePath = responsePath;
	}
	public Map<String, Object> getModel() {
		return model;
	}
	public void setModel(Map<String, Object> model) {
		this.model = model;
	}
}
