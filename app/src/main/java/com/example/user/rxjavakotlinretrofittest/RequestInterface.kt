package com.example.user.rxjavakotlinretrofittest

import com.example.user.rxjavakotlinretrofittest.Model.Android
import io.reactivex.Observable
import retrofit2.http.GET


interface RequestInterface {

    @GET("api/android")
    fun getData() : Observable<List<Android>>
}
