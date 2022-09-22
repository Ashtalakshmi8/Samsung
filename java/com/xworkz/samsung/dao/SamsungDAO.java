package com.xworkz.samsung.dao;

import java.util.List;

import com.xworkz.samsung.entity.SamsungEntity;

public interface SamsungDAO {

	public boolean save(SamsungEntity entity);

	public SamsungEntity findByName(String name);

	public void updatePasswordByUserName(String userName, String newPassword);

	public List<SamsungEntity> getAll();

	public boolean deleteByName(String userName);

	public String getOtpFromTable(String otp);

	boolean updateSamsungEntityByName(SamsungEntity samsungEntity);

}