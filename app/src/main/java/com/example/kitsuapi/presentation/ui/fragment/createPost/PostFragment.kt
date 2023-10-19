package com.example.kitsuapi.presentation.ui.fragment.createPost

import android.util.Log
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsuapi.R
import com.example.kitsuapi.databinding.FragmentPostBinding
import com.example.kitsuapi.presentation.base.BaseFragment
import com.example.kitsuapi.presentation.model.createPost.CreatePostAttributesUI
import com.example.kitsuapi.presentation.model.createPost.CreatePostDataUI
import com.example.kitsuapi.presentation.model.createPost.CreatePostDataXUI
import com.example.kitsuapi.presentation.model.createPost.CreatePostRelationshipsUI
import com.example.kitsuapi.presentation.model.createPost.CreatePostUI
import com.example.kitsuapi.presentation.model.createPost.CreatePostUploadsUI
import com.example.kitsuapi.presentation.model.createPost.CreatePostUserUI
import org.koin.androidx.viewmodel.ext.android.viewModel


class PostFragment() : BaseFragment<FragmentPostBinding, PostViewModel>(R.layout.fragment_post) {

    override val binding: FragmentPostBinding by viewBinding(FragmentPostBinding::bind)
    override val viewModel: PostViewModel by viewModel()

    override fun initListeners() {
        super.initListeners()
        binding.apply {
            btnPost.setOnClickListener {
                val content = etText.text.toString()
                var nsfw = false
                var spoiler = false

                if (btnNSFW.isChecked) {
                    nsfw = true
                }
                if (btnSpoiler.isChecked) {
                    spoiler = true
                }

                Log.e("erbol", "eti: $content $nsfw $spoiler")

                viewModel.createPost(
                    CreatePostUI(
                        CreatePostDataUI(
                            CreatePostAttributesUI(content, nsfw = nsfw, spoiler = spoiler),
                            CreatePostRelationshipsUI(
                                user = CreatePostUserUI(
                                    CreatePostDataXUI("9779867", "users")
                                ),
                                uploads = CreatePostUploadsUI()
                            ), "posts"
                        )
                    )
                )
            }

            binding.btnCancel.setOnClickListener {
                findNavController().navigateUp()
            }
        }

    }

    override fun launchObservers() {
        super.launchObservers()

        viewModel.createPost.spectateUiState(
            error = {
                Toast.makeText(requireActivity(), "error", Toast.LENGTH_SHORT).show()
                Log.e("erbol", "fragment createPost: $it")
            },
            success = {
                if (it.content != null) {
                    Log.e("erbol", "content: " + it.content)
                    findNavController().navigateUp()
                    Toast.makeText(requireActivity(), "post created", Toast.LENGTH_SHORT).show()
                }
            })
    }

}


