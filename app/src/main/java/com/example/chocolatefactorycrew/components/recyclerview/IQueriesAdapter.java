package com.example.chocolatefactorycrew.components.recyclerview;

import com.example.chocolatefactorycrew.components.listitemcell.QueryViewHolder;
import com.example.chocolatefactorycrew.data.workerdata.WorkerData;
import com.example.chocolatefactorycrew.data.workerdata.workercalldata.WorkerCallDataOut;

import java.util.ArrayList;

public interface IQueriesAdapter {
    void loadImages(String url, QueryViewHolder imgHolder);
    void navigateToWorkerDetail(WorkerData workerData);
}
