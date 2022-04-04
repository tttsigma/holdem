package com.sigma.service;

import com.sigma.constants.Rank;
import com.sigma.constants.Suit;
import com.sigma.domain.Card;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Service
@Slf4j
public class CardService {
    private final Random random = new Random(); //todo ?

    public List<Card> initCards() {
        CardService.log.info("initiating cards...");

        List<Card> cards = new ArrayList<>();

        Rank[] ranks = Rank.values();
        Suit[] suits = Suit.values();

        for (Rank rank : ranks) {
            for (Suit suit : suits) {
                cards.add(Card.builder()
                        .rank(rank)
                        .suit(suit)
                        .build());
            }
        }

        CardService.log.info("cards size:{}", cards.size());
        return cards;
    }

    public Card deal(List<Card> cards) {
        if (!CollectionUtils.isEmpty(cards)) {
            int size = cards.size() - 1;
            int index = this.random.nextInt(size);

            Collections.shuffle(cards);

            Card card = cards.get(index);
            cards.remove(index);
            return card;
        } else {
            return new Card();
        }
    }
}