package com.hack.hack_1.LoginActivity;

import android.app.Activity;
import android.os.Handler;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.hack.hack_1.R;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        ImageView logolayout = findViewById(R.id.logo);
        logolayout.animate().alpha(1.0f).scaleX(1.1f).scaleY(1.1f).setDuration(2000);
        Boolean isFirstRun = getSharedPreferences("PREFERENCES", MODE_PRIVATE)
                .getBoolean("isfirstrun", true);
        logolayout.animate().alpha(1.0f).scaleX(1.1f).scaleY(1.1f).setDuration(2500);

        {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    Toast.makeText(SplashActivity.this, "yes", Toast.LENGTH_SHORT).show();
//                    Intent i = new Intent(getApplicationContext(), SplashActivity.class);
//                    startActivity(i);
//                    finish();
//                    finishActivity(0);
                }
            }, 2600);
        }

        startAnimations();

    }
    private void startAnimations() {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        anim.reset();
        LinearLayout l=(LinearLayout) findViewById(R.id.lin_layout);
        l.clearAnimation();
        l.startAnimation(anim);

        anim = AnimationUtils.loadAnimation(this, R.anim.translate);
        anim.reset();
        TextView iv =  findViewById(R.id.textview_logo);
        iv.clearAnimation();
        iv.startAnimation(anim);



    }
}
