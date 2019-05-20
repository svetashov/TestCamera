package com.example.user.testcamera;

public class ApiUtils {

    private ApiUtils() {}

    public static final String BASE_URL = "http://192.168.43.246:3000/";

    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}
