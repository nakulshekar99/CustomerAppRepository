package com.springboot;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Service {
@Autowired
private CustomerRepository repo;

public MessageResponse create(Customer customerRequest)
{
	
	customerRequest.setId(customerRequest.getId());
	customerRequest.setName(customerRequest.getName());
	customerRequest.setAge(customerRequest.getAge());
	customerRequest.setGender(customerRequest.getGender());
	repo.save(customerRequest);
	return new MessageResponse("Customer created!");
}
public Customer single(Integer id)
{
	return repo.findById(id).get();
}

public List<Customer> getAll()
{
	return repo.findAll();
}
}
