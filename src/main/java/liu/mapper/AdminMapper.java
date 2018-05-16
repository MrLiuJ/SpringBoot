package liu.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import liu.pojo.Admin;

public interface AdminMapper {
	
	@Select("select * from admin where id = #{id}")
	Admin findById(@Param("id") String id);
	
	@Insert("insert into admin values(#{name},#{pwd},#{zhiwei})")
	int insert(@Param("name") String name,@Param("pwd") String pwd,@Param("zhiwei") String zhiwei);

}
