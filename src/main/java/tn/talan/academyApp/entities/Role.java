package tn.talan.academyApp.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Role implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long roleId;
	
	
	@Enumerated(EnumType.STRING)
	private ERole name;
	
	
	
	public Role() {
		super();
	}
	
	
	
	public Role(Long roleId, ERole name) {
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

	public ERole getName() {
		return name;
	}

	public void setName(ERole name) {
		this.name = name;
	}
	
	
	

}
