package liu.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

//ȫ�ֲ����쳣
@ControllerAdvice
public class ErrorController {
	
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public Map<String , Object> resultMap(){
		Map<String , Object> result=new HashMap<String,Object>(); 
		result.put("errorCode", "404");
		result.put("errorMsg", "ϵͳ����");
		return result;
	} 

}
