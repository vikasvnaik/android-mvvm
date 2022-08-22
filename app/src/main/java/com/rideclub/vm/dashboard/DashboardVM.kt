package com.rideclub.vm.dashboard

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.rideclub.domain.usecase.WeatherUpdateUseCase
import com.rideclub.vm.BaseVM
import com.rideclub.vm.OnWeatherUpdateEvent
import com.rideclub.vm.UserEvent

class DashboardVM(
    private val weatherUpdateUseCase: WeatherUpdateUseCase
) : BaseVM() {

    override fun onAction(event: UserEvent) {
        when (event) {
            is OnWeatherUpdateEvent.UpdateWeather -> _weather.value = event.location
        }
    }


    private val _weather = MutableLiveData<String>()
    val weatherLiveData = Transformations.switchMap(_weather) {
        weatherUpdateUseCase.execute(viewModelIOScope,it).toLiveData()
    }
}