package com.arjunalabs.android.conclave.repository

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory

/**
 * Created by bobbyprabowo on 04/03/18.
 */

class UserGateway {

    fun getRetrofitService() : UserService {
        val retrofit = Retrofit.Builder()
                .baseUrl("https://reqres.in")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()

        return retrofit.create<UserService>(UserService::class.java)
    }
}