package com.ftik.alatalatkopi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class JenisKopi extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jeniskopi);

        ImageView btn = (ImageView) findViewById(R.id.btnKembali);
        btn.setOnClickListener(this);

    }

    public void onClick(View v)
    {
        finish();
    }

}
