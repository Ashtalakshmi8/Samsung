package com.xworkz.samsung.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data

@Entity
@Table(name = "samsungentity")
public class SamsungEntity {
	@Id
	private int id;
	private String fullName;
	private String userName;
	private String email;
	private String password;
	private String createdBy;
	private String createdDate;
	private String updatedBy;
	private String updatedDate;

}
