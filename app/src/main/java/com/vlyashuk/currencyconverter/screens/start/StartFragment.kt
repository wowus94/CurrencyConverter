package com.vlyashuk.currencyconverter.screens.start

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.vlyashuk.currencyconverter.databinding.FragmentStartBinding

class StartFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: StartAdapter

    private var _binding: FragmentStartBinding? = null
    private val binding: FragmentStartBinding
        get() = _binding ?: throw RuntimeException("FragmentStartBinding is null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        val viewModel = ViewModelProvider(this).get(StartViewModel::class.java)
        _binding = FragmentStartBinding.inflate(inflater, container, false)
        recyclerView = binding.rvStartFragment
        adapter = StartAdapter()
        recyclerView.adapter = adapter
        viewModel.getMoney()
        viewModel.moneyList.observe(viewLifecycleOwner) { list ->
           list.body()?.let { adapter.setList(listOf(it)) }
        }
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}