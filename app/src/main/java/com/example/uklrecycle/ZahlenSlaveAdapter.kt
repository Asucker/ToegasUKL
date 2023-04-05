package com.example.uklrecycle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ZahlenSlaveAdapter (private val listSlave: ArrayList<Slave>) : RecyclerView.Adapter<ZahlenSlaveAdapter.ListViewHolder>(){
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var tvName: TextView = itemView.findViewById(R.id.tv_slave_name)
        var tvFrom: TextView = itemView.findViewById(R.id.tv_slave_from)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_slave_photo)

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): ZahlenSlaveAdapter.ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.activity_ja_ik_ben_een_nederlander, viewGroup, false)
        return ListViewHolder(view)

    }

    override fun onBindViewHolder(holder: ZahlenSlaveAdapter.ListViewHolder, position: Int) {
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listSlave[holder.adapterPosition]) }
        val (name, from, photo) = listSlave[position]


        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)


        holder.tvName.text = name
        holder.tvFrom.text = from

    }

    override fun getItemCount(): Int {
        return listSlave.size
    }
    interface OnItemClickCallback {
        fun onItemClicked(data: Slave)
    }


}