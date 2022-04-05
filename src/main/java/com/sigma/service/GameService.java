package com.sigma.service;

import com.sigma.domain.Card;
import com.sigma.entity.Game;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Slf4j
public class GameService {
    @Autowired
    private CardService cardService;

    public Game initGame(List<String> userIdList) {
        String gameId = UUID.randomUUID().toString();

        // todo exception handling

        Map<String, List<Card>> players = new HashMap<>();
        userIdList.forEach(userId -> players.put(userId, new ArrayList<>()));

        return Game.builder()
                .id(gameId)
                .cards(this.cardService.initCards())
                .playerNum(userIdList.size())
                .players(players)
                .build();
    }
}
