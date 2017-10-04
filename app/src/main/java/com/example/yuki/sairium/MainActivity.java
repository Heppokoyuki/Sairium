package com.example.yuki.sairium;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 19) {
            View decor = this.getWindow().getDecorView();
            decor.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        } else {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }


        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (Build.VERSION.SDK_INT >= 19) {
            View decor = this.getWindow().getDecorView();
            decor.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        }
    }

public int counter = 0;

    @Override
    public boolean onTouchEvent(MotionEvent event){
        FrameLayout frameLayout = new FrameLayout(this);
        if(event.getAction() == MotionEvent.ACTION_DOWN) {
            switch(counter){
                case 0:
                    frameLayout.setBackgroundColor(Color.parseColor("#F0A20B"));
                    counter++;
                    break;
                case 1:
                    frameLayout.setBackgroundColor(Color.parseColor("#E9A9E8"));
                    counter++;
                    break;
                case 2:
                    frameLayout.setBackgroundColor(Color.parseColor("#13E8AE"));
                    counter++;
                    break;
                case 3:
                    frameLayout.setBackgroundColor(Color.parseColor("#F23B4C"));
                    counter++;
                    break;
                case 4:
                    frameLayout.setBackgroundColor(Color.parseColor("#49F9B9"));
                    counter++;
                    break;
                case 5:
                    frameLayout.setBackgroundColor(Color.parseColor("#898989"));
                    counter++;
                    break;
                case 6:
                    frameLayout.setBackgroundColor(Color.parseColor("#E6D617"));
                    counter++;
                    break;
                case 7:
                    frameLayout.setBackgroundColor(Color.parseColor("#AE58EB"));
                    counter++;
                    break;
                case 8:
                    frameLayout.setBackgroundColor(Color.parseColor("#FB75E4"));
                    counter = 0;
                    break;

            }
            setContentView(frameLayout);
        }
        return super.onTouchEvent(event);
    }
}
