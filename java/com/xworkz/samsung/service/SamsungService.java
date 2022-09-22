package com.xworkz.samsung.service;

import org.springframework.ui.Model;

import com.xworkz.samsung.dto.SamsungDTO;
import com.xworkz.samsung.entity.SamsungEntity;

public interface SamsungService {
//	public boolean valdateAndsave(SamsungDTO dto);
	public boolean valdateAndsave(SamsungEntity entity);

	public SamsungDTO findbyName(String name);

	public boolean login(String userName, String password, Model model);

	public void updatePassword(String userName, String newPassword, Model model);
//
//	public List<Object> getAll();
//
//	public boolean validateDeleteByName(String userName);
//
//	public boolean deleteByName(String userName);
//
//	public boolean validateOtp(String otp);
//
//	public boolean verifyOtp(String otp);
//
//	boolean updateSamsungEntity(SamsungDTO samsungDTO);

}
