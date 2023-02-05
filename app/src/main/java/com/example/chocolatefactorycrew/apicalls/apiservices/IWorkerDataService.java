package com.example.chocolatefactorycrew.apicalls.apiservices;

import com.example.chocolatefactorycrew.data.allcrew.AllCrewData;
import com.example.chocolatefactorycrew.data.workerdata.WorkerData;
import com.example.chocolatefactorycrew.utils.endpointsutils.EndpointsUtils;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IWorkerDataService {

    @GET(EndpointsUtils.allCrewUrl)
    Call<WorkerData> getWorkerData();

}
