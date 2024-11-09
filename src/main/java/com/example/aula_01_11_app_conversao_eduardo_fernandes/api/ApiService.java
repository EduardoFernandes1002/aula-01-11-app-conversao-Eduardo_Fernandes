package com.example.aula_01_11_app_conversao_eduardo_fernandes.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {

    @GET("last/{currency}")
    Call<String> getDados(@Path("currency")String currency);


}
