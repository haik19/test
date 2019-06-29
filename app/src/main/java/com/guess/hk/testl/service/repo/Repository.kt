package com.guess.hk.testl.service.repo

import android.arch.lifecycle.LiveData
import com.guess.hk.testl.service.model.Info

interface Repository {
     fun loadData(): LiveData<Resource<List<Info>>>
}