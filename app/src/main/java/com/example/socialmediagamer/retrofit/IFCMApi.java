package com.example.socialmediagamer.retrofit;

import com.example.socialmediagamer.models.FCMBody;
import com.example.socialmediagamer.models.FCMResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMApi {

    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAK3CHDSk:APA91bEcUPGVkm42Xn4L6_MN3gb8A6sAfKv5lVgDyO0cb3kpcnu-JqyNcs5JAKp4BzBKXbiLyyptBFNErBGb0X0aSqNr7AtQgytCYX7TXwLgDV8GPHNatl6xvdDGTla93iZA1MpS7S39"
    })
    @POST("fcm/send")
    Call<FCMResponse> send(@Body FCMBody body);
}
