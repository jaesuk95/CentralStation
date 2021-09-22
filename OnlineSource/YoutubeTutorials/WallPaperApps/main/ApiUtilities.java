package com.example.wallpaperapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtilities {
    // ApiUtilities = creating a java class for API utilities which will return the object

    private static Retrofit retrofit=null;
    public static final String API = "563492ad6f917000010000012d38c49a1f6c47eb9c6cf21d54981165";

    public static ApiInterface getApiInterface() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder().baseUrl(ApiInterface.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit.create(ApiInterface.class);
    }
}
