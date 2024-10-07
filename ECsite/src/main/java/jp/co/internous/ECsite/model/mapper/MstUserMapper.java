package jp.co.internous.ECsite.model.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import jp.co.internous.ECsite.model.domain.MstUser;
import jp.co.internous.ECsite.model.form.LoginForm;
@Mapper
public interface MstUserMapper {
	
	@Select(value="select * from mst_user where user_name = #{userName} AND password = #{password}")
	MstUser findByUserNameAndPassword(LoginForm form);
}