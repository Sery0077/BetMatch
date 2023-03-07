package sery.vlasenko.betmatch.ui.tables

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import sery.vlasenko.betmatch.databinding.FragmentTablesBinding

class TablesFragment : Fragment() {

    companion object {
        fun newInstance() = TablesFragment()
    }

    private val viewModel: TablesViewModel by viewModels()

    private lateinit var binding: FragmentTablesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTablesBinding.inflate(inflater, container, false)

        return binding.root
    }
}