package com.example.kotlin_puntoneutro.ui.dashboard

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.kotlin_puntoneutro.LogOutActivity
import com.example.kotlin_puntoneutro.R



class DashboardFragment : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate( R.layout.activity_profile, container,false )
    }

   
}