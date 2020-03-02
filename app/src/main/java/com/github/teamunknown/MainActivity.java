package com.github.teamunknown;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.util.TimeUnit;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private Handler handler = new Handler();
    private Timer timer = new Timer();
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //This is for Testing purposes
        img = (ImageView) findViewById(R.id.TestImage);

        //This is used to call every frame
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        //Put things u want to be called every frame
                        move();
                    }
                });
            }
            //To change fps for the app lower the 60 to what ever (Lower is faster)
        }, 0, 60);

        }

        //This is used to test out movement of image on the canvas
        public void move (){
            img.setY(((img.getY())+5));
    }
}
