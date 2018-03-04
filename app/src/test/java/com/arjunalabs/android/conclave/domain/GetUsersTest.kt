package com.arjunalabs.android.conclave.domain

import com.arjunalabs.android.conclave.entity.User
import com.arjunalabs.android.conclave.entity.UserPage
import com.arjunalabs.android.conclave.repository.UserRepositoryInterface
import com.nhaarman.mockito_kotlin.whenever
import io.reactivex.Observable
import io.reactivex.observers.TestObserver
import io.reactivex.subscribers.TestSubscriber
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito

/**
 * Created by bobbyprabowo on 04/03/18.
 */
class GetUsersTest {

    @Test
    fun `get users should return exist`() {

        val expectedUser = UserPage(1,1,1,1, listOf(User(1,"","","")))
        val userRepoMock = Mockito.mock(UserRepositoryInterface::class.java)
        whenever(userRepoMock.getUsers()).thenReturn(Observable.just(expectedUser))
        val getUser = GetUsers(userRepoMock)
        val testSubscriber = getUser.execute().test()
        assert(testSubscriber.values().equals(expectedUser))
    }
}