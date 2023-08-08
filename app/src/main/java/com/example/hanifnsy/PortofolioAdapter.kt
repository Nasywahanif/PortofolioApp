package com.example.hanifnsy

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

class PortofolioAdapter(private val list: ArrayList<PortofolioData>):
    RecyclerView.Adapter<PortofolioAdapter.portofolioViewHolder>() {

        class portofolioViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
            private val logo = itemView.findViewById<ImageView>(R.id.logoportofolio)
            private val judul = itemView.findViewById<TextView>(R.id.judulportofolio)
            private val desc = itemView.findViewById<TextView>(R.id.deskripsiportofolio)

            fun bind(get: PortofolioData){
                logo.setImageResource(get.logo)
                judul.text = get.judul
                desc.text = get.desc

                judul.setOnClickListener {
                    val open = Intent(Intent.ACTION_VIEW, Uri.parse(get.url))
                    itemView.context.startActivity(open)
                }
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): portofolioViewHolder {
        return  portofolioViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_portofolio_list, parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: portofolioViewHolder, position: Int) {
        holder.bind(list[position])
    }



}