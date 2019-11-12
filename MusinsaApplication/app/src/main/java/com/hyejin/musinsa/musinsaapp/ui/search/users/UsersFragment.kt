package com.hyejin.musinsa.musinsaapp.ui.search.users

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hyejin.musinsa.musinsaapp.R
import com.hyejin.musinsa.musinsaapp.databinding.UsersFragmentBinding

class UsersFragment : Fragment() {

    private val TAG = "USERSFRAGMENT"

    companion object {
        fun newInstance() = UsersFragment()
    }

    private lateinit var viewModel: UsersViewModel
    private lateinit var binding: UsersFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(UsersViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.users_fragment, container,false)
        binding.usersList.layoutManager = LinearLayoutManager(activity) as RecyclerView.LayoutManager?

        UsersBindings.setViewModel(viewModel)

        return binding.root
    }

    fun confirmUsername(username: String) {
        viewModel.sendUserName(username).observe(this, Observer { items -> binding.users = items })
    }
}
