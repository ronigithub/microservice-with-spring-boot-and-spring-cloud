package com.roni.loans.controller;

import com.roni.loans.model.Customer;
import com.roni.loans.model.Loan;
import com.roni.loans.service.LoanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loans")
@CrossOrigin
@RequiredArgsConstructor
public class LoanController {

    private final LoanService loanService;

    @PostMapping
    public void create(@RequestBody Loan loan) {
        loanService.create(loan);
    }

    @PostMapping("/myLoans")
    public List<Loan> findAll(@RequestBody Customer customer) {
        return loanService.findAll(customer);
    }
}
