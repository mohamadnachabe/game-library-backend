package com.playstation.repository;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;

public class Game {

    @Id
    private long id;

    private String name;

    private Platform platform;

    private String genre;

    private LocalDate releaseDate;

    private int numOfPlayers;

    private String publisher;
    
    private String boxArt;

    private Game(String name, Platform platform, String genre, LocalDate releaseDate, int numOfPlayers, String publisher, String boxArt, long id) {
        this.id = id;
        this.name = name;
        this.platform = platform;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.numOfPlayers = numOfPlayers;
        this.publisher = publisher;
        this.boxArt = boxArt;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Platform getPlatform() {
        return platform;
    }

    public String getGenre() {
        return genre;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public int getNumOfPlayers() {
        return numOfPlayers;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getBoxArt() {
        return boxArt;
    }

    public static class Builder {
        
        private long id;

        private String name;
        
        private Platform platform;
        
        private String genre;
        
        private LocalDate releaseDate;
        
        private int numOfPlayers;
        
        private String publisher;
        
        private String boxArt;

        private Builder() {

        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder setId(long id) {
            this.id = id;
            return this;
        }
        
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPlatform(Platform platform) {
            this.platform = platform;
            return this;
        }

        public Builder setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public Builder setReleaseDate(LocalDate releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }

        public Builder setNumOfPlayers(int numOfPlayers) {
            this.numOfPlayers = numOfPlayers;
            return this;
        }

        public Builder setPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder setBoxArt(String boxArt) {
            this.boxArt = boxArt;
            return this;
        }

        public Game build() {
            return new Game(name, platform, genre, releaseDate, numOfPlayers, publisher, boxArt, id);
        }
    }
}
