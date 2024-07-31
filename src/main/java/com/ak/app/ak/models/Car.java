package com.ak.app.ak.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Car {

    private final Engine engine;

    @Autowired
    public void setMusicPlayer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    private MusicPlayer musicPlayer;

    @Autowired
    public Car(Engine engine){
        this.engine = engine;
    }


    public void startCar(){
        System.out.println("Starting the car.");
        engine.startEngine();
        Optional.ofNullable(musicPlayer).ifPresent(music -> music.startMusic());
    }
}
