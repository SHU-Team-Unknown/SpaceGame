package com.github.teamunknown;

import java.util.List;

// This will be the class that runs the asteroid system. eg spawning, increaseing speed/amount and so on...
public class Asteroid_System {

    // TODO: 02/03/2020 This is just a basic get up. Need to first look into how the system will work
    // This class does nothing right now
    private  int bondsLeft, bondsRight, bondsTop, bondsBottom;
    private int posY, posX;
    private int rotation;

    private List<Asteroid> asteroids;

    public void spawn(int size){
        //validating size given
        if(size >= 1 && size <= 3) {

        } else {

        }
        // Need to add pass throughs
        // astroids.add(new Astroid());
    }

    public void destroyAsteroid(int asteroid){
        //validating astroid given
        if(asteroid >= 1 && asteroid <= asteroids.size()){

        } else {

        }

    }
}
