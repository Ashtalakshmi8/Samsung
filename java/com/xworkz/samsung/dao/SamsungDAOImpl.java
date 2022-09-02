package com.xworkz.samsung.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.samsung.entity.SamsungEntity;

@Repository
public class SamsungDAOImpl implements SamsungDAO {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public boolean save(SamsungEntity entity) {

		EntityManager entityManager = null;
		EntityTransaction tx = null;
		System.out.println("Entity is invoking!!!!");
		try {

			entityManager = entityManagerFactory.createEntityManager();
			tx = entityManager.getTransaction();
			tx.begin();
			entityManager.persist(entity);
			tx.commit();
			return true;
		} catch (Exception e) {
			System.out.println("exception in DAOimpl");
			// tx.rollback();
			e.printStackTrace();

		} finally {
			if (entityManager != null)
				entityManager.close();

		}
		return false;
	}
}