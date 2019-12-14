package com.playstation.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface GameRepository extends MongoRepository<Game, Integer> {
}
