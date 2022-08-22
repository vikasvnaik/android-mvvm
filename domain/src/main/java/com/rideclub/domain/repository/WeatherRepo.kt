package com.rideclub.domain.repository

import com.rideclub.domain.entity.response.WeatherUpdate
import com.rideclub.domain.entity.wrapped.Response


interface WeatherRepo {
    suspend fun weatherUpdate(location: String): Response<WeatherUpdate>
}