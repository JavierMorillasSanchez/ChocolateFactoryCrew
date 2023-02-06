package com.example.chocolatefactorycrew.feature.workerdetail;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.chocolatefactorycrew.R;
import com.example.chocolatefactorycrew.apicalls.allcrewcall.AllCrewCall;
import com.example.chocolatefactorycrew.apicalls.apiservices.IAllCrewService;
import com.example.chocolatefactorycrew.apicalls.apiservices.IWorkerDataService;
import com.example.chocolatefactorycrew.apicalls.workercall.WorkerCall;
import com.example.chocolatefactorycrew.components.listitemcell.QueryViewHolder;
import com.example.chocolatefactorycrew.data.allcrew.AllCrewData;
import com.example.chocolatefactorycrew.data.workerdata.WorkerData;
import com.example.chocolatefactorycrew.utils.errorutils.ErrorUtils;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WorkerDetailActivity extends AppCompatActivity implements IWorkerDetailActivity {

    private TextView firstName, lastName, profession, mail, gender, description, country,
            height, food, color, quota, song, randomString;

    private ImageView imgDetail;
    private WorkerData workerData;
    private String workerId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worker_detail);

        setUIRef();
        callWorkerData();

    }

    @Override
    public void setUIRef() {

        firstName = findViewById(R.id.txt_first_name_detail);
        lastName = findViewById(R.id.txt_last_name_detail);
        imgDetail = findViewById(R.id.img_worker_image_detail);
        profession = findViewById(R.id.txt_profession_detail);
        mail = findViewById(R.id.txt_mail_detail);
        gender = findViewById(R.id.txt_gender_detail);
        description = findViewById(R.id.txt_description_detail);
        country = findViewById(R.id.txt_country_detail);
        height = findViewById(R.id.txt_height_detail);
        food = findViewById(R.id.txt_food_detail);
        color = findViewById(R.id.txt_color_detail);
        quota = findViewById(R.id.txt_quota_detail);
        song = findViewById(R.id.txt_song_detail);
        randomString = findViewById(R.id.txt_random_string_detail);

    }

    @Override
    public void callWorkerData() {

        this.workerId = (String) getIntent().getExtras().get("workerId");

        IWorkerDataService crewService = WorkerCall.getRetrofitInstance().create(IWorkerDataService.class);

        Call<WorkerData> workerDataCall = crewService.getWorkerData(workerId);

        workerDataCall.enqueue(new Callback<WorkerData>() {
            @Override
            public void onResponse(Call<WorkerData> call, Response<WorkerData> response) {
                workerData = response.body();
                setWorkerData(workerData);
            }

            @Override
            public void onFailure(Call<WorkerData> call, Throwable t) {
                ErrorUtils.genericErrorToast(getApplicationContext());
            }
        });
    }

    @Override
    public void setWorkerData(WorkerData workerData) {
        if(workerData != null){

            firstName.setText(String.valueOf(workerData.getFirst_name()));
            lastName.setText(String.valueOf(workerData.getLast_name()));
            profession.setText(String.valueOf(workerData.getProfession()));
            mail.setText(String.valueOf(workerData.getEmail()));
            gender.setText(String.valueOf(workerData.getGender()));
            description.setText(String.valueOf(workerData.getDescription()));
            country.setText(String.valueOf(workerData.getCountry()));
            height.setText(String.valueOf(workerData.getHeight()));
            quota.setText(String.valueOf(workerData.getQuota()));

            color.setText(String.valueOf(workerData.getWorkerFavoriteData().getColor()));
            song.setText(String.valueOf(workerData.getWorkerFavoriteData().getSong()));
            randomString.setText(String.valueOf(workerData.getWorkerFavoriteData().getRandom_string()));
            food.setText(String.valueOf(workerData.getWorkerFavoriteData().getFood()));

            setImageDetail(String.valueOf(workerData.getImage()),imgDetail);

        }

    }

    @Override
    public void setImageDetail(String url, ImageView imgWorker) {
        Glide.with(this)
                .load(url)
                .error(R.drawable.oompa_loompa_logo)
                .into(imgWorker);
    }

}