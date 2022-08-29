package com.roni.accounts.service;

import com.roni.accounts.model.Customer;
import com.roni.accounts.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;
    public void create(Customer customer) {
        customerRepository.save(customer);
    }
}
