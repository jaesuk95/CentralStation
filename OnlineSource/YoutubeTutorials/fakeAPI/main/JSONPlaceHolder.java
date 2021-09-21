package com.example.retrofittutorial;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JSONPlaceHolder {


    // Interface which defines the HTTP operations (Functions or methods)
    // Every method inside an interface represents one possible API call. It must have a HTTP annotation (GET,POST,etc)
    // to specify the request type and the relative URL. The return value wraps the response in a Call object with the
    // type of the expected result.

    @GET("posts")               // https://jsonplaceholder.typicode.com/posts 여기 사이트 끝자리 posts 를 가지고 온다
    Call<List<Post>> getPost(); // for specific category or api key, must insert inside getPost()
}
