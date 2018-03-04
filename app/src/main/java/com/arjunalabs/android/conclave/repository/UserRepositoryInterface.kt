package com.arjunalabs.android.conclave.repository

import com.arjunalabs.android.conclave.entity.UserPage
import io.reactivex.Observable

/**
 * Created by bobbyprabowo on 04/03/18.
 */
interface UserRepositoryInterface {

    fun getUsers() : Observable<UserPage>

}