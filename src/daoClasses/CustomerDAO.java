package daoClasses;

import java.util.List;

import pojoClasses.CustomerBase;

public interface CustomerDAO 
{

	public List<CustomerBase> getCustomers();

	public void AddCustomer(CustomerBase customer);

	public CustomerBase updateCustomer(int iD);

	public void deleteCustomer(int iD);
}
