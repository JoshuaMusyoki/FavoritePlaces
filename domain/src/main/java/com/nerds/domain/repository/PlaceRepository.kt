package com.nerds.domain.repository

import com.nerds.data.model.PlaceResponse
import kotlinx.coroutines.flow.Flow

interface PlaceRepository {
    suspend fun fetchPlaces(): Flow<List<PlaceResponse>>
}