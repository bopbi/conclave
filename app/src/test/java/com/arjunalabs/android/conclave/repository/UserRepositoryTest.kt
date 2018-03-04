package com.arjunalabs.android.conclave.repository

import com.arjunalabs.android.conclave.domain.GetUsers
import com.arjunalabs.android.conclave.entity.User
import com.arjunalabs.android.conclave.entity.UserPage
import com.nhaarman.mockito_kotlin.whenever
import io.reactivex.Observable
import org.junit.Test
import org.mockito.Mockito

/**
 * Created by bobbyprabowo on 04/03/18.
 */
class UserRepositoryTest {

    @Test
    fun `get users should return exist`() {

        val expectedUser = UserPage(1,1,1,1, listOf(User(1,"","","")))
        val userServiceMock = Mockito.mock(UserService::class.java)

        whenever(userServiceMock.getUsers()).thenReturn(Observable.just(expectedUser))

        val userRepository = UserRepository(userServiceMock)
        val testSubscriber = userRepository.getUsers().test()

        assert(testSubscriber.values().equals(expectedUser))
    }
}