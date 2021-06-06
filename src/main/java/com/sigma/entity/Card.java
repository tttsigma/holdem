package com.sigma.entity;

import com.sigma.constants.Rank;
import com.sigma.constants.Suit;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Card {
    private Suit suit;
    private Rank rank;
}
