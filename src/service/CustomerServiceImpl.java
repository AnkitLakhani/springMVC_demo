package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import daoClasses.CustomerDAO;
import pojoClasses.CustomerBase;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDAO custommers;
	@Override
	@Transactional
	public List<CustomerBase> getCustomer() {
		System.out.println("in customer serveice");
		return custommers.getCustomers();
	}
	@Override
	
	public void addCustomer(CustomerBase customer) {
		System.out.println("in add customer Service before DAO");
		custommers.AddCustomer(customer);
		
	}
	@Override
	@Transactional
	public CustomerBase getCustomer(int iD) {
		return custommers.updateCustomer(iD);
		
	}
	@Override
	public void deleteCustomer(int iD) {
			custommers.deleteCustomer(iD);
	}

}
