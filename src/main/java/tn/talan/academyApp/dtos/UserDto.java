package tn.talan.academyApp.dtos;

import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tn.talan.academyApp.entities.Role;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
	
    private Long userId;	
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private Set<Role> roles=new HashSet<>();

}
