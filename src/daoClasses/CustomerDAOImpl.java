package daoClasses;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pojoClasses.CustomerBase;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public List<CustomerBase> getCustomers() {
		Session session=sessionFactory.getCurrentSession();
		//session.beginTransaction();
		System.out.println("before searching in database");
		Query<CustomerBase> query=session.createQuery("from CustomerBase order by firstName",CustomerBase.class);
		List<CustomerBase> customers=query.getResultList();
		return customers;
	}


	@Override
	@Transactional
	public void AddCustomer(CustomerBase customer) {
		System.out.println("in add customer service");
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(customer);
		
	}


	@Override
	
	public CustomerBase updateCustomer(int iD) {
		Session session=sessionFactory.getCurrentSession();
		return (CustomerBase)session.get(CustomerBase.class, iD);
		
	}


	@Override
	@Transactional
	public void deleteCustomer(int iD) {
			Session session=sessionFactory.getCurrentSession();
			CustomerBase customerbasedelete=session.get(CustomerBase.class, iD);
			session.delete(customerbasedelete);
	}

}
