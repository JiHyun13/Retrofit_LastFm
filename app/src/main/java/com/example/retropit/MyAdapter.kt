package com.example.retropit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.retropit.Data.Track

class MyAdapter(private val items:List<Track>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        companion object{
            fun from(parent: ViewGroup) : MyViewHolder{
                return MyViewHolder(LayoutInflater.from(parent.context).inflate
                    (R.layout.item, parent, false))
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.view.findViewById<TextView>(R.id.tv_num).text = position.plus(1).toString()
        holder.view.findViewById<TextView>(R.id.tv_song).text = items[position].name
        holder.view.findViewById<TextView>(R.id.tv_singer).text = items[position].artist.name
    }

    override fun getItemCount(): Int = items.size


}