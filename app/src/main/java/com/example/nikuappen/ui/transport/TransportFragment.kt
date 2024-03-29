package com.example.nikuappen.ui.transport

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.nikuappen.R

class TransportFragment : Fragment() {

    private lateinit var transportViewModel: TransportViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        transportViewModel =
            ViewModelProviders.of(this).get(TransportViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_transport, container, false)
        val textView: TextView = root.findViewById(R.id.text_transport)
        transportViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}