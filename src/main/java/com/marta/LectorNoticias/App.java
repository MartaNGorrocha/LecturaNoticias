package com.marta.LectorNoticias;





import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.marta.LectorNoticias.reader.CreatorFactory;
import com.marta.LectorNoticias.service.ILogic;


/**
 * Hello world!
 *
 */
public class App 
{
   
	public static void main( String[] args ){
    	
	Logger LOG =LoggerFactory.getLogger(App.class);
		
    
   	ILogic logic = CreatorFactory.getInstancia().getSource();
    java.sql.Date sqlDate = java.sql.Date.valueOf("2020-05-09");
   	LOG.info("Todas");
	logic.showAll();
	LOG.info("Por fecha");

   	logic.showByDate(sqlDate);
   	LOG.info("Por texto");
   	logic.showByString("Noticia1");
   	
   
   	
   	
   	
   	
	
	}
   
    	
    	
    	
    	
			
		
	}
    	
    	
    	
    	

