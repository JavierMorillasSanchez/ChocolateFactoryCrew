package com.example.chocolatefactorycrew.components.recyclerview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chocolatefactorycrew.R;
import com.example.chocolatefactorycrew.components.listitemcell.QueryViewHolder;
import com.example.chocolatefactorycrew.data.allcrew.allcrewdata.AllCrewDataIn;
import com.example.chocolatefactorycrew.data.workerdata.workercalldata.WorkerCallDataOut;
import com.example.chocolatefactorycrew.data.workerdata.WorkerData;

import java.util.ArrayList;

public class QueriesAdapter extends RecyclerView.Adapter<QueryViewHolder> implements IQueriesAdapter {

    private Context context;
    private ArrayList<WorkerData> queryModel = new ArrayList<>();
    AllCrewDataIn allCrewDataIn;

    public QueriesAdapter(Context context, ArrayList<WorkerData> queryModel){
        this.context = context;
        this.queryModel = queryModel;
    }


    @NonNull
    @Override
    public QueryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.query_item_cell, parent, false);
        return new QueryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QueryViewHolder holder, @SuppressLint("RecyclerView") int position) {
        /*

        QueryModel query = queryModel.get(position);

        holder.txtLatitude.setText(query.getLatitude());
        holder.txtLongitude.setText(query.getLongitude());
        holder.txtAvgTemp.setText(query.getAvg_temp());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                allCrewDataIn = new GpsCoordinatesIn(
                        BuildConfig.WEATHER_API_KEY,
                        query.getLatitude(),
                        query.getLongitude(),
                        new SimpleDateFormat("yyyy-MM-dd").format(new Date()),
                        new SimpleDateFormat("yyyy-MM-dd").format(new Date())
                );

                navigateToWorkerDetail(allCrewDataIn);
            }
        });

         */

    }



    @Override
    public int getItemCount() {
        return queryModel.size();
    }

    @Override
    public void navigateToWorkerDetail(WorkerCallDataOut workerDataOut){
        /*
        Intent navigateToWorkerDetail = new Intent(context, WeatherDetailActivity.class);
        navigateToWorkerDetail.putExtra("workerData",workerDataOut);
        navigateToWorkerDetail.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        this.context.startActivity(navigateToWorkerDetail);

         */
    }

}

