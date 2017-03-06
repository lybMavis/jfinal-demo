package com.demo.config;

import com.demo.controller.HelloController;
import com.demo.controller.TestController;
import com.jfinal.config.*;

public class DemoConfig extends JFinalConfig {
	
	@Override
	public void configConstant(Constants me) {
		me.setDevMode(true);
	}
	
	@Override
	public void configRoute(Routes me) {
		me.add("/hello", HelloController.class);
		me.add("/test", TestController.class);
	}
	
	@Override
	public void configPlugin(Plugins me) {
		
	}
	
	@Override
	public void configInterceptor(Interceptors me) {
		
	}
	
	@Override
	public void configHandler(Handlers me) {
		
	}
}
