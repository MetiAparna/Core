package com.asses.core.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.asses.core.dto.UserDto;
import com.asses.core.entity.UserEntity;
import com.asses.core.util.ConnectionPropertiesUtil;
import com.asses.core.util.SessionFactoryUtil;

public class UserRepository
{
	public void saveOrUpdate(UserEntity userentity)
	{
		/*
		Configuration cfg = new Configuration();
		cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());//connection properties in cfg1
		cfg.addAnnotatedClass(UserEntity.class);//(mapping in cfg2)it can pass metadata.its a gives extra piece information
		SessionFactory sessionFactory = cfg.buildSessionFactory();	//3reference of seesi0nFactory it wil information is give to database
		//it will match gives a return to object.1.config db
		 * 
		 */
	    SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session =sessionFactory.openSession();	
		Transaction transaction = session.beginTransaction();
		
		session.merge(userentity);
		transaction.commit();
		
	}
	public UserEntity findById(long id)
	{
		/*
		Configuration cfg = new Configuration();
		cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
		cfg.addAnnotatedClass(UserEntity.class);//it provids mapping info
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		*/
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();

		Session session=sessionFactory.openSession();
		return session.get(UserEntity.class, id);
		
	}
	public void update(UserDto userDto) 
	{
		UserEntity userEntity = findById(userDto.getAlt_key());
		if(userEntity!=null) {
			userEntity.setName(userDto.getName());
			userEntity.setCity(userDto.getCity());
			userEntity.setCountry(userDto.getCountry());
			userEntity.setPincode(userDto.getPincode());
			saveOrUpdate(userEntity);
      /*
		Configuration cfg = new Configuration();
		cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
		cfg.addAnnotatedClass(UserEntity.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(userEntity);
		transaction.commit();
		*/
		}
		
	}
/*	public void delete(long id)
	{
		UserEntity userEntity = findById(id);
		if(userEntity!=null) 
		{
			userEntity.setName(userEntity.getName());
			userEntity.setEmail(userEntity.getEmail());
			userEntity.setContactNumber(userEntity.getContactNumber());
			userEntity.setPassword(userEntity.getPassword());
			userEntity.setCity(userEntity.getCity());
			userEntity.setCountry(userEntity.getCountry());
			userEntity.setPincode(userEntity.getPincode());
		    SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
			Session session=sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.delete(userEntity);
			transaction.commit();
			
		
		}
				
	}*/
	public void delete(UserDto userDto1)
	{
		UserEntity userEntity = findById(userDto1.getAlt_key());
		if(userEntity!=null) {
		userEntity.setName(userDto1.getName());
		userEntity.setCity(userDto1.getCity());
		userEntity.setCountry(userDto1.getCountry());
		userEntity.setPincode(userDto1.getPincode());
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(userEntity);
		transaction.commit();
		}

	}

		
}



