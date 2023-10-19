package com.example.domain.repo

import androidx.paging.PagingData
import com.example.domain.model.manga.MangaAttributesModel
import kotlinx.coroutines.flow.Flow

interface MangaRepo {

    fun getManga(filter: List<String>?): Flow<PagingData<MangaAttributesModel>>

}