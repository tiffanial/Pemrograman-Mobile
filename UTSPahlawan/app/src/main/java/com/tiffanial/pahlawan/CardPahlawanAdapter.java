package com.tiffanial.pahlawan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardPahlawanAdapter extends RecyclerView.Adapter<CardPahlawanAdapter.ListViewHolder>{

    private ArrayList<Pahlawan> listPahlawan;
    private Context context;

    public CardPahlawanAdapter(Context context, ArrayList<Pahlawan> listPahlawan){
        this.listPahlawan = listPahlawan;
        this.context = context;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card_pahlawan_adapter, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        final Pahlawan pahlawan = listPahlawan.get(position);
        Glide.with(holder.itemView.getContext())
                .load(pahlawan.getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(holder.imgPhoto);
        holder.tvName.setText(pahlawan.getName());
        holder.tvDesc.setText(pahlawan.getDescription());

        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detailBP = new Intent(context, DetailPahlawan.class);
                detailBP.putExtra("hero_id", pahlawan.getId());
                context.startActivity(detailBP);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPahlawan.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDesc;
        CardView cv;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_pahlawan_list);
            tvName = itemView.findViewById(R.id.name_pahlawan_list);
            tvDesc = itemView.findViewById(R.id.desc_pahlawan_list);
            cv = itemView.findViewById(R.id.cardview_item);
        }
    }
}
