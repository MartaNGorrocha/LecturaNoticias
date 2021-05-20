package com.marta.LectorNoticias.reader.WS;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.marta.LectorNoticias.model.New;
import com.marta.LectorNoticias.reader.INewsCreator;

import webservicenoticia.Interoperabilidade;
import webservicenoticia.SQLException_Exception;
import webservicenoticia.xsd.ListaNoticias;
import webservicenoticia.xsd.Noticia;

public class NewsCreatorbyWS implements INewsCreator {
	
	Logger LOG =LoggerFactory.getLogger(NewsCreatorbyWS.class);

	final String USER= "W_PORMAR";
	final String PASSWORD= "Rf6gFp";
	public NewsCreatorbyWS() {
		
	}
	
	
	
	public List<New> fromNoticiaToNew(){
		List<New> lista =new ArrayList<New>(); 
		New notice;
		obtainNoticias();
		for (int i = 0; i < obtainNoticias().size(); i++) {
			notice = new New();
			notice.setTitle(obtainNoticias().get(i).getTitulo().getValue());
			LOG.info(notice.getTitle());
			notice.setDescription(obtainNoticias().get(i).getTextoD().toString());
//			int day = obtainNoticias().get(i).getData().getValue().getDay();
//			int month = obtainNoticias().get(i).getData().getValue().getMonth();
//			int year = obtainNoticias().get(i).getData().getValue().getYear();
//			@SuppressWarnings("deprecation")
//			Date date = new Date(day, month,year); 
			notice.setPublicationDate(getDateFromNoticia(obtainNoticias().get(i)));
			notice.setLink(obtainNoticias().get(i).getLigazonsAdxuntas().get(0).toString());
			LOG.info(notice.toString());
			lista.add(notice);
			
		}
		return lista;
	}
	
	@SuppressWarnings("deprecation")
	private Date getDateFromNoticia(Noticia n) {
		Date date;
		int day = n.getData().getValue().getDay();
		int month = n.getData().getValue().getMonth();
		int year =n.getData().getValue().getYear();
		date = new Date(day, month,year);
		return date;
	}
	private List<Noticia> obtainNoticias(){
		Interoperabilidade inter = new Interoperabilidade();
		
			inter.getInteroperabilidadeHttpSoap11Endpoint().getListadoNoticias();
		
		ListaNoticias lista = new ListaNoticias();
		
		for (Noticia n : lista.getListaNoticias()) {
			System.out.println(n.toString());
			
		}
		
		return lista.getListaNoticias();
	}
}
