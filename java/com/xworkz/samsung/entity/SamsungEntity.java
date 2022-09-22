package com.xworkz.samsung.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@NamedQuery(name = "findByName", query = "FROM SamsungEntity where user_name=:name")
@NamedQuery(name = "updatePasswordByUserName", query = "Update SamsungEntity set password=:pass where user_name=:un")
@NamedQuery(name = "fetchAll", query = "from SamsungEntity")
//@NamedQueries(value={@NamedQuery(name = "findByName", query = "from SamsungEntity"),
@NamedQuery(name = "SamsungEntity.deleteByname", query = "delete from SamsungEntity where userName =:namee")
@NamedQuery(name = "updateSamsungEntityByName", query = "Update SamsungEntity set fullName=:fullName,userName=:userName,email=:email")
@Data
@Entity
@Table(name = "samsung_entity")
public class SamsungEntity {

	@Id
	@Column(name = "id")
	@GenericGenerator(name = "pk_value", strategy = "increment")
	@GeneratedValue(generator = "pk_value")
	private int id;
	@Column(name = "full_name")
	private String fullName;
	@Column(name = "user_name")
	private String userName;
	private String email;
	private String password;
	private String cnfrm_password;
	@Column(name = "created_by")
	private String createdBy;
	@Column(name = "created_date")

	private String createdDate;
	@Column(name = "updated_by")
	private String updatedBy;
	@Column(name = "updated_date")
	private String updatedDate;
	private String otp;
	private int loginCount;
	

	public SamsungEntity() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCnfrm_password() {
		return cnfrm_password;
	}

	public void setCnfrm_password(String cnfrm_password) {
		this.cnfrm_password = cnfrm_password;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public int getLoginCount() {
		return loginCount;
	}

	public void setLoginCount(int loginCount) {
		this.loginCount = loginCount;
	}

	

	@Override
	public String toString() {
		return "SamsungEntity [id=" + id + ", fullName=" + fullName + ", userName=" + userName + ", email=" + email
				+ ", password=" + password + ", cnfrm_password=" + cnfrm_password + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", updatedBy=" + updatedBy + ", updatedDate=" + updatedDate
				+ ", otp=" + otp + ", loginCount=" + loginCount + "]";
	}

}
