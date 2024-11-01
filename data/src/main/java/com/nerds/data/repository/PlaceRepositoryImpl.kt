package com.nerds.data.repository

import com.nerds.data.model.PlaceResponse
import com.nerds.data.network.ApiService
import com.nerds.domain.repository.PlaceRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class PlaceRepositoryImpl (private val apiService: ApiService): PlaceRepository {
    override suspend fun fetchPlaces(): Flow<List<PlaceResponse>> = flow {
        val places = apiService.getPlaces()
        emit(places)
    }
}