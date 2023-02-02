package com.example.chocolatefactorycrew.data.allcrew;

import com.example.chocolatefactorycrew.data.workerdata.WorkerData;

import java.util.ArrayList;

public class AllCrewData {

    private int current;
    private int total;
    public ArrayList<WorkerData> results;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public ArrayList<WorkerData> getResults() {
        return results;
    }

    public void setResults(ArrayList<WorkerData> results) {
        this.results = results;
    }
}
