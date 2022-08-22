package com.rideclub.data.repository

import com.rideclub.data.remote.WeatherApi
import com.rideclub.domain.entity.wrapped.toResponseBody
import com.rideclub.domain.repository.WeatherRepo

class WeatherRepoImpl(private val weatherApi: WeatherApi) : WeatherRepo {

    override suspend fun weatherUpdate(location: String) = weatherApi.weatherUpdate(location).toResponseBody()

}

