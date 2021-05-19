package com.marta.LectorNoticias;





import java.sql.Date;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.marta.LectorNoticias.model.NewDTO;
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
		
    
   	ILogic logic = CreatorFactory.getInstancia().getSource("5");
	Date date =new Date(2020-19-05);
   	LOG.info("Todas");
	logic.showAll();
	LOG.info("Por fecha");

   	logic.showByDate(date);
   	LOG.info("Por texto");
   	logic.showByString("acto");
   	
   
   	
   	
   	
   	
	
	}
   
    	
    	
    	
    	
			
		
	}
    	
    	
    	
    	

