package ru.dubinin.application.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object CatServiceDelegate {
    val URL = "https://api.thecatapi.com/"

    private val retrofit = Retrofit.Builder()
        .baseUrl(URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val api: CatService by lazy {
        retrofit.create(CatService::class.java)
    }

    suspend fun getCatImageUrl(): String? {
        return CatServiceDelegate.api.getCatsImages().body()?.get(0)?.url
    }
}