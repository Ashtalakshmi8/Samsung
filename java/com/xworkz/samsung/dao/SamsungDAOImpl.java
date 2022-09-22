package com.xworkz.samsung.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.samsung.entity.SamsungEntity;

@Component
public class SamsungDAOImpl implements SamsungDAO {

	@Autowired
	private EntityManagerFactory EntityManagerFactory;

	@Override
	public boolean save(SamsungEntity entity) {

		EntityManager entityManager = null;
		EntityTransaction tx = null;
		System.out.println("Entity is invoking!!!!");
		try {

			entityManager = EntityManagerFactory.createEntityManager();
			tx = entityManager.getTransaction();
			tx.begin();
			entityManager.persist(entity);
			tx.commit();
			return true;
		} catch (Exception e) {
			System.out.println("exception in DAOimpl");
			tx.rollback();
			e.printStackTrace();

		} finally {
			if (entityManager != null)
				entityManager.close();

		}

		return false;
	}

	@Override
	public SamsungEntity findByName(String name) {
		EntityManager entityManager = null;

//		String findByName = "FROM SamsungEntity where userName =:name";
//		SamsungEntity entity = null;
		try {
			entityManager = this.EntityManagerFactory.createEntityManager();
//			Query query = entityManager.createQuery(findByName);
			// parameter//
//			query.setParameter("name", name);
			Query query = entityManager.createNamedQuery("findByName");
			query.setParameter("name", name);

			return (SamsungEntity) query.getSingleResult();

//			return (SamsungEntity)  query.setMaxResults(1)).uniqueResult();

//		} catch (NoResultException e) {
//			return (SamsungEntity) query.g
		} catch (Exception e) {
			e.printStackTrace();

		}

		return null;
	}

	@Override
	public void updatePasswordByUserName(String userName, String newPassword) {
		EntityManager entityManager = null;
		EntityTransaction tx = null;
		System.out.println("Entity is invoking!!!!");
		try {

			entityManager = EntityManagerFactory.createEntityManager();
			tx = entityManager.getTransaction();
			tx.begin();
			Query query = entityManager.createNamedQuery("updatePasswordByUserName");
			query.setParameter("un", userName);
			query.setParameter("pass", newPassword);

			int rows = query.executeUpdate();
			System.out.println("No of rows Affected=" + rows);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
//		SamsungDAO.super.updatePasswordByUserName(userName, newPassword);

	}

	@Override
	public List<SamsungEntity> getAll() {
		EntityManager entityManager = null;
		List<SamsungEntity> list = null;
		try {
			entityManager = EntityManagerFactory.createEntityManager();
			Query query = entityManager.createNamedQuery("fetchAll");
			list = query.getResultList();
			if (list.size() > 0 && list != null) {
				return list;
			} else {
				System.err.println("Table is Empty");
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		return list;

	}

	@Override
	public boolean deleteByName(String userName) {

		EntityManager entityManager = null;
		EntityTransaction transaction = null;
//		SamsungEntity samsungEntity = null;
		boolean isDataDeleted = false;
		try {
			entityManager = EntityManagerFactory.createEntityManager();

			transaction = entityManager.getTransaction();
			System.out.println("transation is stared ");
			transaction.begin();
			System.out.println("transation is begin ");

			Query query = entityManager.createNamedQuery("SamsungEntity.deleteByname");
			System.out.println("query is stared " + query);

			query.setParameter("namee", userName);
			int update = query.executeUpdate();
			if (update > 0) {
				System.out.println(update + "record deleted");
				isDataDeleted = true;
				transaction.commit();
			} else {
				System.out.println("No record deleted.. data is not found in database..");
			}

		} catch (Exception e) {
//			entityManager.getTransaction().rollback();
			e.printStackTrace();

		} finally {
			entityManager.close();
			System.out.println("Deleted............");
		}

		return isDataDeleted;
	}

	@Override
	public String getOtpFromTable(String otp) {

//	public SamsungDAOImpl() {
		System.out.println(this.getClass().getSimpleName() + "Bean created");

		System.out.println("invoked getOtpTable (messgae from OTP DAO Impl)");
		EntityManager entityManager = null;
		String Otp = null;
		try {
			entityManager = EntityManagerFactory.createEntityManager();
			Query query = entityManager.createNamedQuery("getOtp");
			query.setParameter("Otp", Otp);
			System.out.println("(messgae from OTP DAO Impl )unique result is :" + Otp);
			if (Otp != null) {
				return Otp;
			} else {
				System.out.println("OTP Not found from DAOImpl)");
			}
		} catch (Exception exception) {
			System.out.println("OTP Not found from DAOImpl)" + exception.getMessage());
		} finally {
			if (entityManager != null) {
				entityManager.close();
				System.out.println("entityManager is closed");
			} else {
				System.out.println("entityManager is  not closed");

			}
		}

		return Otp;

	}

	@Override
	public boolean updateSamsungEntityByName(SamsungEntity samsungEntity) {

		System.out.println("updateSamsungEntityByName--");
		boolean isSamsungEntityUpdated = false;
		EntityManager entityManager = null;
		EntityTransaction tx = null;
		System.out.println("Entity is invoking!!!!");
		try {

			entityManager = EntityManagerFactory.createEntityManager();
			tx = entityManager.getTransaction();
			tx.begin();
			Query query = entityManager.createNamedQuery("updateSamsungEntityByName");
			query.setParameter("fullName", samsungEntity.getFullName());
			query.setParameter("userName", samsungEntity.getUserName());
			query.setParameter("email", samsungEntity.getEmail());
			query.setParameter("password", samsungEntity.getPassword());
			query.setParameter("cnfrm_password", samsungEntity.getCnfrm_password());

			query.executeUpdate();

			tx.commit();
			isSamsungEntityUpdated = true;
		} catch (Exception e) {
			e.printStackTrace();

		}
		return isSamsungEntityUpdated;
	}

}
