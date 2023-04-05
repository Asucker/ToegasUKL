package com.example.uklrecycle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewSlaveAdapter (private val listSlave: ArrayList<Slave>) : RecyclerView.Adapter<CardViewSlaveAdapter.CardViewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.slave_card_duits, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val (name, from, photo) = listSlave[position]


        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)


        holder.tvName.text = name
        holder.tvFrom.text = from


        holder.btnFavorite.setOnClickListener { Toast.makeText(holder.itemView.context, "Favorite " + listSlave[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }


        holder.btnShare.setOnClickListener { Toast.makeText(holder.itemView.context, "Share " + listSlave[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }


        holder.itemView.setOnClickListener { Toast.makeText(holder.itemView.context, "Sie wählen aus " + listSlave[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }

        holder.itemView.setOnClickListener { Toast.makeText(holder.itemView.context, "Sie wählen aus " + listSlave[position].name, Toast.LENGTH_SHORT).show() }

    }

    override fun getItemCount(): Int {
        return listSlave.size
    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_slave_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_slave_name)
        var tvFrom: TextView = itemView.findViewById(R.id.tv_slave_from)
        var btnFavorite: Button = itemView.findViewById(R.id.btnfavorite)
        var btnShare: Button = itemView.findViewById(R.id.btnshare)



    }
}