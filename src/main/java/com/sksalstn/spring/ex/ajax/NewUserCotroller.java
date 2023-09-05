package com.sksalstn.spring.ex.ajax;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sksalstn.spring.ex.user.Service.UserService;
import com.sksalstn.spring.ex.user.domain.User;

@Controller
@RequestMapping("/ajax/user")
public class NewUserCotroller {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/ajax/user/list")
	public String userList(Model model) {
		
		List<User> userList = userService.getUserList();
		model.addAttribute("suerList", userList);
		
		
		return "/ajax/user/list";	
		
	}
	
	@GetMapping("/create")
	@ResponseBody
	public Map<String, String> createUser(
			@RequestParam("name") String name
			, @RequestParam("birthday") String yyyymmdd
			, @RequestParam("email")String email) {
		
		int count = userService.addUser(name, yyyymmdd, email);
		
		// 성공 실패 여부
		// 성공 : {"result":"success" }
		// 실패 : {"result":"fali"
		Map<String, String> resultMap = new HashMap<>();
		if(count == 1) { // 성공
			resultMap.put("result", "success");
			
		}else { // 실패
			resultMap.put("result", "fali");
		}
		
		return resultMap;
		
		
	}
	
	@GetMapping("/input")
	public String userInput() {
		return "ajax/user/input";
	}
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
