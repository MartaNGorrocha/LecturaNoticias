package com.marta.LectorNoticias.reader.BBDD.DAO;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

import com.marta.LectorNoticias.model.New;

public interface INewDao {

	//Selects
	public List<New> findAll() throws SQLException;
	
	public List<New> findByDate(Date date) throws SQLException;
	
	public List<New> findbyString(String text) throws SQLException;

	
	//CRUD Elemental

//	public New findNewById(int id) throws SQLException;
//	
//	public boolean insertNew(New notice) throws SQLException;
//	
//	public boolean updateNew(New notice) throws SQLException;
//	
//	public boolean deleteNew(New notice) throws SQLException;


}
