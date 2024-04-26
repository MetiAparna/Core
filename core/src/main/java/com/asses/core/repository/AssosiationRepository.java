package com.asses.core.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.asses.core.entity.Flight;
import com.asses.core.entity.Team;
import com.asses.core.util.SessionFactoryUtil;

public class AssosiationRepository 
{
	public void savaTeamDetails(Team team)
	{
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(team);
		transaction.commit();
	}
	public void savaFlightDetails(Flight flight)
	{
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(flight);
		transaction.commit();
	}

}
