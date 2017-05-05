package com.maven1.test;

import java.sql.Timestamp;
import java.util.Date;

import org.hibernate.Session;

import com.maven1.beans.Tramite;
import com.maven1.hibernateuti.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Session session=HibernateUtil.getSessionFactory().openSession();
	
	session.beginTransaction();
	
	//SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	Date date=new Date();
	
	
	Tramite tramite=new Tramite();
	 tramite.setTipoTramite("Por Pagar");
	 tramite.setFechaTramite(new Timestamp(date.getTime()));
	 
	session.save(tramite);
	
	session.getTransaction().commit();
	session.close();
	
	}

}
