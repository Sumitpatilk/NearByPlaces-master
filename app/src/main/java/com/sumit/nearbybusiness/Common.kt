package com.sumit.nearbybusiness

import com.sumit.nearbybusiness.Model.Results
import com.sumit.nearbybusiness.Remote.IGoogleAPIService
import com.sumit.nearbybusiness.Remote.RetrofitClient


object Common {
    var currentResult: Results? = null

    private val GOOGLE_API_URL="https://maps.googleapis.com/"
    val googleApiService:IGoogleAPIService
    get()=RetrofitClient.getClient(GOOGLE_API_URL).create(IGoogleAPIService::class.java)
}