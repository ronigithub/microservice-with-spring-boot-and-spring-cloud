package com.roni.cards.controller;

import com.roni.cards.model.Card;
import com.roni.cards.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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
}
