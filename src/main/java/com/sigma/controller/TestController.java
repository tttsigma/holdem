package com.sigma.controller;

import com.sigma.constants.Rank;
import com.sigma.constants.Suit;
import com.sigma.entity.Card;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class TestController {

    @PostMapping("/card/{id}")
    public void test() {

        Card card = Card.builder()
                .suit(Suit.CLUB)
                .rank(Rank.ACE)
                .build();

        TestController.log.info("card is {}", card);

    }

}
