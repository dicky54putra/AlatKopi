package com.ftik.alatalatkopi;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    final int PAUSE = 2000;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    protected void onStart() {
        super.onStart();

        handler = new Handler();
        handler.postDelayed(r, PAUSE);
    }

    final Runnable r = new Runnable()
    {
        public void run()
        {
            goToNextScreen();
            finish();
        }
    };

    private void goToNextScreen()
    {
        Intent intent1 = new Intent(this, MenuUtama.class);
        this.startActivity(intent1);
    }
}
