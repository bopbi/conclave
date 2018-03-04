package com.arjunalabs.android.conclave.domain

import com.arjunalabs.android.conclave.entity.UserPage
import com.arjunalabs.android.conclave.repository.UserRepositoryInterface
import io.reactivex.Observable

/**
 * Created by bobbyprabowo on 04/03/18.
 */
class GetUsers(private val userRepositoryInterface: UserRepositoryInterface) : GetUsersInterface {

    override fun execute(): Observable<UserPage> = userRepositoryInterface.getUsers()

}