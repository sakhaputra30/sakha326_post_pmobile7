package com.sakha.sakha326_post_pmobile7;



import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("en/books")
    Call<List<Book>> getBooks(); // Java method syntax
}
