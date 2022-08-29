package com.roni.accounts.controller;

import com.roni.accounts.model.Account;
import com.roni.accounts.model.Customer;
import com.roni.accounts.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
@CrossOrigin
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @PostMapping
    public void create(@RequestBody Account account) {
        accountService.create(account);
    }

    @PostMapping("/myDetails")
    public List<Account> findAll(@RequestBody Customer customer) {
        return accountService.findAll(customer);
    }

}
