package com.concretepage.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.concretepage.entity.Battles;
@Transactional
@Repository
public class BattleDAO implements IBattleDAO {
	@PersistenceContext	
	private EntityManager entityManager;	
	@SuppressWarnings("unchecked")
	@Override
	public List<Battles> getAllKingsData() {
		String hql = "FROM Battles";
		return (List<Battles>) entityManager.createQuery(hql).getResultList();
	}
}
