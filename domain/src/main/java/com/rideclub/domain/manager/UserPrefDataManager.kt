package com.rideclub.domain.manager

import com.rideclub.domain.repository.UserDataRepo


class UserPrefDataManager(private val userDataRepo: UserDataRepo) : UserDataRepo {

    override var isUserLoggedIn: Boolean
        get() = userDataRepo.isUserLoggedIn
        set(value) {
            userDataRepo.isUserLoggedIn = value
        }

    override var userId: String?
        get() = userDataRepo.userId
        set(value) {
            userDataRepo.userId = value
        }

    override var mobile: String?
        get() = userDataRepo.mobile
        set(value) {
            userDataRepo.mobile = value
        }

    override var token: String?
        get() = userDataRepo.token
        set(value) {
            userDataRepo.token = value
        }
}