package com.example.chocolatefactorycrew.feature.workerlist;

import java.util.ArrayList;

public interface IWorkerListActivity {
    void setUIRef();
    void setCrewInfoList(ArrayList crewList);
    void callAllCrew();
    void showCrewList();

}
