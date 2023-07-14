package com.example.productsdisplay

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.productsdisplay.network.ProductResponse
import com.example.productsdisplay.network.ProductsApi
import kotlinx.coroutines.launch
private const val TAG = "ProductViewModel"

class ProductViewModel : ViewModel(){

    private val _products = MutableLiveData<ProductResponse>()
    val products : LiveData<ProductResponse> = _products

    init {
        getProducts()
    }
    private fun getProducts(){
        viewModelScope.launch {
            try{
               _products.value = ProductsApi.retrofitService.getProductsList()
                Log.d(TAG,"getProductsList() - "+products.value)
            }catch (e : Exception){
                _products.value = null
                Log.d(TAG,"exception : "+e.message)
            }
        }
    }
}