package com.rideclub.domain.usecase

import com.rideclub.domain.entity.response.WeatherUpdate
import com.rideclub.domain.entity.wrapped.toResult
import com.rideclub.domain.manager.WeatherUpdateManager


class WeatherUpdateUseCase(private val weatherUpdateManager: WeatherUpdateManager) : UseCase<String, WeatherUpdate> {
    override suspend fun onExecute(parameter: String?) =
        weatherUpdateManager.weatherUpdate(parameter!!).toResult()
}
