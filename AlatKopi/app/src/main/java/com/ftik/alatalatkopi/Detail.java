package com.ftik.alatalatkopi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Detail extends AppCompatActivity implements View.OnClickListener {

    int id;

    ArrayList<String> list_alat, list_deskripsi, list_gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);


        id = application.getId();
        list_alat = new ArrayList<String>();
        list_deskripsi = new ArrayList<String>();
        list_gambar = new ArrayList<String>();

        list_alat = application.getAlat();
        list_deskripsi = application.getDeskripsi();
        list_gambar = application.getFile();

        TextView txtJudul = (TextView) findViewById(R.id.txtJudul);
        TextView txtDeskripsi = (TextView) findViewById(R.id.txtDeskripsi );

        txtJudul.setText(list_alat.get(id).toString());
        txtDeskripsi.setText(list_deskripsi.get(id).toString());

        ImageView btnKembali = (ImageView) findViewById(R.id.btnKembali);
        ImageView btnMenu = (ImageView) findViewById(R.id.btnMenu);

        btnKembali.setOnClickListener(this);
        btnMenu.setOnClickListener(this);

        ImageView img = (ImageView) findViewById(R.id.imageView);
        img.setImageResource(getResources().getIdentifier("com.ftik.alatalatkopi:drawable/" + list_gambar.get(id).toString(), null, null));



    }

    public void onClick(View v)
    {
        int id=v.getId();
        if (id == R.id.btnKembali)
        {
            finish();
        }
        else
        {
            startActivity(new Intent(this, MenuUtama.class));
            finish();
        }
    }

}
