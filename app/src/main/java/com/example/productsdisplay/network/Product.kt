package com.example.productsdisplay.network

data class Product(
    val id : Int,
    val name : String,
    val price : String,
    val brand : String,
    val category : Category
) {
}

data class Category (
    val usertype: UserType,
    val category: String
){
}

data class UserType(val usertype:String) {
}