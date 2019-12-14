package com.playstation.endpoint;

import com.playstation.entities.GameStoreRequest;
import com.playstation.repository.Game;
import com.playstation.repository.Platform;
import com.playstation.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@RestController
public class GameController {

    @Autowired
    private GameService gameService;

    @PostMapping("/storeGame")
    @CrossOrigin
    public String storeGame(@RequestBody GameStoreRequest gameStoreRequest) {
        Game game = Game.Builder
                .newBuilder()
                .setId(gameStoreRequest.getId())
                .setName(gameStoreRequest.getName())
                .setPlatform(gameStoreRequest.getPlatform())
                .setGenre(gameStoreRequest.getGenre())
                .setPublisher(gameStoreRequest.getPublisher())
                .setReleaseDate(gameStoreRequest.getReleaseDate())
                .setNumOfPlayers(gameStoreRequest.getNumOfPlayers())
                .setBoxArt(gameStoreRequest.getBoxArt())
                .build();

//        Game game = Game.Builder
//                .newBuilder()
//                .setId(System.currentTimeMillis())
//                .setName("FIFA 20")
//                .setPlatform(Platform.PS4)
//                .setGenre("Sport")
//                .setPublisher("EA Sports")
//                .setReleaseDate(LocalDate.now())
//                .setNumOfPlayers(6)
//                .setBoxArt("https://images-na.ssl-images-amazon.com/images/I/81lDaY4ZpFL._SX385_.jpg")
//                .build();

        gameService.storeGame(game);
        return "success";
    }

    @GetMapping("/games")
    @CrossOrigin
    public List<Game> getGame(@RequestParam String game) {
        return gameService.getGame(game);
    }


}
