package ru.tikodvlp.retrofitmoney.screens.second

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_money.view.*
import ru.tikodvlp.retrofitmoney.R
import ru.tikodvlp.retrofitmoney.model.cachless.CashlessItem

class SecondAdapter : RecyclerView.Adapter<SecondAdapter.SecondViewHolder>(){

    var listSecond = emptyList<CashlessItem>()

    class SecondViewHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money, parent, false)
        return SecondViewHolder(view)
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        holder.itemView.item_name.text = listSecond[position].ccy
        holder.itemView.item_buy.text = listSecond[position].buy
        holder.itemView.item_sale.text = listSecond[position].sale
    }

    override fun getItemCount(): Int {
        return listSecond.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<CashlessItem>) {
        listSecond = list
        notifyDataSetChanged()
    }
}
}