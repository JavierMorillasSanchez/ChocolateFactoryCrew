package com.example.chocolatefactorycrew.feature.workerlist;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chocolatefactorycrew.R;
import com.example.chocolatefactorycrew.apicalls.allcrewcall.AllCrewCall;
import com.example.chocolatefactorycrew.apicalls.apiservices.IAllCrewService;
import com.example.chocolatefactorycrew.components.recyclerview.QueriesAdapter;
import com.example.chocolatefactorycrew.data.allcrew.AllCrewData;
import com.example.chocolatefactorycrew.data.workerdata.WorkerData;
import com.example.chocolatefactorycrew.utils.errorutils.ErrorUtils;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WorkerListActivity extends AppCompatActivity implements IWorkerListActivity{

    RecyclerView rvWorkerList;
    ProgressBar progressBar;
    LinearLayout loading_layout;

    public ArrayList workerDataList = new ArrayList();
    public QueriesAdapter workerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worker_list);

        setUIRef();
        this.callAllCrew();
    }

    @Override
    public void setUIRef(){

        this.rvWorkerList = findViewById(R.id.rv_worker_list);
        this.progressBar = findViewById(R.id.progress_bar);
        this.loading_layout = findViewById(R.id.loading_layout);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rvWorkerList.setLayoutManager(linearLayoutManager);

    }

    @Override
    public void callAllCrew() {

        IAllCrewService crewService = AllCrewCall.getRetrofitInstance().create(IAllCrewService.class);

        Call<AllCrewData> allCrewDataCall = crewService.getAllCrew();

        allCrewDataCall.enqueue(new Callback<AllCrewData>() {
            @Override
            public void onResponse(@NonNull Call<AllCrewData> call, @NonNull Response<AllCrewData> response) {
                assert response.body() != null;
                ArrayList<WorkerData> workerDataArrayList = response.body().getResults();
                workerDataList.addAll(workerDataArrayList);
                setCrewInfoList(workerDataList);
                showCrewList();
            }

            @Override
            public void onFailure(Call<AllCrewData> call, Throwable t) {
                ErrorUtils.genericErrorToast(getApplicationContext());
            }
        });
    }

    @Override
    public void showCrewList() {
        if(this.workerDataList.size()>0){
            this.loading_layout.setVisibility(View.GONE);
            this.rvWorkerList.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void setCrewInfoList(ArrayList crewList){
        this.workerAdapter = new QueriesAdapter(getApplicationContext(), crewList);
        this.rvWorkerList.setAdapter(this.workerAdapter);
    }



}