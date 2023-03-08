package sery.vlasenko.betmatch.ui.news

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import sery.vlasenko.betmatch.databinding.ItemNewsBinding
import sery.vlasenko.betmatch.model.NewsItem

class NewsAdapter() : ListAdapter<NewsItem, NewsAdapter.NewsVH>(
    NewsDiffCallback()
) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsVH {
        return NewsVH.from(parent)
    }

    override fun onBindViewHolder(holder: NewsVH, position: Int) {
        val news = getItem(position)

        holder.bind(news)
    }

    class NewsVH private constructor(private val binding: ItemNewsBinding) :
        ViewHolder(binding.root) {

        fun bind(item: NewsItem) {
            binding.news = item
        }

        companion object {
            fun from(parent: ViewGroup): NewsVH {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemNewsBinding.inflate(layoutInflater, parent, false)

                return NewsVH(binding)
            }
        }
    }
}

class NewsDiffCallback : DiffUtil.ItemCallback<NewsItem>() {
    override fun areItemsTheSame(oldItem: NewsItem, newItem: NewsItem): Boolean {
        return oldItem.title == newItem.title
    }

    override fun areContentsTheSame(oldItem: NewsItem, newItem: NewsItem): Boolean {
        return oldItem == newItem
    }
}