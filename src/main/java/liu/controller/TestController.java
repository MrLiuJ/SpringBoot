package liu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import liu.bbs.BbsMapper;
import liu.mapper.AdminMapper;
import liu.pojo.Admin;
import liu.pojo.Sort;

@RestController
public class TestController {

/*	@Autowired
	private TestService testservice;
	*/
	@Autowired
	private AdminMapper adminMapper;
	@Autowired
	private BbsMapper bbsMapper;
	
	//jpa
/*	@RequestMapping("insert")
	public String count(Integer id,String name,String pwd,String zhiwei){
		System.out.println("1111111111111111");
		testservice.insert(id,name,pwd,zhiwei);
		return "success";
	}
	
	@RequestMapping("getAdmin")
	public Admin getAdmin(Integer id) {
		System.out.println("---------------");
		return adminDao.findOne(id);
	}*/
	
	//mybatis  test1数据源
	@ResponseBody
	@RequestMapping("getAdminById")
	public Admin getAdminById(String id) {
		return adminMapper.findById(id);
	}
	@ResponseBody
	@RequestMapping("insertBatis")
	public String insertBatis(String name,String pwd,String zhiwei) {
		adminMapper.insert(name, pwd, zhiwei);
		return "success";
	}
	
	//Mybatis  test2数据源
	@ResponseBody
	@RequestMapping("getSortById")
	public Sort getSortById(String id) {
		return bbsMapper.slelctById(id);
	}
	

}
