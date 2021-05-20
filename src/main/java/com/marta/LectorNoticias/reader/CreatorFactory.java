package com.marta.LectorNoticias.reader;

import java.io.IOException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.marta.LectorNoticias.service.ILogic;
import com.marta.LectorNoticias.service.LogicBBDD;
import com.marta.LectorNoticias.service.LogicRSS;
import com.marta.LectorNoticias.service.LogicWS;

public class CreatorFactory {

	Logger LOG =LoggerFactory.getLogger(LogicBBDD.class);
	private static CreatorFactory instancia;
	
	
	private CreatorFactory() {
		// TODO Auto-generated constructor stub
	}
	public static CreatorFactory getInstancia() {
		if(instancia == null) {
			instancia = new CreatorFactory();

		}
		return instancia;
		
}
		 
	public ILogic getSource() {
		Properties properties = new Properties();
		String tipo = "";
		try {
			properties.load(getClass().getResourceAsStream("/configuration.properties"));
			tipo = properties.getProperty ("base.type", "1");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		 
		 if (tipo.equals("1")) {
			 LOG.info("BBDD source");
			 return new LogicBBDD();
		 }else if(tipo.equals("2"))  {
			 LOG.info("RSS source");
			 return new LogicRSS();
		 }else {
			 LOG.info("WS source");
			 return new LogicWS();
		 }
		 
	 }
}
