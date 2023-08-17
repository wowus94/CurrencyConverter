package com.vlyashuk.currencyconverter.screens.start

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vlyashuk.currencyconverter.R
import com.vlyashuk.currencyconverter.model.Valute

class StartAdapter : RecyclerView.Adapter<StartAdapter.StartViewHolder>() {

    var listStart = emptyList<Valute>()

    class StartViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_money_layout, parent, false)
        return StartViewHolder(view)
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        val item = listStart[position]
        with(holder.itemView) {
            findViewById<TextView>(R.id.item_name).text = item.USD.Name
        }
    }

    override fun getItemCount(): Int {
        return listStart.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<Valute>) {
        listStart = list
        notifyDataSetChanged()
    }

}

