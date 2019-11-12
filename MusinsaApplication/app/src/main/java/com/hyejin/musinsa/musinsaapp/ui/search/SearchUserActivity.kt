package com.hyejin.musinsa.musinsaapp.ui.search

import android.os.Bundle
import android.view.Menu
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.databinding.DataBindingUtil
import androidx.viewpager.widget.ViewPager
import com.hyejin.musinsa.musinsaapp.R
import com.hyejin.musinsa.musinsaapp.databinding.ActivitySearchUserBinding
import com.hyejin.musinsa.musinsaapp.ui.search.common.ViewPagerAdapter
import com.hyejin.musinsa.musinsaapp.ui.search.favourites.FavourtiesFragment
import com.hyejin.musinsa.musinsaapp.ui.search.users.UsersFragment
import kotlinx.android.synthetic.main.activity_search_user.*

class SearchUserActivity : AppCompatActivity(), ViewPager.OnPageChangeListener {

    private lateinit var binding: ActivitySearchUserBinding

    private lateinit var searchview: SearchView
    private var notFirst = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupViews()
    }

    private fun setupViews() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_search_user)
        setupTabs()
        setupToolbar()
    }

    private fun setupTabs() {
        val adapter =
            ViewPagerAdapter(supportFragmentManager)
        adapter.addFragement(UsersFragment(), getString(R.string.title_users))
        adapter.addFragement(FavourtiesFragment(), getString(R.string.title_favourites))

        binding.searchViewPager.adapter = adapter
        binding.searchViewPager.addOnPageChangeListener(this)
        binding.searchTabs.setupWithViewPager(binding.searchViewPager)
    }

    private fun setupToolbar() {
        setSupportActionBar(search_toolbar)

        search_toolbar.title = getString(R.string.app_name)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_search_user, menu)
        val menuItem = menu?.findItem(R.id.action_search)!!
        searchview = menuItem.actionView as SearchView

        searchview.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                ((binding.searchViewPager.adapter as ViewPagerAdapter).getItem(0) as UsersFragment).confirmUsername(query!!)
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return false
            }

        })

        return super.onCreateOptionsMenu(menu)
    }

    private fun showSearchView() {
        searchview.visibility = View.VISIBLE
    }

    private fun hideSearchView() {
        searchview.visibility = View.GONE
    }

    override fun onPageScrollStateChanged(state: Int) {
        if (state != 0 && !notFirst) notFirst = true
    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
        if (notFirst) {
                when (position) {
                    0 -> showSearchView()
                    1 -> hideSearchView()
                }
        }
    }

    override fun onPageSelected(position: Int) {
        if (notFirst) {
            when (position) {
                0 -> showSearchView()
                1 -> hideSearchView()
            }
        }
    }
}
