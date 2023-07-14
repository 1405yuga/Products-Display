package com.example.productsdisplay.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory


//base url
private const val BASE_URL ="https://automationexercise.com/api/"

//moshi builder - to parse json
private val moshiBuilder = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

interface ProductsApiService {
}