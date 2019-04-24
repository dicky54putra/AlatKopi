package com.ftik.alatalatkopi;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Kategori extends AppCompatActivity implements View.OnClickListener {

    Context ctx = this;
    private Cursor alat;
    private MyDatabase db;

    ListView list;
    Adapter adapter;
    public  Kategori CustomListView = null;
    public ArrayList<ListModel> CustomListViewValuesArr = new ArrayList<ListModel>();
    public ArrayList data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kategori);


        db = new MyDatabase(this);
        alat = db.getAllData(application.getStatus());
        ArrayList<String> list_nama = new ArrayList<String>();
        ArrayList<String> list_deskripsi = new ArrayList<String>();
        ArrayList<String> list_kategori = new ArrayList<String>();
        ArrayList<String> list_gambar = new ArrayList<String>();

        while (alat.isAfterLast() == false) {
            list_nama.add(alat.getString(alat.getColumnIndex("nama")));
            list_deskripsi.add(alat.getString(alat.getColumnIndex("deskripsi")));
            list_gambar.add(alat.getString(alat.getColumnIndex("gambar")));
            list_kategori.add(alat.getString(alat.getColumnIndex("kategori")));
            alat.moveToNext();
        }

        application.setAlat(list_nama);
        application.setDeskripsi(list_deskripsi);
        application.setFile(list_gambar);
        application.setKategori(list_kategori);

        ArrayList array_list = application.getAlat();

        CustomListView = this;

        for (int i = 0; i < array_list.size(); i++) {

            final ListModel sched = new ListModel();

            /******* Firstly take data in model object ******/
            sched.setCompanyName(list_nama.get(i).toString());
            sched.setImage(list_gambar.get(i).toString());
            //sched.setAddress(list_alamat.get(i).toString());
            sched.setID(i);
            //sched.setUrl(website[i]);

            /******** Take Model Object in ArrayList **********/
            CustomListViewValuesArr.add(sched);
        }

        Resources res = getResources();
        list = (ListView) findViewById(R.id.listview);  // List defined in XML ( See Below )


        adapter = new Adapter(CustomListView, CustomListViewValuesArr, res);
        list.setAdapter(adapter);

        ImageView btn = (ImageView) findViewById(R.id.imageView);
        ImageView btnKembali = (ImageView) findViewById(R.id.btnKembali);
        if (application.getStatus().equals("equipment"))
        {
            btn.setImageResource(R.drawable.pic3);
        }
        else if (application.getStatus().equals("brewers"))
        {
            btn.setImageResource(R.drawable.pic4);
        }
        else if (application.getStatus().equals("tools"))
        {
            btn.setImageResource(R.drawable.pic5);
        }

        btnKembali.setOnClickListener(this);

        TextView txtJudul = (TextView) findViewById(R.id.txtJudul);
        txtJudul.setText(application.getStatus().toUpperCase());

    }

    public void onClick(View v)
    {
        finish();
    }




    public void onItemClick(int id)
    {
        application.setId(id);

        startActivity(new Intent(ctx, Detail.class));
    }




}
