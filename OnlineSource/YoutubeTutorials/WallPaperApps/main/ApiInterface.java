package com.example.wallpaperapp;

import static com.example.wallpaperapp.ApiUtilities.API;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface ApiInterface {

    String BASE_URL = "https://api.pexels.com/v1/";

    @Headers("Authorization: " + API )
    @GET("curated")
    Call<SearchModel> getImage(
            @Query("page") int page,            // page is int
            @Query("per_page") int per_page     // per_page is int
    );


    @Headers("Authorization: " + API )
    @GET("search")
    Call<SearchModel> getSearchImage(
            @Query("query") String query,       // query is String
            @Query("page") int page,
            @Query("per_page") int per_page
    );


}
