package com.marta.LectorNoticias.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.sql.Date;
import java.util.List;
//import java.util.Date;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.marta.LectorNoticias.model.New;
import com.marta.LectorNoticias.reader.BBDD.DAO.GenericDao;
import com.marta.LectorNoticias.reader.BBDD.DAO.INewDao;
import com.marta.LectorNoticias.reader.BBDD.DAO.NewDaoImpl;

public class LogicBBDD extends GenericDao implements ILogic {
	
	Logger LOG =LoggerFactory.getLogger(LogicBBDD.class);
	
	
	public LogicBBDD(){
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<New> showAll(){
		INewDao nDao = new NewDaoImpl();
		List<New> lista = new ArrayList<New>();
//		 Iterator<New> it = lista.iterator();
		
		try {
			lista =	nDao.findAll(); 
			LOG.info("se forma la lista de todas las noticias  de "+lista.size()+ " elementos");
//			while(it.hasNext()) {
//				  System.out.println(it.next());
//				}
			for (int i = 0; i < lista.size(); i++) {
				System.out.println(lista.get(i));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}

	@Override
	public List<New> showByDate(java.sql.Date date) {
		INewDao nDao = new NewDaoImpl();
		List<New> lista = new ArrayList<New>();
		try {
			lista =	nDao.findByDate(date); 
			LOG.info("se forma la lista de las noticias publicadas en "+ date + " de "+lista.size()+ " elementos");
			for (int i = 0; i < lista.size(); i++) {
				System.out.println(lista.get(i));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return lista;
	}

	@Override
	public List<New> showByString(String text) {
		INewDao nDao = new NewDaoImpl();
		List<New> lista = new ArrayList<New>();
		try {
			lista =	nDao.findbyString(text); 
			LOG.info("se forma la lista de las noticias que contienen "+ text + " de "+lista.size()+ " elementos");
			for (int i = 0; i < lista.size(); i++) {
				System.out.println(lista.get(i));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return lista;
	}

}
