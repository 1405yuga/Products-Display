package com.example.productsdisplay.adapter

import android.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.productsdisplay.databinding.ListViewProductBinding
import com.example.productsdisplay.network.Product

class ProductsAdpater : ListAdapter<Product,ProductsAdpater.ProductsViewHolder>() {
    class ProductsViewHolder (private var binding:ListViewProductBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(product : Product){
            binding.name.text = product.name
            binding.price.text = product.price
            binding.brand.text = product.brand
            binding.category.text = product.category.category
            binding.userType.text = product.category.usertype.usertype
        }
    }

}