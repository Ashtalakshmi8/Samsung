package com.xworkz.samsung.dto;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class SamsungDTO {

	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String cnfrm_password;

}