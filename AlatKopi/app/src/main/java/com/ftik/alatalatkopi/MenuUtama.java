package com.ftik.alatalatkopi;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MenuUtama extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_utama);

        Button btn1= (Button) findViewById(R.id.button1);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);
        Button btn4 = (Button) findViewById(R.id.button4);
        Button btn5 = (Button) findViewById(R.id.button5);
        Button btn6 = (Button) findViewById(R.id.button6);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);

    }

    public void onClick(View v)
    {
        int id = v.getId();

        if (id == R.id.button2)
        {
            application.setStatus("equipment");
            startActivity(new Intent(this, Kategori.class));

        }
        else if (id == R.id.button3)
        {
            application.setStatus("brewers");
            startActivity(new Intent(this, Kategori.class));

        }
        else if (id == R.id.button4)
        {
            application.setStatus("tools");
            startActivity(new Intent(this, Kategori.class));

        }
        else if (id == R.id.button1)
        {
            startActivity(new Intent(this, JenisKopi.class));
        }
        else if (id == R.id.button5)
        {
            startActivity(new Intent(this, Tentang.class));

        }
        else
        {
            AlertDialog.Builder alt_bld = new AlertDialog.Builder(this);
            alt_bld.setMessage("Anda yakin ingin keluar?").setCancelable(false)
                    .setPositiveButton("YA", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id)
                        {
                            // Action for 'Yes' Button

                            Intent intent = new Intent(Intent.ACTION_MAIN);
                            intent.addCategory(Intent.CATEGORY_HOME);
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            startActivity(intent);


                        }
                    }).setNegativeButton("TIDAK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {

                            //Action for 'NO' Button
                        }
                    });
            AlertDialog alert = alt_bld.create();
            alert.show();
        }
    }


}
