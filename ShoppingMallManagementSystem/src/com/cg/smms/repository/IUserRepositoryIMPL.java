package com.cg.smms.repository;

import javax.persistence.EntityManager;

import com.cg.smms.entities.User;

public class IUserRepositoryIMPL implements IUserRepository {
private EntityManager entityManager;
	
public IUserRepositoryIMPL() {
	entityManager=JPAUtil.getEntityManager();  
}

@Override
	public void addUser(User user) {
		entityManager.persist(user);
		
	}

	@Override
	public void updateUser(User user) {
		entityManager.merge(user);	
	}

	@Override
	public void deleteUser(int id) {
		entityManager.remove(id);
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}

}
