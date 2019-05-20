package com.example.user.testcamera;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIService {
    @POST("/image_processing")
    //@FormUrlEncoded
    Call<Post> sendPost(@Body Post body);
}
