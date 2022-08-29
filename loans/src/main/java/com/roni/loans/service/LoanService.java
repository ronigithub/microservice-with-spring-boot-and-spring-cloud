package com.roni.loans.service;

import com.roni.loans.model.Customer;
import com.roni.loans.model.Loan;
import com.roni.loans.repository.LoanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class LoanService {
    private final LoanRepository loanRepository;
    public void create(Loan loan) {
        loanRepository.save(loan);
    }

    public List<Loan> findAll(Customer customer) {
        return loanRepository.findByCustomerId(customer.getCustomerId());
    }


}
