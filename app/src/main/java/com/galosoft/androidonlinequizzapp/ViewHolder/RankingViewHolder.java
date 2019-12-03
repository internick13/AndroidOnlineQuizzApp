package com.galosoft.androidonlinequizzapp.ViewHolder;

import android.view.View;
import android.widget.TextView;
import com.galosoft.androidonlinequizzapp.Interface.ItemClickListener;
import com.galosoft.androidonlinequizzapp.R;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RankingViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView txt_name, txt_score;
    private ItemClickListener itemClickListener;

    public RankingViewHolder(@NonNull View itemView) {
        super(itemView);
        txt_name = itemView.findViewById(R.id.txt_name);
        txt_score = itemView.findViewById(R.id.txt_score);
        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v, getAdapterPosition(), false);
    }
}

