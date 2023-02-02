package com.example.chocolatefactorycrew.feature.workerlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.chocolatefactorycrew.R;
import com.example.chocolatefactorycrew.apicalls.allcrewcall.AllCrewCall;
import com.example.chocolatefactorycrew.apicalls.allcrewcall.IAllCrewCall;
import com.example.chocolatefactorycrew.apicalls.apiservices.IAllCrewService;
import com.example.chocolatefactorycrew.data.allcrew.AllCrewData;
import com.example.chocolatefactorycrew.data.workerdata.WorkerData;
import com.example.chocolatefactorycrew.feature.workerlist.workerlistviewmodel.WorkerListViewModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WorkerListActivity extends AppCompatActivity implements IWorkerListActivity{

    WorkerListViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worker_list);

        setUIRef();


    }
    @Override
    public void setUIRef(){

        this.viewModel = new WorkerListViewModel();
        this.viewModel.getAllCrew();


    }


}