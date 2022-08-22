package com.rideclub.domain.repository

interface UserDataRepo {
    var userId: String?
    var mobile : String?
    var token: String?
    var isUserLoggedIn: Boolean
}