package com.vlyashuk.currencyconverter.screens.root

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.google.android.material.tabs.TabLayoutMediator
import com.vlyashuk.currencyconverter.R
import com.vlyashuk.currencyconverter.ViewPagerAdapter
import com.vlyashuk.currencyconverter.databinding.FragmentRootBinding
import com.vlyashuk.currencyconverter.databinding.FragmentStartBinding

class RootFragment : Fragment() {

    private var context_fragment: Context? = null

    private var _binding: FragmentRootBinding? = null
    private val binding: FragmentRootBinding
        get() = _binding ?: throw RuntimeException("FragmentRootBinding")

    override fun onAttach(context: Context) {
        super.onAttach(context)
        context_fragment = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRootBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tabLayout.tabIconTint = null
        binding.viewPager.adapter = ViewPagerAdapter(context_fragment as FragmentActivity)
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position_tab ->
            when (position_tab) {
                0 -> {
                    tab.setIcon(R.drawable.ic_money)
                }

                1 -> {
                    tab.setIcon(R.drawable.ic_compact)
                }
            }
        }.attach()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}