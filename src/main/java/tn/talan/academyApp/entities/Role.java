package tn.talan.academyApp.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity

public class Role implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long roleId;
	
	private String name;
	private static final long serialVersionUID = 1L;
	@ManyToMany(mappedBy = "roles")
	Set<User> users;
	
	
	public Role() {
		super();
	}
	
	
	
	public Role(Long roleId, String name) {
		super();
		this.roleId = roleId;
		this.name = name;
	}



	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
