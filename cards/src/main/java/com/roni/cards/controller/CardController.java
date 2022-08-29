package com.roni.cards.controller;

import com.roni.cards.model.Card;
import com.roni.cards.model.Customer;
import com.roni.cards.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cards")
@CrossOrigin
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;

    @PostMapping
    public void create(@RequestBody Card card) {
        cardService.create(card);
    }

    @PostMapping("/myCards")
    public List<Card> findAll(@RequestBody Customer customer) {
        return cardService.findAll(customer);
    }
}
