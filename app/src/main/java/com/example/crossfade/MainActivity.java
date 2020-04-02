package com.example.crossfade;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private TransitionDrawable transitionDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.image_view);
        transitionDrawable = (TransitionDrawable) imageView.getBackground();
        // crossfade enable
        transitionDrawable.setCrossFadeEnabled(true);

        // animation start
        Button buttonStart = findViewById(R.id.button_start);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                transitionDrawable.startTransition(3000);
            }
        });

        // reverse
        Button buttonReverse = findViewById(R.id.button_reverse);
        buttonReverse.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                transitionDrawable.reverseTransition(1000);
            }
        });

        // reset
        Button buttonReset = findViewById(R.id.button_reset);
        buttonReset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                transitionDrawable.resetTransition();
            }
        });
    }
}