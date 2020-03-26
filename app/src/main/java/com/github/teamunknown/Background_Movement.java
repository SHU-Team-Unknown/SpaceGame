package com.github.teamunknown;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import co.gofynd.gravityview.GravityView;

public class Background_Movement {

    public GravityView gravityView;
    public GravityView gravityView2;

    private ImageView view;
    private ImageView view2;

    private DisplayMetrics displayMetrics = new DisplayMetrics();
    private int heightOfScreen;
    private boolean check = false;

    public Activity activity;

    public Background_Movement (Activity activity){
        this.activity = activity;
        this.activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        heightOfScreen = displayMetrics.heightPixels;

        view = activity.findViewById(R.id.bg);
        view2 = activity.findViewById(R.id.bg2);

        view.setY(0);
        view2.setY(-heightOfScreen); // hello please work ;D

        gravityView = gravityView.getInstance(this.activity)
                .setImage(view, R.drawable.background)
                .center();
        gravityView2 = gravityView2.getInstance(this.activity)
                .setImage(view2, R.drawable.background)
                .center();
    }

    //This is used to test out movement of image on the canvas
    public void move (){

        int[] viewLocation = new int[2];
        int[] view2Location = new int[2];
        view.getLocationOnScreen(viewLocation);
        view2.getLocationOnScreen(view2Location);
        int yView = viewLocation[1];
        int y2View = view2Location[1];

        if(yView >= heightOfScreen) {
            view.setY(check ? 0 : -heightOfScreen);
            check = !check;
        }
        if(y2View >= heightOfScreen) {
            view2.setY(check ? -heightOfScreen : 0);
            check = !check;
        }

        view.setY(view.getY() + 1);
        view2.setY(view2.getY() + 1);
    }

}
