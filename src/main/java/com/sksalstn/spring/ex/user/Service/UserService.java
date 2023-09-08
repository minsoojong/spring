package com.sksalstn.spring.ex.user.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sksalstn.spring.ex.user.Repository.UserRepository;
import com.sksalstn.spring.ex.user.domain.User;

@Service
public class UserService {
	
//	public {
//		int count = userRepository.insertUser(name, birthday, email);
//		
//		return count;
//	}
	
	@Autowired
	private UserRepository userRepository;
	
	public int addUserByObject(User user) {
		int count = userRepository.insertUserByObject(user);
		
		return count;
	}
	
	public User getLastUser() {
		User user = userRepository.selectLastUser();
		
		return user;
	}
	
	public List<User> getUserList() {
		List<User> userList = userRepository.selectUserList();
		
		return userList;
	}
	
	// 중복된 email 인지 확인하는 기능
	public boolean isDuplicateEmail(String email) {
		
		int count = userRepository.selectCountEmail(email);
		
		if(count == 0) {
			//중복되지 않음 
			return false;
		}else {
			// 중복됨
			return true;
			
		}
		
		
		
	}

}
