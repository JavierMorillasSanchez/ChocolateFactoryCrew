package com.example.chocolatefactorycrew.feature.workerdetail;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.chocolatefactorycrew.R;
import com.example.chocolatefactorycrew.apicalls.allcrewcall.AllCrewCall;
import com.example.chocolatefactorycrew.apicalls.apiservices.IAllCrewService;
import com.example.chocolatefactorycrew.apicalls.apiservices.IWorkerDataService;
import com.example.chocolatefactorycrew.apicalls.workercall.WorkerCall;
import com.example.chocolatefactorycrew.data.allcrew.AllCrewData;
import com.example.chocolatefactorycrew.data.workerdata.WorkerData;
import com.example.chocolatefactorycrew.utils.errorutils.ErrorUtils;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WorkerDetailActivity extends AppCompatActivity implements IWorkerDetailActivity {

    private WorkerData workerData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worker_detail);

        callWorkerData();
        setUIRef();

    }

    @Override
    public void callWorkerData() {

        IWorkerDataService crewService = WorkerCall.getRetrofitInstance(2).create(IWorkerDataService.class);

        Call<WorkerData> workerDataCall = crewService.getWorkerData();

        workerDataCall.enqueue(new Callback<WorkerData>() {
            @Override
            public void onResponse(Call<WorkerData> call, Response<WorkerData> response) {
                workerData = response.body();
                setWorkerData(workerData);
            }

            @Override
            public void onFailure(Call<WorkerData> call, Throwable t) {
                ErrorUtils.genericErrorToast(getApplicationContext());
            }
        });
    }

    @Override
    public void setWorkerData(WorkerData workerData) {

    }

    @Override
    public void setUIRef() {

    }

}