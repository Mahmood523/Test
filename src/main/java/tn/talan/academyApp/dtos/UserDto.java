package tn.talan.academyApp.dtos;

import java.util.HashSet;
import java.util.Set;

import tn.talan.academyApp.entities.Role;


public class UserDto {
	
    private Long userId;	
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private Set<Role> roles=new HashSet<>();
	
	public UserDto() {
		super();
	}

	public UserDto(Long userId, String firstName, String lastName, String password, String email, Set<Role> roles) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.roles = roles;
	}
	
	

	public UserDto(String email,String firstName, String lastName, String password ) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
	}

	public UserDto(String email, String password) {
		super();
		this.password = password;
		this.email = email;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	
	

}
