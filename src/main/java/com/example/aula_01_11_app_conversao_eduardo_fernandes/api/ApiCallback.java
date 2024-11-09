package com.example.aula_01_11_app_conversao_eduardo_fernandes.api;

public interface ApiCallback<T> {
    void onSucess(T result);
    void onError(String error);


}
