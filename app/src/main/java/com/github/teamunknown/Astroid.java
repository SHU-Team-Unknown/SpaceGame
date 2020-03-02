package com.github.teamunknown;

import android.widget.ImageView;

//This is used to move the single astroid. eg its spawned as choose to randomly go down and right
public class Astroid {

    // TODO: 02/03/2020 I need to look into what will be need for each astroid. eg image, postion, speed
    //This class does nothing right now
    private ImageView image;
    private int size;
    private float speed, posX,posY,roation;

    public Astroid(ImageView img, int size, float speed){
        image = img;
        this.size = size;
        this.speed = speed;
    }

    public void moveAstroid(){
        image.setPivotX(((image.getX()) + posX)*speed);
    }
}
