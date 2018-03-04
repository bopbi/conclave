package com.arjunalabs.android.conclave.viewmodel

import com.arjunalabs.android.conclave.entity.User

/**
 * Created by bobbyprabowo on 04/03/18.
 */
data class MainViewState(val isLoading:Boolean, val data: List<User>, val error: Throwable?)