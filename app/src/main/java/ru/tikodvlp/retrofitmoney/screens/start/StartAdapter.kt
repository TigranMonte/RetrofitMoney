package ru.tikodvlp.retrofitmoney.screens.start

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_money.view.*
import ru.tikodvlp.retrofitmoney.R
import ru.tikodvlp.retrofitmoney.model.cash.CashItem

class StartAdapter : RecyclerView.Adapter<StartAdapter.StartViewHolder>() {

    var listStart = emptyList<CashItem>()

    class StartViewHolder(view: View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money, parent, false)
        return StartViewHolder(view)
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        holder.itemView.item_name.text = listStart[position].ccy
        holder.itemView.item_buy.text = listStart[position].buy
        holder.itemView.item_sale.text = listStart[position].sale
    }

    override fun getItemCount(): Int {
        return listStart.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<CashItem>) {
        listStart = list
        notifyDataSetChanged()
    }
}