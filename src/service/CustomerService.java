package service;

import java.util.List;

import pojoClasses.CustomerBase;

public interface CustomerService 
{
	List<CustomerBase> getCustomer();

	 void addCustomer(CustomerBase customer);

	CustomerBase getCustomer(int iD);

	void deleteCustomer(int iD);
}
