package com.tiffanial.pahlawan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailPahlawan extends AppCompatActivity {
    private int pahlawan_id;
    ImageView imgDetail;
    TextView tvName, tvDesc;

    private ArrayList<Pahlawan> listPahlawan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pahlawan);

        pahlawan_id = getIntent().getIntExtra("hero_id", 0);
        tvName = findViewById(R.id.name_detail);
        tvDesc = findViewById(R.id.desc_detail);
        imgDetail = findViewById(R.id.img_detail);

        listPahlawan.addAll(PahlawanData.getListData());
        setLayout();
    }

    void setLayout(){
        this.setTitle(listPahlawan.get(pahlawan_id).getName());
        tvName.setText(listPahlawan.get(pahlawan_id).getName());
        tvDesc.setText(listPahlawan.get(pahlawan_id).getDescription());
        Glide.with(this)
                .load(listPahlawan.get(pahlawan_id).getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(imgDetail);
    }
}
