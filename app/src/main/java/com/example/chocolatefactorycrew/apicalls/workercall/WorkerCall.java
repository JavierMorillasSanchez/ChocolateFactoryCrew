package com.example.chocolatefactorycrew.apicalls.workercall;

import android.os.AsyncTask;
import android.util.Log;

import com.example.chocolatefactorycrew.apicalls.allcrewcall.IAllCrewCall;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WorkerCall extends AsyncTask<Void,Void,String> implements IWorkerCall {

    private String workerCallUrl = "https://2q2woep105.execute-api.eu-west-1.amazonaws.com/napptilus/oompa-loompas/";
    /*

    @SuppressLint("StaticFieldLeak")
    private final Context context;
    @SuppressLint("StaticFieldLeak")
    private final LinearLayout messaggeLayout;
    @SuppressLint("StaticFieldLeak")
    private final RecyclerView rvUserList;
    @SuppressLint("StaticFieldLeak")
    private final TextView loadmessage;

    private final ArrayList<UserDataCell> userArray;
    private final UserAdapter userAdapter;
    private final int generateNumberOfUsers;

     */

/*
    public AllCrewCall(LinearLayout messaggeLayout,
                          RecyclerView rvUserList,
                          ArrayList<UserDataCell> userArray,
                          UserAdapter userAdapter,
                          int generateNumberOfUsers,
                          TextView loadmessage,
                          Context context) {

        this.messaggeLayout = messaggeLayout;
        this.rvUserList = rvUserList;
        this.userArray = userArray;
        this.userAdapter = userAdapter;
        this.generateNumberOfUsers = generateNumberOfUsers;
        this.loadmessage = loadmessage;
        this.context = context;
    }

 */

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected String doInBackground(Void... Voids) {

        HttpURLConnection urlConnection = null;
        BufferedReader bufferedReader = null;

        try {
            URL url = new URL(workerCallUrl);
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.connect();

            InputStream inputStream = urlConnection.getInputStream();

            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            StringBuffer stringBuffer = new StringBuffer();

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line).append("\n");
            }

            if (stringBuffer.length() == 0) {
                return null;
            } else {
                return stringBuffer.toString();
            }

        } catch (IOException e) {

            return null;

        } finally {
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    protected void onPostExecute(String jsonStr) {
        super.onPostExecute(jsonStr);

        if (jsonStr != null) {

            try {

                JSONObject rootJsonObject = new JSONObject(jsonStr);
                JSONArray userJsonArray = rootJsonObject.getJSONArray("results");

                for (int x = 0; x < userJsonArray.length(); x++) {

                    JSONObject jsonObject = userJsonArray.getJSONObject(x);
                    Log.d("prueba", String.valueOf(jsonObject));

                }



            } catch (JSONException e) {
                e.printStackTrace();
            }
        }


    }

    @Override
    public String setUrl(String id) {
        return workerCallUrl + "1";
    }
}

