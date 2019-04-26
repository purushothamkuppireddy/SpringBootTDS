package com.capg.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.dao.TDSDao;
import com.capg.model.TdsMaster;

@Service
@Transactional
public class TDSServiceImpl implements TDSService {

	@Autowired 
	TDSDao tdsDao;
	@Override
	public TdsMaster getById(int id) {
		
		return tdsDao.getById(id);
	}

}
