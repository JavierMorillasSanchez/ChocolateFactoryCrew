package com.example.chocolatefactorycrew.utils.endpointsutils;

public class EndpointsUtils {

    public static final String baseUrl = "https://2q2woep105.execute-api.eu-west-1.amazonaws.com/napptilus/";
    public static final String allCrewUrl = baseUrl+"oompa-loompas/";
    public final int workerId = 1;
    
    public final String workerDataUrl = allCrewUrl+workerId+"/";

}
