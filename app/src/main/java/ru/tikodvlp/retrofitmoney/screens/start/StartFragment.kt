package ru.tikodvlp.retrofitmoney.screens.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_start.view.*
import ru.tikodvlp.retrofitmoney.R

class StartFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: StartAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel = ViewModelProvider(this).get(StartViewModel::class.java)
        val v =  inflater.inflate(R.layout.fragment_start, container, false)
        recyclerView = v.rv_start
        adapter = StartAdapter()
        recyclerView.adapter = adapter
        viewModel.getCashMoney()
        viewModel.myMoneyList.observe(viewLifecycleOwner, { list->
            list.body()?.let { adapter.setList(it) }
        })

        return v
    }
}