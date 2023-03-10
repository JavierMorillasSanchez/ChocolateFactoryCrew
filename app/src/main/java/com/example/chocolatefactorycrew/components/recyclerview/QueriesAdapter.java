package com.example.chocolatefactorycrew.components.recyclerview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.chocolatefactorycrew.R;
import com.example.chocolatefactorycrew.components.listitemcell.QueryViewHolder;
import com.example.chocolatefactorycrew.data.workerdata.WorkerData;
import com.example.chocolatefactorycrew.feature.workerdetail.WorkerDetailActivity;

import java.util.ArrayList;

public class QueriesAdapter extends RecyclerView.Adapter<QueryViewHolder> implements IQueriesAdapter {

    private Context context;
    private ArrayList<WorkerData> workerDataArrayList = new ArrayList<>();

    public QueriesAdapter(Context context, ArrayList<WorkerData> workerDataArrayList){
        this.context = context;
        this.workerDataArrayList = workerDataArrayList;
    }

    @NonNull
    @Override
    public QueryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.query_item_cell, parent, false);
        return new QueryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QueryViewHolder holder, @SuppressLint("RecyclerView") int position) {

        WorkerData workerData = workerDataArrayList.get(position);

        holder.txtId.setText(String.valueOf(position+1));
        holder.txtMail.setText(workerData.getEmail());
        holder.txtName.setText(workerData.getFullName());
        holder.txtProfession.setText(workerData.getProfession());
        this.loadImages(workerData.getImage(),holder);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToWorkerDetail(workerData.getId());
            }
        });

    }

    @Override
    public int getItemCount() {
        return workerDataArrayList.size();
    }

    @Override
    public void loadImages(String url, QueryViewHolder imgHolder) {
        Glide.with(context)
                .load(url)
                .error(R.drawable.oompa_loompa_logo)
                .into(imgHolder.imgWorker);
    }

    @Override
    public void navigateToWorkerDetail(String workerId){
        Intent navigateToUserDetail = new Intent(context, WorkerDetailActivity.class);
        navigateToUserDetail.putExtra("workerId",workerId);
        navigateToUserDetail.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(navigateToUserDetail);
    }

}

