package com.github.teamunknown;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private Handler handler = new Handler();
    private Timer timer = new Timer();

    private Asteroid_System as_sys;
    private Background_Movement bg_move;

    @SuppressLint("SourceLockedOrientationActivity")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_view);

        this.getSupportActionBar().hide();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //No error to see here :)

        as_sys = new Asteroid_System(this);
        bg_move = new Background_Movement(this);

        //This is used to call every frame
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        //Put things you want to be called every frame
                        bg_move.move();
                        as_sys.spawn();
                    }
                });
                //The Below numbers are for the timer, this is used to call every (amount) of time.
                //Set to 34 = 30FPS (29.41) 17 = 60fps (58.88)
            }
            //To change fps for the app change the 34 to what ever (Lower is faster)
        }, 0, 34);

    }

    @Override
    protected void onResume() {
        super.onResume();
        bg_move.gravityView.registerListener();
        bg_move.gravityView2.registerListener();
    }

    @Override
    protected void onStop() {
        super.onStop();
        bg_move.gravityView.unRegisterListener();
        bg_move.gravityView2.unRegisterListener();
    }
}
