package com.sksalstn.spring.ex.user.Repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.sksalstn.spring.ex.user.domain.User;

@Repository
public interface UserRepository {
	
	public int insertUser(
			@Param("name") String name
			, @Param("yyyymmdd") String yyyymmdd
			, @Param("email") String email
			, @Param("introduce") String introduse);
	
	public int insertUserByObject(User user);
	
	public User selectLastUser();
	
	public List<User> selectUserList();

}
