package com.example.restful.user;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	private Integer id;
	
	@Size(min=2, message="Name은 2글자 이상 입력해주세요")
	private String name;
	@Past
	private Date date;
}
