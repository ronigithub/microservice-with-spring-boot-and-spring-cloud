package com.roni.cards.service;

import com.roni.cards.model.Card;
import com.roni.cards.model.Customer;
import com.roni.cards.repository.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CardService {
    private final CardRepository cardRepository;
    public void create(Card card) {
        cardRepository.save(card);
    }

    public List<Card> findAll(Customer customer) {
        return cardRepository.findByCustomerId(customer.getCustomerId());
    }


}
