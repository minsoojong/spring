package com.sksalstn.spring.ex.user.Repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
	
	public int insertUser(
			@Param("name") String name
			, @Param("yyyymmdd") String yyyymmdd
			, @Param("email") String email
			, @Param("introduce") String introduse);

}
