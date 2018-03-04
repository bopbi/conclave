package com.arjunalabs.android.conclave.repository

import com.arjunalabs.android.conclave.entity.UserPage
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.POST

/**
 * Created by bobbyprabowo on 04/03/18.
 */

interface UserService {
    @GET("/api/users")
    fun getUsers(): Observable<UserPage>

    @POST("/api/users")
    fun createUser(): Observable<Boolean>
}