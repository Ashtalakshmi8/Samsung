package com.xworkz.samsung.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.samsung.dao.SamsungDAO;
import com.xworkz.samsung.dto.SamsungDTO;
import com.xworkz.samsung.entity.SamsungEntity;

@Service
public class SamsungServiceImpl implements SamsungService {
	@Autowired
	private SamsungDAO dao;

	public SamsungServiceImpl() {
		System.out.println("invoking service Impl");
	}

	@Override
	public boolean valdateAndsave(SamsungDTO dto) {
		System.out.println(" service validate and save invoking!!!!");
		if (dto != null) {

			try {
				if (dto.getPassword().equals(dto.getCnfrm_password())) {
					SamsungEntity entity = new SamsungEntity();
					BeanUtils.copyProperties(dto, entity);
					dao.save(entity);
				} else {
					System.out.println("please Enter valid Input.....!");

					return false;

				}

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("exception");
			}
			return false;
		}
		return false;

	}

}
