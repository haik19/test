package com.guess.hk.testl.viewmodel

import android.arch.lifecycle.ViewModel
import com.guess.hk.testl.service.repo.RepoImp
import com.guess.hk.testl.service.repo.Repository

class InfoViewModel : ViewModel(){

    private var repo : Repository = RepoImp()

    fun loadData() {
        repo.loadData()

    }



}