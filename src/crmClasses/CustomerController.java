package crmClasses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import daoClasses.*;
import pojoClasses.CustomerBase;
import service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController 
{
	@Autowired
	CustomerService customerDAO;
	
	@RequestMapping("/list")
	public String customerList(Model model){
		List<CustomerBase> customers=customerDAO.getCustomer();
		
		model.addAttribute("customer",customers);
		System.out.println("in index controller");
		return "CustomerList";
	}
	
	@RequestMapping("/deleteCustomer")
	public String CustomerDelete(@RequestParam("customerID") int ID){
		customerDAO.deleteCustomer(ID);
		return "redirect:/customer/list";
		
	}
	
	@RequestMapping("/showCustomerAdd")
	public String CustomerAdd(Model model){
		CustomerBase customerBase=new CustomerBase();
		model.addAttribute("customer",customerBase);
		return "customerAdd";
		
	}
	
	@PostMapping("/saveCustomer")
	public String AddCustomer(@ModelAttribute("customer") CustomerBase customer){
		customerDAO.addCustomer(customer);
		return "redirect:/customer/list";
	}
	
	@GetMapping("/updateCustomer")
	public String updateCustomer(@RequestParam("customerID") int ID,Model model)
	{
		CustomerBase custUP=customerDAO.getCustomer(ID);
		model.addAttribute("customer", custUP);
		return "customerAdd";
	}
}
