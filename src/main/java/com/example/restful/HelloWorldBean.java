package com.example.restful;
// lombok

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // getter, setter, toString 
@AllArgsConstructor // 모든 argument 생성자
@NoArgsConstructor // default 생성자
public class HelloWorldBean {
	
	private String message;

}
