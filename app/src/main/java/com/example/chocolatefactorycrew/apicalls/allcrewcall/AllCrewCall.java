package com.example.chocolatefactorycrew.apicalls.allcrewcall;

import android.content.Context;

import com.example.chocolatefactorycrew.data.workerdata.WorkerData;
import com.example.chocolatefactorycrew.utils.endpointsutils.EndpointsUtils;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AllCrewCall implements IAllCrewCall{

    private static Retrofit retrofit;

    public static Retrofit getRetrofitInstance(){

        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(EndpointsUtils.allCrewUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;

    }

}
