package liu.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class IndexController {
	
	
	@RequestMapping("indexController")
	public String indexController(Map<String , Object> result){
		  result.put("size", "5");
		   result.put("name", "5∑…");
			result.put("name", "∑…");
			result.put("sex","1");
			List<String> list=new ArrayList<>();
			list.add("√Œ");
			list.add("Ω‹");
			result.put("userList", list);
		return "index";
	}

}
