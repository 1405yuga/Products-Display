package com.example.productsdisplay

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.productsdisplay.network.Product


class ProductViewModel : ViewModel(){

    private val _products = MutableLiveData<List<Product>>()
    val products : LiveData<List<Product>> = _products

    fun getProducts(){
    }
}