package com.arjunalabs.android.conclave.domain

import com.arjunalabs.android.conclave.entity.UserPage
import io.reactivex.Observable

/**
 * Created by bobbyprabowo on 04/03/18.
 */
interface GetUsersInterface {

    fun execute() : Observable<UserPage>
}