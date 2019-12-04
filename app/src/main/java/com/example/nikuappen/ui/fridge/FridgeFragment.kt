package com.example.nikuappen.ui.fridge

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import com.example.nikuappen.R

class FridgeFragment : Fragment() {

    private lateinit var fridgeViewModel: FridgeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fridgeViewModel =
            ViewModelProviders.of(this).get(FridgeViewModel::class.java)
        val root: View = inflater.inflate(R.layout.fragment_fridge, container, false)
        val recyclerView: RecyclerView = root.findViewById(R.id.recycler_fridge)
        /*fridgeViewModel.text.observe(this, Observer {
            cardView.text = it
        })*/
        return root
    }
}