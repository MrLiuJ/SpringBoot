package liu.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//标识该接口全部返回json格式

@RestController
public class HelloWordController { 
	
	
	@RequestMapping("/index")
	public String index(){
		return "index1111";
	}
	@RequestMapping("/getMap")
	public Map<String , Object> getMap(){
		Map<String , Object> result=new HashMap<String, Object>();
		result.put("error","111111");
		result.put("success","star_楠");
		return result;
	}
	

}
