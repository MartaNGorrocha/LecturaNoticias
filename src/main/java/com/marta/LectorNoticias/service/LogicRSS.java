package com.marta.LectorNoticias.service;

import java.util.ArrayList;
//import java.util.Date;
import java.sql.Date;
import java.util.Iterator;
import java.util.List;


import com.marta.LectorNoticias.model.New;
import com.marta.LectorNoticias.reader.INewsCreator;
import com.marta.LectorNoticias.reader.RSS.NewsCreatorbyRSS;

public class LogicRSS implements ILogic {
	
	
			
	public LogicRSS() {
		// TODO Auto-generated constructor stub
	}
	
	private List<New> obtainNews(){
		List<New> narrowNews = new ArrayList<New>(); 
		INewsCreator nc =new NewsCreatorbyRSS();
		narrowNews= ((NewsCreatorbyRSS) nc).creatingNews();
		return narrowNews;
	}

	@Override
	public List<New> showAll() {
		List<New> narrowNews =obtainNews();
		Iterator<New> itNarrowNews = narrowNews.iterator();
		while(itNarrowNews.hasNext()) {
			System.out.println(itNarrowNews.next());
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
