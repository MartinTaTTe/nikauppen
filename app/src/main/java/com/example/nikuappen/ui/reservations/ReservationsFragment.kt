package com.example.nikuappen.ui.reservations

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.nikuappen.R

class ReservationsFragment : Fragment() {

    private lateinit var reservationsViewModel: ReservationsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        reservationsViewModel =
            ViewModelProviders.of(this).get(ReservationsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_reservations, container, false)
        val textView: TextView = root.findViewById(R.id.text_spaces)
        reservationsViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}