package org.sg.holdem.domain;

import org.sg.holdem.constants.Rank;
import org.sg.holdem.constants.Suit;
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
