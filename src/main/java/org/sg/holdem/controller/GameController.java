package org.sg.holdem.controller;

import org.sg.holdem.domain.GameInitRequest;
import org.sg.holdem.entity.Game;
import org.sg.holdem.repository.GameRepository;
import org.sg.holdem.service.CardService;
import org.sg.holdem.service.GameService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @Autowired
    private GameRepository gameRepository;

    @PostMapping("/holdem/start")
    public Game start(@RequestBody GameInitRequest gameInitRequest) {
        Game game = this.gameService.initGame(gameInitRequest.getUserIdList());

        this.cardService.deal(game.getCards(), game.getPlayers());
        this.gameRepository.save(game);

        return game;
    }

    @GetMapping("/holdem/games")
    public List<Game> retrieveGame() {
        return this.gameRepository.findAll();
    }

    // todo add new field desk in Game
    // todo add new endpoint to deal / update card

}
