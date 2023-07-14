package com.example.productsdisplay.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET


//base url
private const val BASE_URL ="https://automationexercise.com/api/"

//moshi builder - to parse json
private val moshiBuilder = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

//retrofit builder - to connect api
private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshiBuilder))
    .baseUrl(BASE_URL)
    .build()

interface ProductsApiService {

    //suspend function to get data
    @GET("productsList")
    suspend fun getProductsList() : List<Product>
}