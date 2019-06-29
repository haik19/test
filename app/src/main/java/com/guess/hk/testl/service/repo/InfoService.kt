package com.guess.hk.testl.service.repo

import com.guess.hk.testl.service.model.Info
import retrofit2.Call
import retrofit2.http.GET

interface InfoService {

    @GET("/api/get")
    fun loadData():Call<List<Info>>
}