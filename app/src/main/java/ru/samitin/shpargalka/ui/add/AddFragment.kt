package ru.samitin.shpargalka.ui.add

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import ru.samitin.shpargalka.R

class AddFragment : Fragment() {

    private lateinit var dashboardViewModel: AddViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
            ViewModelProvider(this).get(AddViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_add, container, false)

        dashboardViewModel.text.observe(viewLifecycleOwner, Observer {

        })
        return root
    }
}