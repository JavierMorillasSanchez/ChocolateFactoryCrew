package com.example.chocolatefactorycrew.apicalls.workercall;

import android.os.AsyncTask;
import android.util.Log;

import com.example.chocolatefactorycrew.apicalls.allcrewcall.IAllCrewCall;
import com.example.chocolatefactorycrew.utils.endpointsutils.EndpointsUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WorkerCall implements IWorkerCall {

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

