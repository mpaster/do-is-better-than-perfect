package com.mpaster.perfect.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DispatchProcessor {

	public static ViewModel dispatchRequest(String servletPath, String arg){
		
		String[] paths = servletPath.substring(1).split("/");
		
		Class controllerClazz = null;
		ViewModel viewModel = null;
		
		for(int i = 0; i < paths.length; i++){
			if(i == 0){
				String prefix = paths[i];
				char firstChar = prefix.charAt(0);
				String domainName = (char)(firstChar - 32)+prefix.substring(1);
				String controlerName = domainName + "Controller";
				
				try {
					controllerClazz = Class.forName("com.mpaster.perfect.controller."+controlerName);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}else{
				try {
					Method method = null;
					try {
						method = controllerClazz.getMethod(paths[i], String.class);
					} catch (NoSuchMethodException | SecurityException e) {
						e.printStackTrace();
					}
					viewModel = (ViewModel)method.invoke(controllerClazz.newInstance(), arg);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
						| InstantiationException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		return viewModel;
	}
}
