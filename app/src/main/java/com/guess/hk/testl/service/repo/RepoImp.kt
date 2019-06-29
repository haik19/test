package com.guess.hk.testl.service.repo

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import com.guess.hk.testl.service.model.Info
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RepoImp : Repository {

    private val retrofit =
        Retrofit.Builder().apply {
            baseUrl("https://umorili.herokuapp.com/")
            addConverterFactory(GsonConverterFactory.create())
        }.build()

    private val infoService: InfoService = retrofit.create(InfoService::class.java)

    override fun loadData(): LiveData<Resource<List<Info>>> {
        val responceLiveData = MutableLiveData<Resource<List<Info>>>()

        infoService.loadData().enqueue(object : Callback<List<Info>> {
            override fun onFailure(call: Call<List<Info>>, t: Throwable) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onResponse(call: Call<List<Info>>, response: Response<List<Info>>) {
                print("test exam ${response.body()}")
            }
        })
        return responceLiveData
    }


}