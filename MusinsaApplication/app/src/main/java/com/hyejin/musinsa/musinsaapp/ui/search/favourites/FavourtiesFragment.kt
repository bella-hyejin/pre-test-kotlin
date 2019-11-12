package com.hyejin.musinsa.musinsaapp.ui.search.favourites

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.hyejin.musinsa.musinsaapp.R
import com.hyejin.musinsa.musinsaapp.databinding.FavourtiesFragmentBinding


class FavourtiesFragment : Fragment() {

    private val TAG = "FAVOURIATES"

    companion object {
        fun newInstance() = FavourtiesFragment()
    }

    private lateinit var viewModel: FavourtiesViewModel

    private lateinit var binding: FavourtiesFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(FavourtiesViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.favourties_fragment, container, false)
        binding.favList.layoutManager = LinearLayoutManager(activity)

        viewModel.getAll().observe(this, Observer { items -> binding.users = items })

        return binding.root
    }

}
