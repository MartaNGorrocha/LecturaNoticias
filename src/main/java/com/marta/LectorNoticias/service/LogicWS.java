package com.marta.LectorNoticias.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.marta.LectorNoticias.model.New;
import com.marta.LectorNoticias.reader.INewsCreator;
import com.marta.LectorNoticias.reader.RSS.NewsCreatorbyRSS;
import com.marta.LectorNoticias.reader.WS.NewsCreatorbyWS;

public class LogicWS implements ILogic {

	Logger LOG =LoggerFactory.getLogger(LogicWS.class);

	public LogicWS() {
		// TODO Auto-generated constructor stub
	}

	private List<New> obtainNews(){
		List<New> narrowNews = new ArrayList<New>(); 
		INewsCreator nc =new NewsCreatorbyWS();
		narrowNews= ((NewsCreatorbyWS) nc).fromNoticiaToNew();
		System.out.println("muestra");
		for (int i = 0; i < narrowNews.size(); i++) {
			System.out.println(narrowNews.get(i).toString());
		}
		return narrowNews;
	}
	@Override
	public List<New> showAll() {
		LOG.info("Dentro de showAll");
		List<New> narrowNews =obtainNews();
		Iterator<New> itNarrowNews = narrowNews.iterator();
		while(itNarrowNews.hasNext()) {
			System.out.println(itNarrowNews.next().toString());
		}
		return narrowNews;
	}

	@Override
	public List<New> showByDate(Date date) {
		List<New> narrowNews =obtainNews();
		Iterator<New> itNarrowNews = narrowNews.iterator();
		List<New> selectedNews = new ArrayList<New>();
		while(itNarrowNews.hasNext()) {
			Date newsDate =(Date) itNarrowNews.next().getPublicationDate();
			if(newsDate == date) 
				selectedNews.add(itNarrowNews.next());
			
			}
		return selectedNews;
	}

	@Override
	public List<New> showByString(String text) {
		List<New> narrowNews =obtainNews();
		Iterator<New> itNarrowNews = narrowNews.iterator();
		List<New> selectedNews = new ArrayList<New>();
		while(itNarrowNews.hasNext()) {
			String writedNew=itNarrowNews.next().toString();
			if(writedNew.indexOf(text)!= (-1)) 
				selectedNews.add(itNarrowNews.next());
			}
		return selectedNews;
	}

}
