package com.example.chocolatefactorycrew.feature.workerlist.workerlistviewmodel;

import android.util.Log;

import com.example.chocolatefactorycrew.apicalls.allcrewcall.AllCrewCall;
import com.example.chocolatefactorycrew.apicalls.apiservices.IAllCrewService;
import com.example.chocolatefactorycrew.data.allcrew.AllCrewData;
import com.example.chocolatefactorycrew.data.workerdata.WorkerData;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WorkerListViewModel implements IWorkerListViewModel {

    public ArrayList allCrewList = new ArrayList<>();

    @Override
    public void getAllCrew() {

        IAllCrewService crewService = AllCrewCall.getRetrofitInstance().create(IAllCrewService.class);

        Call<AllCrewData> allCrewDataCall = crewService.getAllCrew();

        allCrewDataCall.enqueue(new Callback<AllCrewData>() {
            @Override
            public void onResponse(Call<AllCrewData> call, Response<AllCrewData> response) {


                ArrayList<WorkerData> workerDataArrayList = response.body().getResults();

                allCrewList.addAll(workerDataArrayList);

            }

            @Override
            public void onFailure(Call<AllCrewData> call, Throwable t) {

                Log.e("Error", "Error");

            }
        });
    }

    @Override
    public ArrayList getAllCrewList() {
        return allCrewList;
    }


}
