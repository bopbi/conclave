package com.arjunalabs.android.conclave.viewmodel

import android.arch.lifecycle.ViewModel
import com.arjunalabs.android.conclave.domain.GetUsers
import com.arjunalabs.android.conclave.domain.GetUsersInterface
import com.arjunalabs.android.conclave.repository.UserGateway
import com.arjunalabs.android.conclave.repository.UserRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.reactivex.subjects.PublishSubject
import kotlinx.android.synthetic.main.activity_main.text_main

/**
 * Created by bobbyprabowo on 04/03/18.
 */
class MainViewModel : ViewModel() {

    val viewModelSubject : PublishSubject<String> = PublishSubject.create()
    lateinit var getUsers : GetUsersInterface
    var stringState = ""

    init {
        val userGateway = UserGateway()
        val userService = userGateway.getRetrofitService()
        val userRepository = UserRepository(userService)
        getUsers = GetUsers(userRepository)
    }

    fun getUser() {
        getUsers.execute()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    stringState = it.data[0].first_name
                    viewModelSubject.onNext(stringState)
                }
    }
}