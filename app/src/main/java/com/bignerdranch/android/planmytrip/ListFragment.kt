package com.bignerdranch.android.planmytrip

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var listAdapter: ListAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_list, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        val itemList = listOf(
            Item(R.drawable.australia,  getString(R.string.australia_description)),
            Item(R.drawable.canada, getString(R.string.canada_description)),
            Item(R.drawable.china, getString(R.string.china_description)),
            Item(R.drawable.bali, getString(R.string.bali_description)),
            Item(R.drawable.dubai, getString(R.string.dubai_description)),
            Item(R.drawable.florida, getString(R.string.florida_description)),
            Item(R.drawable.france, getString(R.string.france_description)),
            Item(R.drawable.india, getString(R.string.india_description)),
            Item(R.drawable.italy, getString(R.string.italy_description)),
            Item(R.drawable.russia, getString(R.string.russia_description)),
            Item(R.drawable.singapore, getString(R.string.singapore_description)),
            Item(R.drawable.tokyo, getString(R.string.tokyo_description)),
            Item(R.drawable.turkey, getString(R.string.turkey_description)),
        )
        listAdapter = ListAdapter(itemList)
        recyclerView.adapter = listAdapter
        return view
    }
}
