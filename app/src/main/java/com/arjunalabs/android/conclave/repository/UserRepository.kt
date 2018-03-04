package com.arjunalabs.android.conclave.repository

import com.arjunalabs.android.conclave.entity.UserPage
import io.reactivex.Observable

/**
 * Created by bobbyprabowo on 04/03/18.
 */
class UserRepository(private val userService: UserService) : UserRepositoryInterface {

    override fun getUsers(): Observable<UserPage> {
        return userService.getUsers()
    }

}