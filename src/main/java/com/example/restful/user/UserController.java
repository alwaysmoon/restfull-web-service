package com.example.restful.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	// 인스턴스 관리
	// DI 의존성 주입 
	// 스프링에 등록되어 사용되는 인스턴스를 bean 이라고 함
	// 스프링 컨테이너에 등록된 bean 사용은 참조주소를 이용
	// setter 메소드를 이용, 생성자 이용하여 의존성 주입
	private UserDaoService service;
	
	public UserController(UserDaoService service) {
		this.service = service;
	}
	
	@GetMapping("/users")
	public List<User> retrieveAllUsers() {
		return service.findAll();
	}
	
	//GET /users/1 or users/10 --> String 문자 형태로 들어오지만 변수 형을 지정하면 변환되어 들어옴
	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable int id) {
		return service.findOne(id);
	}
 
}
