package tn.talan.academyApp.dtos;

import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tn.talan.academyApp.entities.User;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleDto {
	
    private Long roleId;
	private String name;	
	private Set<User> users=new HashSet<>();

}
