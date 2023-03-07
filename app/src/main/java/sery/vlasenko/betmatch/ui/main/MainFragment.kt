package sery.vlasenko.betmatch.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import sery.vlasenko.betmatch.R
import sery.vlasenko.betmatch.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private val viewModel: MainViewModel by viewModels()

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setClickers()
        super.onViewCreated(view, savedInstanceState)
    }

    private fun setClickers() {
        binding.run {
            btnNews.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_newsFragment)
            }
            btnSettings.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_settingsFragment)
            }
            btnStatistics.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_statisticsFragment)
            }
            btnTables.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_tablesFragment)
            }
        }
    }

}