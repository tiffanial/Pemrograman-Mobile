package com.tiffanial.pahlawan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import android.content.Intent;
import android.view.MenuItem;
import android.widget.TextView;

import com.tiffanial.pahlawan.About;
import com.tiffanial.pahlawan.CardPahlawanAdapter;
import com.tiffanial.pahlawan.Pahlawan;
import com.tiffanial.pahlawan.PahlawanData;
import com.tiffanial.pahlawan.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvPahlawan;
    private ArrayList<Pahlawan> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if (getSupportActionBar() !=null) {
            getSupportActionBar().setTitle("PAHLAWAN INDONESIA");
        }

        rvPahlawan = findViewById(R.id.rv_pahlawan);
        rvPahlawan.setHasFixedSize(true);

        list.addAll(PahlawanData.getListData());
        showRecycleList();
    }

    private void showRecycleList() {
        rvPahlawan.setLayoutManager(new LinearLayoutManager(this));
        CardPahlawanAdapter CardPahlawanAdapter = new CardPahlawanAdapter(this, list);
        rvPahlawan.setAdapter(CardPahlawanAdapter);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.about_menu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId()==R.id.abt){
            startActivity(new Intent(MainActivity.this, About.class));
        }
        return true;
    }
}
