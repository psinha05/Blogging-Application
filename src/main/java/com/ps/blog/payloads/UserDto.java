package com.ps.blog.payloads;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import com.ps.blog.entities.Role;

//import lombok.Setter;
/*
@NoArgsConstructor
@Getter
@Setter*/


public class UserDto {

	private int id;
	
	@NotEmpty
	@Size(min=4, message= "User name be min of 4 chars")
	
	private String name;
	@Email(message= "Email address is not valid !")	
	private String email;
	
	@Size(min=3, max= 10, message ="Password must be of min 3 chars and max of 10 chars")	
	private String password;	
	
	private String about;
	
	private Set<Role> roles = new HashSet<>();
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
}