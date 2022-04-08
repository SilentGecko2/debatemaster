package com.jade.jadedebatemasterv101;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    private ImageView arguementbuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

       arguementbuilder = (ImageView)findViewById(R.id.imgArgumentBuilder);
        ImageView.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(SplashActivity.this, DebateWorldActivity.class);
                startActivity(intent);
            }
        };

    }
}