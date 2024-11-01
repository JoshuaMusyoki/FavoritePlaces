package com.nerds.data.network

import com.nerds.data.model.PlaceResponse
import retrofit2.http.GET

interface ApiService {
    @GET("places") //API endpoint for fetching places
    suspend fun getPlaces(): List<PlaceResponse>
}