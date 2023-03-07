package sery.vlasenko.betmatch.ui.tableDetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import sery.vlasenko.betmatch.databinding.FragmentTableDetailBinding

class TableDetailFragment : Fragment() {

    companion object {
        fun newInstance() = TableDetailFragment()
    }

    private val viewModel: TableDetailViewModel by viewModels()

    private lateinit var binding: FragmentTableDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTableDetailBinding.inflate(inflater, container, false)

        return binding.root
    }


}