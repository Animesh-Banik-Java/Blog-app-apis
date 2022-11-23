package com.blogapp.apis.payloads;

import javax.validation.constraints.Email; 
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size; 
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
 
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class UserDto { 
	private int id;
	@NotEmpty
	@Size(min = 4, max = 15, message = "Name shold be min=4 and max=15 charactors..!!")
	private String name;
	@Email(regexp = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}")
	private String email;
	@NotEmpty
	@Size(min = 4, max = 12, message = "Password shold be min=4 and max=15 charactors..!!")
	private String password;
	@NotEmpty
	@Size(min = 5, message = "About shold be min= 5 charactors..!!")
	private String about;
}
