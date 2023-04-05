package com.example.uklrecycle

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders


class fragment_second : Fragment() {
    private var communicationViewModel: CommunicationViewModel? = null
    private var txtName: TextView? = null
    private var txtEmail: TextView? = null
    private var txtUsername: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        communicationViewModel = ViewModelProviders.of(requireActivity()).get(CommunicationViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txtName = view.findViewById(R.id.textViewName)
        communicationViewModel!!.name.observe(requireActivity(),
            Observer { s -> txtName!!.text = s })

        txtEmail = view.findViewById(R.id.textViewEmail)
        communicationViewModel!!.email.observe(requireActivity(),
            Observer { s -> txtEmail!!.text = s })

        txtUsername = view.findViewById(R.id.textViewUsername)
        communicationViewModel!!.username.observe(requireActivity(),
            Observer { s -> txtUsername!!.text = s })
    }

    companion object {
        fun newInstance(): fragment_second {
            return fragment_second()
            }
        }

}