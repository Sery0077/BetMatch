package sery.vlasenko.betmatch.ui.news.adapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import sery.vlasenko.betmatch.R

@BindingAdapter("imageUrl")
fun setImageUrl(imageView: ImageView, url: String?) {
    url?.let {
        Glide.with(imageView)
            .load(url)
            .placeholder(R.drawable.placeholder)
            .into(imageView)
    }
}