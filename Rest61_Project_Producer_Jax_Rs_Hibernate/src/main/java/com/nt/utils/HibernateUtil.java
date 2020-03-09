package com.nt.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sf=null;
	static {
		try {
			sf=new Configuration()
					.configure("com/nt/hibernateConfig/hibernate.cfg.xml")
					.buildSessionFactory();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static SessionFactory getsf() {
		return sf;
	}

}
