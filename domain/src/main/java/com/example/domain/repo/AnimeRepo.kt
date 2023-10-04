package com.example.domain.repo

import androidx.paging.PagingData
import com.example.domain.model.anime.AttributesModel
import kotlinx.coroutines.flow.Flow

interface AnimeRepo {

    fun getAnime(): Flow<PagingData<AttributesModel>>

}