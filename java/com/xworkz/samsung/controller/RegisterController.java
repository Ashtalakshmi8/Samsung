package com.xworkz.samsung.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.samsung.dto.SamsungDTO;
import com.xworkz.samsung.service.SamsungService;

@Controller
@RequestMapping("/")
public class RegisterController {
//	@RequestMapping("/register")
//	public String save() {
//		return "register";
//
//	}

	@Autowired
	private SamsungService service;

	@RequestMapping("/login")
	public String save(SamsungDTO sam, Model model) {

		System.out.println(" invoking save method");
		boolean save = this.service.valdateAndsave(sam);
		if (sam.getPassword().equals(sam.getCnfrm_password())) {
			if (save) {
//			System.out.println("password:"+sam.getPassword());
//			System.out.println("saved:"+ sam.getCnfrm_password());
				model.addAttribute("save", "congrats..!!!!");
				model.addAttribute("unme", sam.getFirstname());
				model.addAttribute("password", sam.getLastname());
				model.addAttribute("email", sam.getEmail());
				model.addAttribute("password", sam.getPassword());
				model.addAttribute("cpassword", sam.getCnfrm_password());
				service.valdateAndsave(sam);
				System.out.println("Login success");

				return "home";
			} else {

				model.addAttribute("msg", "invalid password");
				System.out.println("wrong password");
				return "login";
			}
		}
		return "login";

	}
}
