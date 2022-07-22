package com.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
@Autowired
private Service service;
	@RequestMapping(method=RequestMethod.POST,value="/create")
	public MessageResponse create(@RequestBody Customer customerRequest)
	{
		return service.create(customerRequest);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/find/{id}")
	public ResponseEntity<Customer>getCustomerbyId(@PathVariable("id")Integer id)
	{
		Customer customer= service.single(id);
		return new ResponseEntity<>(customer,HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/all")
	public ResponseEntity<List<Customer>> getAllCustomer()
	{
		List<Customer>customers=service.getAll();
		return new ResponseEntity<>(customers,HttpStatus.OK);
	}
}
