package liu.bbs;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import liu.pojo.Sort;

public interface BbsMapper {
	
	@Select("select * from bbs_sort where id = #{id}")
	Sort slelctById(@Param("id")String id);

}
