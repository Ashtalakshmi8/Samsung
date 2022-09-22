package com.xworkz.samsung.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.xworkz.samsung.dao.SamsungDAO;
import com.xworkz.samsung.dto.SamsungDTO;
import com.xworkz.samsung.entity.SamsungEntity;

@Service
public class SamsungServiceImpl implements SamsungService {
	@Autowired
	private MailSender mailSender;

	private static SamsungEntity entity;
	@Autowired
	private SamsungDAO dao;
//	public static Map<String, String> map = new HashMap<>();

	public SamsungServiceImpl() {
		System.out.println("invoking service Impl");
	}

	private int count;

	@Override
	public boolean valdateAndsave(SamsungEntity entity) {
		System.out.println(" service validate and save invoking!!!!");
		if (entity != null) {

			if (entity.getPassword().equals(entity.getCnfrm_password())) {
				BeanUtils.copyProperties(entity, entity);
				dao.save(entity);
				SimpleMailMessage mailMessage = new SimpleMailMessage();
				mailMessage.setFrom("Ashta08@outlook.com");
				mailMessage.setReplyTo("Ashta08@outlook.com");
				mailMessage.setTo(entity.getEmail());
				mailMessage.setSubject("Register successfully");
				mailMessage.setText("Dear hi" + entity.getFullName() + "\n" + "\n" + "successfully registered");
				System.out.println(mailMessage.toString());
				System.out.println("sent mail");
				mailSender.send(mailMessage);

				return true;
			} else {
				System.out.println("please Enter valid Input.....!");

				return false;
			}
		} else {
			System.out.println("invalid data");
			return false;
		}

	}

	@Override
	public SamsungDTO findbyName(String name) {
		System.out.println("invoking service find method");
		SamsungEntity entity = this.dao.findByName(name);
		if (entity != null) {
			SamsungDTO dto = new SamsungDTO();
			BeanUtils.copyProperties(entity, dto);
			return dto;
		}
		return null;
	}

	@Override
	public boolean login(String userName, String password, Model model) {
		System.out.println(userName);
		System.out.println(password);
		SamsungDTO dto = this.findbyName(userName);

		if (dto != null) {
			boolean valid = dto.getPassword().equals(password);
			if (valid) {
				model.addAttribute("displayName", dto.getFullName());
				model.addAttribute("username", dto.getUserName());

				model.addAttribute("email", dto.getEmail());

				this.count = 0;
				return true;
			} else {
				this.count++;
				model.addAttribute("errorPassword", "check the password");
				if (this.count > 3) {
					model.addAttribute("forgotPassword", "Forgot Password");
					System.out.println("forgot password displaying");

					return false;

				}
				return false;
			}
		} else {
			model.addAttribute("errorUsername", "check the username");

			return false;
		}
	}

	@Override
	public void updatePassword(String userName, String newPassword, Model model) {
		System.out.println("uddate password method");
		SamsungEntity entity = dao.findByName(userName);
		if (entity != null) {
			System.out.println("user found as=" + entity.getUserName());
			dao.updatePasswordByUserName(userName, newPassword);

		} else {
			System.out.println("user not found for the given name");
		}
//		SamsungService.super.updatePassword(userName, newPassword, model);

	}

//	@Override
//	public List<Object> getAll() {
//
//		ArrayList<Object> listOfObjects = null;
//		List<SamsungEntity> list = this.dao.getAll();
//		if (list != null && !list.isEmpty()) {
//			listOfObjects = new ArrayList<Object>();
//			for (SamsungEntity samsungEntity : list) {
//				listOfObjects.add(samsungEntity);
//				System.out.println("" + samsungEntity.toString());
//			}
//
//		}
//		return listOfObjects;
//	}
//
//	@Override
//	public boolean validateDeleteByName(String userName) {
//		boolean flag = false;
//		if (userName != null && !userName.isEmpty()) {
//
//			flag = true;
//			System.out.println("----valid username---");
//		} else {
//			flag = false;
//			System.err.println("--invalid username");
//
//		}
//
//		return flag;
//	}
//
//	@Override
//	public boolean deleteByName(String userName) {
//		boolean deleteByName = false;
//
//		deleteByName = this.dao.deleteByName(userName);
//
//		return deleteByName;
//
//	}
//
//	@Override
//	public boolean validateOtp(String otp) {
//		System.out.println("-----------------------------------------------------------");
//		System.out.println("Invoked validateOtp (message from  Service)");
//		boolean valid = false;
//		try {
//			if (otp != null && !otp.isEmpty() && otp.length() == 4) {
//				System.out.println(" OTP is valid (message from  Service) ");
//				valid = true;
//				return valid;
//			} else {
//				System.out.println(" Invalid OTP (message from OTP Service) ");
//			}
//		} catch (Exception exception) {
//			System.out.println(" Invalid OTP Exception (message from OTP Service)" + exception.getMessage());
//		}
//		return valid;
//	}
//
//	@Override
//	public boolean verifyOtp(String otp) {
//		System.out.println("-----------------------------------------------------------");
//		System.out.println("Invoked verifyOtp (message from OTP Service)");
//		boolean verify = false;
//		System.out.println(" Invoked verifyOtp (message from OTP Service)");
//		String otpFromTable = dao.getOtpFromTable(otp);
//		try {
//			if (otp.equals(otpFromTable)) {
//				System.out.println(" OTP is Verified (message from  Service) ");
//				verify = true;
//				return verify;
//			} else {
//				System.out.println(" OTP is not Verified (message from  Service) ");
//			}
//		} catch (Exception exception) {
//			System.out.println(" OTP Not Verified  (message from  Service) " + exception.getMessage());
//		}
//		return verify;
//	}
//
//	@Override
//	public boolean updateSamsungEntity(SamsungDTO samsungDTO) {
//		BeanUtils.copyProperties(samsungDTO, entity);
//		return this.dao.updateSamsungEntityByName(entity);
//	}

}