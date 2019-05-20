package com.example.user.testcamera;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIService {
    @POST("/http_test")
    //@FormUrlEncoded
    Call<Post> savePost(@Body Post post);
}
