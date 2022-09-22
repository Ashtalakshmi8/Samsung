package com.xworkz.samsung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.samsung.dao.SamsungDAO;
import com.xworkz.samsung.dto.SamsungDTO;
import com.xworkz.samsung.entity.SamsungEntity;
import com.xworkz.samsung.service.SamsungService;

@Controller
@RequestMapping("/")

public class RegisterController {

	@Autowired
	private SamsungService service;

//	@RequestMapping("/")
//	public String home(Model m) {
//		List<Object> objects = service.getAll();
//		m.addAttribute("add", objects);
//		return "edit";
//
//	}

	@RequestMapping("/register")
	public String save(SamsungEntity sam, Model model) {

		System.out.println(" invoking save method");
		SamsungDTO sav = this.service.findbyName(sam.getUserName());
		if (sav == null) {

			boolean sav1 = this.service.valdateAndsave(sam);
			if (sav1) {
				System.out.println("password:" + sam.getPassword());
				System.out.println("saved:" + sam.getCnfrm_password());
				model.addAttribute("sav1", "Registeation done successfully");
				model.addAttribute("save", "congrats..!!!!");
//				model.addAttribute("unme", sam.getFullName());
				model.addAttribute("fullName", sam.getFullName());
				model.addAttribute("UserName", sam.getUserName());
				model.addAttribute("email", sam.getEmail());
				model.addAttribute("password", sam.getPassword());
				model.addAttribute("cpassword", sam.getCnfrm_password());
				model.addAttribute("title", "Register");
				System.out.println("Login success");

				return "register";
			} else {

				model.addAttribute("msg", "invalid password");
//			System.out.println("wrong password");
				System.out.println("password:" + sam.getPassword());
				System.out.println("saved:" + sam.getCnfrm_password());
				return "register";
			}

		}
		model.addAttribute("msg", "user already excits");

		return "register";

	}

	@RequestMapping("/login")
	public String login(String userName, String password, Model model) {

		System.out.println("invoking login ()from controller");
		boolean valid = service.login(userName, password, model);
		if (valid) {
			model.addAttribute("success", "Logged in Successfully!");

			return "welcomenew";
		}
		return "login";
	}

	@PostMapping("/update")
	public String onForgotPassword(SamsungEntity entity, Model model) {
		model.addAttribute("data", entity);

		service.updatePassword(entity.getUserName(), entity.getPassword(), model);
		return "update";
	}

//	@RequestMapping(value = "/getall/", method = RequestMethod.GET)
//	public String getAllInfo(Model model) {
//		System.out.println("getAllInfo() invoked");
//
//		List<Object> allInfo = this.service.getAll();
//		model.addAttribute("getAllInfo", allInfo);
//
//		return "getall";
//
//	}

//	@RequestMapping(value = "/edit/{useName}")
//	public String edit(@PathVariable String userName, Model m) {
//		SamsungEntity entity = dao.findByName(userName);
//		m.addAttribute("zee", entity);
//		return "Welcome";
//	}
//
//	@RequestMapping(value = "/editsave", method = RequestMethod.POST)
//	public String editsave(@ModelAttribute("entity") SamsungEntity entity) {
//		dao.updateSamsungEntityByName(entity);
//		return "redirect:/viewemp";
//	}

//	@RequestMapping("/delete")
//	public String deleteByName(String userName, Model model) {
//		System.out.println("deleteByName() invoked" + userName);
//		boolean isDataValidate = this.service.validateDeleteByName(userName);
//		if (isDataValidate) {
//			boolean deleteByName = this.service.deleteByName(userName);
//			if (deleteByName) {
//				model.addAttribute("DeleteSuccess", "" + userName + " is deleted successfully!!");
//
//			} else
//				model.addAttribute("DeleteMsg", "" + userName + " is not found..please valid name");
//		} else {
//			System.err.println("user not found");
//			model.addAttribute("ErrorMsg", "data is not found..Enter valid data");
//
//		}
//		return "delete";
//
//	}
//
//	@RequestMapping("/otpvalidate")
//	public String onVerify(String otp, Model model) {
//		System.out.println("-----------------------------------------------------------");
//		System.out.println(" Invoked onVerify (from OTP Controller)");
//		boolean isOtpValid = service.validateOtp(otp);
//		if (isOtpValid) {
//			System.out.println(" OTP is valid (message from OTP controller) ");
//			model.addAttribute("validOtp", "OTP not Verified. Please Enter Again");
//			boolean isOtpVerified = service.verifyOtp(otp);
//			if (isOtpVerified) {
//				System.out.println(" OTP Verified (message from OTP controller) ");
//				model.addAttribute("verifyOTP", "OTP Verified");
//
//				List<Object> allInfo = service.getAll();
//				model.addAttribute("ListOfAllData", getAllInfo(model));
//				return "otpvalidate";
//			} else {
//				System.out.println(" OTP Not Verified (message from OTP controller) ");
//			}
//		} else {
//			System.out.println(" Invalid OTP Try Again (message from OTP controller) ");
//			model.addAttribute("invalidOTP", " Invalid OTP Try Again ");
//		}
//		return "otpvalidate";
//	}
//
////	@RequestMapping(value = "/update", method = RequestMethod.POST)
////	public String updateSamsungEntity(@ModelAttribute SamsungDTO samsungDTO, Model model) {
////		System.out.println("update() invoked");
////		boolean isUserDataValidate = this.service.valdateAndsave(samsungDTO);
////		if (isUserDataValidate) {
////			boolean isUpdatedSamsungEntity = this.service.updateSamsungEntity(samsungDTO);
////			if (isUpdatedSamsungEntity) {
////				System.out.println("User data have been updated in database");
////				model.addAttribute("success", " Data is updated successfully ");
////				model.addAttribute("FName", samsungDTO.getFullName());
////				model.addAttribute("UNAME", samsungDTO.getUserName());
////				model.addAttribute("Email", samsungDTO.getEmail());
////				model.addAttribute("password", samsungDTO.getPassword());
////				model.addAttribute("CPaswword", samsungDTO.getCnfrm_password());
////			} else {
////				System.err.println("User data not valid");
////			}
////
/////	} else {
////			System.err.println("Controller  data is not valid");
////			Map<String, String> map = SamsungServiceImpl.map;
////			model.addAttribute("FName", map.get("fullName"));
////			model.addAttribute("UNAME", map.get("userName"));
////			model.addAttribute("Email", map.get("email"));
////			model.addAttribute("password", map.get("password"));
////			model.addAttribute("CPaswword", map.get("confirm_password");
////		}
////		return "welcomenew";
////	}
//// exception dont use
////	@RequestMapping(value = "/update,method=RequestMethod.post")
////	public RedirectView update(@ModelAttribute SamsungDTO entity, HttpServletRequest request) {
////		System.out.println("entity");
////		service.updateSamsungEntity(entity);
////		RedirectView redirectView = new RedirectView();
////		redirectView.setUrl(request.getPathInfo() + "/");
////		return redirectView;
////
////	}
}
