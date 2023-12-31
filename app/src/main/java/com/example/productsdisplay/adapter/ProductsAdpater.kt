package com.example.productsdisplay.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.productsdisplay.databinding.ListViewProductBinding
import com.example.productsdisplay.network.Product


class ProductsAdpater(var products : List<Product>) : RecyclerView.Adapter<ProductsAdpater.ProductsViewHolder>() {

    class ProductsViewHolder(private var binding: ListViewProductBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(product: Product) {
            binding.name.text = product.name
            binding.price.text = product.price
            binding.brand.text = product.brand
            binding.category.text = product.category.category
            binding.userType.text = product.category.usertype.usertype
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductsViewHolder {
        return ProductsViewHolder(ListViewProductBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun onBindViewHolder(holder: ProductsViewHolder, position: Int) {
        holder.bind(products.get(position))
    }


}