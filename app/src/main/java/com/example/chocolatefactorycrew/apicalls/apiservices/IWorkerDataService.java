package com.example.chocolatefactorycrew.apicalls.apiservices;

import com.example.chocolatefactorycrew.data.allcrew.AllCrewData;
import com.example.chocolatefactorycrew.data.workerdata.WorkerData;
import com.example.chocolatefactorycrew.utils.endpointsutils.EndpointsUtils;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface IWorkerDataService {

    @GET
    Call<WorkerData> getWorkerData(@Url String workerId);

}
