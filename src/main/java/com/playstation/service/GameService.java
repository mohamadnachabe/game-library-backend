package com.playstation.service;

import com.playstation.repository.Game;
import com.playstation.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.where;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private MongoOperations mongoOps;

    public GameService(GameRepository gameRepository, MongoOperations mongoOps) {
        this.gameRepository = gameRepository;
        this.mongoOps = mongoOps;
    }

    public void storeGame(Game game) {
        gameRepository.save(game);
    }

    public List<Game> getGame(String title) {
        if (title == null || title.isEmpty()) {
            return getGames();
        }
        return mongoOps.find(Query.query(where("name").regex("(?i)".concat(title).concat("*"))), Game.class);
    }

    private List<Game> getGames() {
        return gameRepository.findAll();
    }
}
