package com.xworkz.samsung.dto;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class SamsungDTO {
	private String fullName;

	private String userName;
	private String email;
	private String password;
	private String cnfrm_password;
	private String otp;
	private int loginCount;
	
}