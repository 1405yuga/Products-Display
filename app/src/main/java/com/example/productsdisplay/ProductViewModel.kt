package com.example.productsdisplay

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.productsdisplay.network.Product
import com.example.productsdisplay.network.ProductsApi
import kotlinx.coroutines.launch
const val TAG = "ProductViewModel"

class ProductViewModel : ViewModel(){

    private val _products = MutableLiveData<List<Product>>()
    val products : LiveData<List<Product>> = _products

    fun getProducts(){
        viewModelScope.launch {
            try{
               _products.value = ProductsApi.retrofitService.getProductsList()
                Log.d(TAG,"getProductsList() ")
            }catch (e : Exception){
                _products.value = listOf()
                Log.d(TAG,"exception : "+e.message)
            }
        }
    }
}