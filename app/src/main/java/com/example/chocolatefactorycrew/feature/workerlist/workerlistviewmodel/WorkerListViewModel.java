package com.example.chocolatefactorycrew.feature.workerlist.workerlistviewmodel;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;

import com.example.chocolatefactorycrew.apicalls.allcrewcall.AllCrewCall;
import com.example.chocolatefactorycrew.apicalls.apiservices.IAllCrewService;
import com.example.chocolatefactorycrew.components.recyclerview.QueriesAdapter;
import com.example.chocolatefactorycrew.data.allcrew.AllCrewData;
import com.example.chocolatefactorycrew.data.workerdata.WorkerData;
import com.example.chocolatefactorycrew.feature.workerlist.WorkerListActivity;
import com.example.chocolatefactorycrew.utils.errorutils.ErrorUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WorkerListViewModel implements IWorkerListViewModel {

}
