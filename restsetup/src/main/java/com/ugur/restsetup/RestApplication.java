package com.ugur.restsetup;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;



// İSTEDİĞİMİZ PATH' ile başlasın demek istiyorsak bu şekilde. localhost:8081/example/test
@ApplicationPath("/example")
public class RestApplication extends  Application {

	
	
	@Override
	public Set<Class<?>> getClasses(){
		Set<Class<?>> classes = new HashSet<>();
		classes.add(RestTest.class);
		return classes;
	}
	
}
