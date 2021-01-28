package com.search.seatchbooks.network

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiRetroBooksService {

    @GET("search.json")
    fun getBookListFromApi(@Query("q") query: String): Observable<Books>
}