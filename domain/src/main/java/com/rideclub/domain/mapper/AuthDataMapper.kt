package com.rideclub.domain.mapper

import com.rideclub.domain.entity.response.WeatherUpdate
import com.rideclub.domain.entity.wrapped.Response
import com.rideclub.domain.entity.wrapped.success
import com.rideclub.domain.repository.UserDataRepo

fun Response<WeatherUpdate>.storeUserInfo(userDataRepo: UserDataRepo): Response<WeatherUpdate> {
    return success {
        //userDataRepo.token = it.token
    }
}