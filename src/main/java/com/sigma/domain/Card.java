package com.sigma.domain;

import com.sigma.constants.Rank;
import com.sigma.constants.Suit;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private Suit suit;
    private Rank rank;

    @Override
    public String toString() {
        return suit.getCardSuit() + rank.getCardRank();
    }
}
