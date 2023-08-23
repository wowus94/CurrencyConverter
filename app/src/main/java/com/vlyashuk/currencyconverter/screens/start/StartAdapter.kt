package com.vlyashuk.currencyconverter.screens.start

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vlyashuk.currencyconverter.databinding.ItemMoneyLayoutBinding
import com.vlyashuk.currencyconverter.model.Data
import com.vlyashuk.currencyconverter.model.Valute

class StartAdapter : RecyclerView.Adapter<StartAdapter.StartViewHolder>() {

    var listStart = listOf<Data>()

    class StartViewHolder(val binding: ItemMoneyLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemMoneyLayoutBinding.inflate(inflater, parent, false)
        return StartViewHolder(binding)
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        val money = listStart[position]
        with(holder.binding) {
            holder.itemView.tag = money
            itemNameValue.text = money.Valute.USD.Name
            itemSaleValue.text = money.Valute.USD.Value.toString()
        }
    }

    override fun getItemCount(): Int {
        return listStart.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<Data>) {
        listStart = list
        notifyDataSetChanged()
    }

}

