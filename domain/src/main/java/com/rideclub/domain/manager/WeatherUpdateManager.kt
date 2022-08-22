package com.rideclub.domain.manager

import com.rideclub.domain.repository.WeatherRepo

class WeatherUpdateManager(
    private val weatherRepo: WeatherRepo,
) : WeatherRepo {
    override suspend fun weatherUpdate(location: String) =
        weatherRepo.weatherUpdate(location)
}