package com.capg.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Repository;

import com.capg.model.TdsMaster;

@Repository
@EntityScan("com.capg.model")
public class TDSDaoImpl implements TDSDao {

	@PersistenceContext
	EntityManager entityManager;
	@Override
	public TdsMaster getById(int id) {
		TdsMaster tdsMaster=entityManager.find(TdsMaster.class,id);
		return tdsMaster;
	}

}
