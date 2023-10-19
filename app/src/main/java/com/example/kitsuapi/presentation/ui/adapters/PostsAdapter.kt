package com.example.kitsuapi.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kitsuapi.databinding.ItemPostBinding
import com.example.kitsuapi.presentation.model.posts.PostsAttributesUI
import java.text.SimpleDateFormat
import java.util.Date
import java.util.TimeZone

class PostsAdapter : PagingDataAdapter<PostsAttributesUI, PostsViewHolder>(ResultDiffUtilCallback) {

    override fun onBindViewHolder(holder: PostsViewHolder, position: Int) {
        getItem(position)?.let { holder.bind(it) }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostsViewHolder {
        return PostsViewHolder(
            ItemPostBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    private object ResultDiffUtilCallback : DiffUtil.ItemCallback<PostsAttributesUI>() {

        override fun areItemsTheSame(
            oldItem: PostsAttributesUI,
            newItem: PostsAttributesUI
        ): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(
            oldItem: PostsAttributesUI,
            newItem: PostsAttributesUI
        ): Boolean {
            return oldItem == newItem
        }

    }
}

class PostsViewHolder(private val binding: ItemPostBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun convertToHttpsUrl(httpUrl: String): String {
        return httpUrl.replace("http://", "https://")
    }

    fun getTimeDifference(timestamp: String): String {
        val sdf = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
        sdf.timeZone = TimeZone.getTimeZone("UTC")

        val date = sdf.parse(timestamp)
        val currentTime = Date()

        val diffInMillis = currentTime.time - date.time

        val minutes = (diffInMillis / (1000 * 60)).toInt()
        val hours = minutes / 60
        val days = hours / 24
        val years = days / 365

        return when {
            years > 0 -> "$years year ago"
            days > 0 -> "$days day ago"
            hours > 0 -> "$hours hour ago"
            else -> "$minutes minute ago"
        }
    }

    fun removeUrls(input: String): String {
        val regex = "(https?://[\\S]+)"
        return input.replace(Regex(regex), "")
    }

    fun bind(data: PostsAttributesUI) {
        val dataText = data.content?.let { removeUrls(it) }
        val image = data.embed?.url

        binding.txtCreatedAt.text = getTimeDifference(data.createdAt.toString())
        binding.txtContent.text = dataText

        Glide.with(binding.imgAvatar)
            .load("https://static.vecteezy.com/system/resources/previews/004/439/731/original/japanese-kitsune-mask-free-vector.jpg")
            .into(binding.imgAvatar)

        if (data.editedAt != null) {
            binding.txtEditedAt.text = getTimeDifference(data.editedAt.toString())
        } else {
            binding.txtEditedAt.visibility = View.GONE
        }

        if (data.spoiler == true) {
            binding.imgPoster.visibility = View.VISIBLE
            Glide.with(binding.imgPoster)
                .load("https://cdn.myfonts.net/cdn-cgi/image/width=417,height=208,fit=contain,format=auto/images/pim/10000/359915_0ab2a92b2810289a89e9ad6a1a6af84e.png")
                .into(binding.imgPoster)
            binding.imgPoster.setOnClickListener {
                Glide.with(binding.imgPoster).load(convertToHttpsUrl(image.toString()))
                    .into(binding.imgPoster)
            }
        } else {
            if (image != null) {
                binding.imgPoster.visibility = View.VISIBLE
                Glide.with(binding.imgPoster).load(convertToHttpsUrl(image.toString()))
                    .into(binding.imgPoster)
            } else {
                binding.imgPoster.visibility = View.GONE
            }
        }

    }

}