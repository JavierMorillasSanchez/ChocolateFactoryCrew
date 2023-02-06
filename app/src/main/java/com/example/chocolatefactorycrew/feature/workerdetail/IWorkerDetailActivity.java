package com.example.chocolatefactorycrew.feature.workerdetail;

import android.widget.ImageView;

import com.example.chocolatefactorycrew.data.workerdata.WorkerData;

public interface IWorkerDetailActivity {
    void callWorkerData();
    void setWorkerData(WorkerData workerData);
    void setUIRef();
    void setImageDetail(String url, ImageView imgWorker);
}
