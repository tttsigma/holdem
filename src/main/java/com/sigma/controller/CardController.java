package com.sigma.controller;

import com.sigma.domain.Card;
import com.sigma.service.CardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class CardController {
    @Autowired
    private CardService cardService;

    @GetMapping("/card/test")
    public List<Card> getCards() {
        List<Card> result = this.cardService.initCards();

        CardController.log.info("show card:{}", result);

        return result;
    }

    @GetMapping("/card/deal")
    public String deal() {
        List<Card> cards = this.cardService.initCards();
        List<Card> result = new ArrayList<>();

        for (int i = 0; i < 13; i++) {
            Card card = this.cardService.deal(cards);
            result.add(card);
        }

        return result.toString();
    }

}
