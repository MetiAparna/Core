package com.asses.core.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.asses.core.entity.UserEntity;
import com.asses.core.util.SessionFactoryUtil;

public class UserHqlRepository//use to  object based Querys
{
	public List<UserEntity> findAll()
	{
		//String hqlQuery="from UserEntity";
		StringBuilder builder = new StringBuilder();
		builder.append("from UserEntity");
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(builder.toString());
		
		return query.getResultList();
	}
    public List<UserEntity> findByName(String name)
    {
    	StringBuilder builder = new StringBuilder();
		builder.append("from UserEntity where name=:n");
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(builder.toString());
    	query.setParameter("n",name);
    	return query.getResultList();
    }
    //update UserEntity set password=:p where email=:e";    methods--ExecuteUpdate
	public void updatePasswordByEmail(String password,String email)
	{
		StringBuilder builder = new StringBuilder();
		builder.append("update UserEntity set password=:p where email=:e");
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery(builder.toString());
		query.setParameter("p",password);
		query.setParameter("e", email);
		 query.executeUpdate();
		 transaction.commit();
	}
	public void deleteUserByEmail(String email)
	{
		StringBuilder builder = new StringBuilder();
		builder.append("delete from UserEntity where email=:e");
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery(builder.toString());
		query.setParameter("e", email);
		query.executeUpdate();
		transaction.commit();

	}

}
