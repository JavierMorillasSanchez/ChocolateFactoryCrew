package com.example.chocolatefactorycrew.components.listitemcell;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chocolatefactorycrew.R;

public class QueryViewHolder extends RecyclerView.ViewHolder {

    public TextView txtId, txtName, txtProfession, txtMail;
    public ImageView imgWorker;

    public QueryViewHolder(@NonNull View itemView) {
        super(itemView);

        txtId = itemView.findViewById(R.id.txt_id_cell);
        txtName = itemView.findViewById(R.id.txt_name_cell);
        txtProfession = itemView.findViewById(R.id.txt_profession_cell);
        txtMail = itemView.findViewById(R.id.txt_mail_cell);

        imgWorker = itemView.findViewById(R.id.img_worker_cell);

    }

}
