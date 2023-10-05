package com.example.domain.repo

import androidx.paging.PagingData
import com.example.domain.model.anime.AnimeAttributesModel
import kotlinx.coroutines.flow.Flow

interface AnimeRepo {

    fun getAnime(): Flow<PagingData<AnimeAttributesModel>>

}