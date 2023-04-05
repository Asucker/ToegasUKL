package com.example.uklrecycle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListStoreAdapter(private val listStore: ArrayList<Store>) : RecyclerView.Adapter<ListStoreAdapter.ListViewHolder>(){
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvFrom: TextView = itemView.findViewById(R.id.tv_item_from)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): ListStoreAdapter.ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_deustch, viewGroup, false)
        return ListViewHolder(view)

    }

    override fun onBindViewHolder(holder: ListStoreAdapter.ListViewHolder, position: Int) {
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listStore[holder.adapterPosition]) }
        val (name, from, photo) = listStore[position]


        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)


        holder.tvName.text = name
        holder.tvFrom.text = from

    }

    override fun getItemCount(): Int {
        return listStore.size
    }
    interface OnItemClickCallback {
        fun onItemClicked(data: Store)
    }


}
