package com.asses.core.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.asses.core.entity.AirHosterss;
import com.asses.core.entity.Brand;
import com.asses.core.entity.Flight;
import com.asses.core.entity.Product;
import com.asses.core.entity.Team;
import com.asses.core.entity.UserEntity;
import com.asses.core.entity.captain;

public class SessionFactoryUtil 
{
	private  static SessionFactory sessionFactory=null;
	
	
	public static SessionFactory getSessionFactory()
	{
		if(sessionFactory==null)
		{
			Configuration cfg = new Configuration();
			cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
			cfg.addAnnotatedClass(UserEntity.class);
			cfg.addAnnotatedClass(Team.class);//it provids mapping info
			cfg.addAnnotatedClass(captain.class);
			cfg.addAnnotatedClass(Flight.class);
			cfg.addAnnotatedClass(Product.class);
			cfg.addAnnotatedClass(Brand.class);
			cfg.addAnnotatedClass(AirHosterss.class);
			
			sessionFactory = cfg.buildSessionFactory();
			
		}
		return sessionFactory;
		
		
		
	}

}
