package ru.dubinin.application.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

interface CatService  {
    @GET("v1/images/search")
    @Headers("x-api-key: live_zW70K1JoPEWpEwJCArXVT52D1watm41FQrnXE0yyFPS1nvPVKLnnbmo97S5AAPoa")
    suspend fun getCatsImages(): Response<List<CatImageUrl>>
}

data class CatImageUrl(val url: String)