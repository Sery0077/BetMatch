package sery.vlasenko.betmatch.ui.news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import sery.vlasenko.betmatch.databinding.FragmentNewsBinding
import sery.vlasenko.betmatch.model.DataResult
import sery.vlasenko.betmatch.model.DataResult.Status.*
import sery.vlasenko.betmatch.model.NewsItem

@AndroidEntryPoint
class NewsFragment : Fragment() {

    companion object {
        fun newInstance() = NewsFragment()
    }

    private val viewModel: NewsViewModel by viewModels()
    private lateinit var binding: FragmentNewsBinding

    private val adapter: NewsAdapter = NewsAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNewsBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setupRecycler()
        viewModel.newsList.observe(viewLifecycleOwner) {
            handleResult(it)
        }
        super.onViewCreated(view, savedInstanceState)
    }

    private fun setupRecycler() {
        binding.rvNews.adapter = adapter

    }

    private fun handleResult(result: DataResult<List<NewsItem>>) {
        when (result.status) {
            SUCCESS -> {
                adapter.submitList(result.data)
            }
            ERROR -> {
                Toast.makeText(requireContext(), "Error", Toast.LENGTH_LONG).show()
            }
            LOADING -> {

            }
        }
    }
}