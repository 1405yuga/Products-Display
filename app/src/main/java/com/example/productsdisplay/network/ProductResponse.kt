package com.example.productsdisplay.network

data class ProductResponse(
    val responseCode : String,
    val products : List<Product>
) {
}