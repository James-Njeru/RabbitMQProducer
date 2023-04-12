package com.springbatch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbatch.model.Customer;
import com.springbatch.repository.CustomerRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CustomerService {
	@Autowired
	private CustomerRepository repo;
	
	public List<Customer> listAll() {
        return repo.findAll();
    }
	
	public Customer get(Integer id) {
        return repo.findById(id).get();
    }
}
