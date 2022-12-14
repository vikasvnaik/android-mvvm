package com.rideclub.vm

interface UserEvent

sealed class OnWeatherUpdateEvent : UserEvent {
    data class UpdateWeather(val location: String) : OnWeatherUpdateEvent()
}
