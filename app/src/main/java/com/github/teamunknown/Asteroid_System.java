package com.github.teamunknown;

import android.app.Activity;
import android.widget.ImageView;
import java.util.List;
import java.util.Random;

// This will be the class that runs the asteroid system. eg spawning, increaseing speed/amount and so on...
public class Asteroid_System {

    public Activity activity;
    // TODO: 02/03/2020 This is just a basic get up. Need to first look into how the system will work
    // TODO: 21/03/2020 have add muiltpue arrays to store images, ImageView and if they are being used. need to do some research into Java type of struct/Dictionary

    private int bondsLeft, bondsRight, bondsTop, bondsBottom;
    private int posY, posX;
    private int rotation;

    private int randomNumImageView;
    private int randomNumImage;

    private ImageView imageviews[] = new ImageView[4];
    private int img[] = new int[4];
    private boolean isUsed[] = new boolean[4];

    private List<Asteroid> asteroids;

    private Random rand = new Random(System.currentTimeMillis());

    public Asteroid_System(Activity activity) {
        this.activity = activity;
        imageviews[0] = (ImageView) this.activity.findViewById(R.id.as1);
        imageviews[1] = (ImageView) this.activity.findViewById(R.id.as2);
        imageviews[2] = (ImageView) this.activity.findViewById(R.id.as3);
        imageviews[3] = (ImageView) this.activity.findViewById(R.id.as4);

        img[0] = R.drawable.asteroid2;
        img[1] = R.drawable.asteroid2;
        img[2] = R.drawable.asteroid3;
        img[3] = R.drawable.asteroid3;

        imageviews[0].setImageResource(R.drawable.asteroid3);
        imageviews[0].setX(200);

    }

    public void spawn(int size) {
        //validating size given
        if (size >= 1 && size <= 3) {

        } else {

        }
        // Need to add pass throughs
        // astroids.add(new Astroid());
    }

    public void destroyAsteroid(int asteroid) {
        //validating astroid given
        if (asteroid >= 1 && asteroid <= asteroids.size()) {

        } else {

        }

    }

    public void spawn() {
        //imageviews[0].setY((rand.nextInt(2000)));
        randomNumImageView = rand.nextInt(4);
        while (isUsed[randomNumImageView]) {
            randomNumImageView = rand.nextInt(4);
        }
        //isUsed[randomNumImageView] = true;
        move();
        randomNumImage = rand.nextInt(4);
        imageviews[randomNumImage].setImageResource(img[randomNumImage]);

    }

    public void move() {
        imageviews[randomNumImageView].setX(rand.nextInt(2000) - 1000);
        imageviews[randomNumImageView].setY(rand.nextInt(2000) - 1000);
    }

    public void destroy() {

    }
}
