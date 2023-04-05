package com.example.uklrecycle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class GridStoreAdapter(val listHeroes: ArrayList<Store>) : RecyclerView.Adapter<GridStoreAdapter.GridViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }


    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): GridViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_grid_deutsch, viewGroup, false)
        return GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listHeroes[holder.adapterPosition]) }
        Glide.with(holder.itemView.context)
            .load(listHeroes[position].photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
    }

    override fun getItemCount(): Int {
        return listHeroes.size
    }

    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
    interface OnItemClickCallback {
        fun onItemClicked(data: Store)
    }

}