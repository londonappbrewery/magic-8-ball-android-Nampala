package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static com.londonappbrewery.magiceightball.R.drawable.ball2;
import static com.londonappbrewery.magiceightball.R.drawable.ball3;
import static com.londonappbrewery.magiceightball.R.drawable.ball4;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button shakeButton = (Button) findViewById(R.id.shake_button);
        final ImageView image8ball = (ImageView) findViewById(R.id.image_8Ball);

        final int[] ballArray = {R.drawable.ball1,R.drawable.ball2, R.drawable.ball3, R.drawable.ball4, R.drawable.ball5};

        shakeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("magiceightball", "Heck yeah!");

                Random numberToChangeBall = new Random();
                int thisNumber = numberToChangeBall.nextInt(5);
                Log.d("magiceightball", "The random number is: " + thisNumber);
                image8ball.setImageResource(ballArray[thisNumber]);
            }

        });

    }

}
