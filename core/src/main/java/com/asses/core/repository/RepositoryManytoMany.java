package com.asses.core.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.asses.core.entity.Brand;
import com.asses.core.entity.Team;
import com.asses.core.util.SessionFactoryUtil;

public class RepositoryManytoMany
{
	public void savaBrand(Brand b)
	{
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(b);
		transaction.commit();
	}


}
