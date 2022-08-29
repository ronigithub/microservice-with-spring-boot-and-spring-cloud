package com.roni.accounts.service;

import com.roni.accounts.model.Account;
import com.roni.accounts.model.Customer;
import com.roni.accounts.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class AccountService {
    private final AccountRepository accountRepository;
    public void create(Account account) {
        accountRepository.save(account);
    }

    public List<Account> findAll(Customer customer) {
        return accountRepository.findByCustomerId(customer.getCustomerId());
    }
}
