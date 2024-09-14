package com.songpol.coinranking.core.common.result

import app.cash.turbine.test
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.test.runTest
import org.junit.Test
import kotlin.test.assertEquals

class ResultTest {

    @Test
    fun result_emits_success() = runTest {
        flow {
            emit(1)
        }
            .asResult()
            .test {
                assertEquals(Result.Loading, awaitItem())

                when (val result = awaitItem()) {
                    is Result.Success -> assertEquals(
                        1,
                        result.data,
                    )
                    Result.Loading,
                    is Result.Error
                    -> throw IllegalStateException(
                        "The flow should have emitted an Success Result",
                    )
                    else -> {}
                }

                awaitComplete()
            }
    }

    @Test
    fun result_catches_errors() = runTest {
        flow {
            emit(1)
            throw Exception("Test Done")
        }
            .asResult()
            .test {
                assertEquals(Result.Loading, awaitItem())
                assertEquals(Result.Success(1), awaitItem())

                when (val errorResult = awaitItem()) {
                    is Result.Error -> assertEquals(
                        "Test Done",
                        errorResult.exception.message,
                    )

                    Result.Loading,
                    is Result.Success,
                    -> throw IllegalStateException(
                        "The flow should have emitted an Error Result",
                    )
                }

                awaitComplete()
            }
    }
}