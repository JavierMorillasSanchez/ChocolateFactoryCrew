package com.example.chocolatefactorycrew.utils.endpointsutils;

public class EndpointsUtils {

    public static final String baseUrl = "https://2q2woep105.execute-api.eu-west-1.amazonaws.com/napptilus/";
    public int workerDataId;
    public static final String allCrewUrl = baseUrl+"oompa-loompas/";
    public final String workerDataUrl = baseUrl+allCrewUrl+workerDataId+"/";


    public String getAllCrewUrl() {
        return allCrewUrl;
    }

    public String getWorkerDataUrl(int workerDataId) {
        this.setWorkerDataId(workerDataId);
        return workerDataUrl;
    }

    public int getWorkerDataId() {
        return workerDataId;
    }

    public void setWorkerDataId(int workerDataId) {
        this.workerDataId = workerDataId;
    }
}
