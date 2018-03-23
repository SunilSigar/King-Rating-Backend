package com.concretepage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concretepage.dao.IBattleDAO;
import com.concretepage.entity.Battles;

@Service
public class BattleService implements IBattleService {
	@Autowired
	private IBattleDAO battleDAO;
	@Override
	public List<Battles> getAllKingsData(){
		return battleDAO.getAllKingsData();
	}
}
