package com.raju.springbootbuildingblocks.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldControllers {
	
	//simpleMethod
	//it need uri and GET
	//@RequestMapping(method=RequestMethod.GET, path= "/helloworld")
	@GetMapping("/helloworld1")
	public String helloworld() {
		return "HelloWolrd again";
	}
	
	@GetMapping("/helloworld-bean")
	public UserDetails helloWorldBean() {
		return new UserDetails("Rajasudhan","Gowda","S A");
		
	}
	
}
