package com.example.socialmediagamer.providers;

import com.example.socialmediagamer.models.FCMBody;
import com.example.socialmediagamer.models.FCMResponse;
import com.example.socialmediagamer.retrofit.IFCMApi;
import com.example.socialmediagamer.retrofit.RetrofitClient;

import retrofit2.Call;

public class NotificationProvider {

    private String url = "https://fcm.googleapis.com";

    public NotificationProvider(){

    }

    public Call<FCMResponse> sendNotification(FCMBody body){
        return RetrofitClient.getClient(url).create(IFCMApi.class).send(body);
    }
}
