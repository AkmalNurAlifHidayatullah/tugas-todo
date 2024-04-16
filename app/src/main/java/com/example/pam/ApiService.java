package com.example.pam;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("https://mgm.ub.ac.id/todo.php/")
    Call<List<Task>> getTasks();
}
