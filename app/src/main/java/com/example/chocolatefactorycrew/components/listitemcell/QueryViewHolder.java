package com.example.chocolatefactorycrew.components.listitemcell;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chocolatefactorycrew.R;

public class QueryViewHolder extends RecyclerView.ViewHolder {

    public TextView txtLatitude, txtLongitude, txtAvgTemp;
    public ImageView userImg;

    public QueryViewHolder(@NonNull View itemView) {
        super(itemView);
/*
        txtLatitude = itemView.findViewById(R.id.txt_latitude_cell);
        txtLongitude = itemView.findViewById(R.id.txt_longitude_cell);
        txtAvgTemp = itemView.findViewById(R.id.txt_avg_temp_cell);

 */

    }

}
