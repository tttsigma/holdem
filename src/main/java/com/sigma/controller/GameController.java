package com.sigma.controller;

import com.sigma.entity.Game;
import com.sigma.service.CardService;
import com.sigma.service.GameService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@Slf4j
public class GameController {
    @Autowired
    private CardService cardService;

    @Autowired
    private GameService gameService;

    @GetMapping("/holdem/test")
    public Game start() {
        List<String> userIdList = Arrays.asList("yxf", "me", "xhy", "lxy");
        Game game = this.gameService.initGame(userIdList);
        this.cardService.deal(game.getCards(), game.getPlayers());

        return game;
    }

}
