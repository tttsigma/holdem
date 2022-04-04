package com.sigma.entity;

import com.sigma.domain.Card;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Game {
    String id;
    int playerNum;
    List<Map<String, List<Card>>> players;
    List<Card> cards;
}
