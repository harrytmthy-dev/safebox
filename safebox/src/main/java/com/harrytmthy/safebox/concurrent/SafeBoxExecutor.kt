/*
 * Copyright 2025 Harry Timothy Tumalewa
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.harrytmthy.safebox.concurrent

import java.util.concurrent.Executors

/**
 * Internal executor for background tasks within SafeBox, designed to isolate cryptographic or
 * resource-sensitive operations from the main thread.
 *
 * The structure is extensible to support multi-threaded or categorized executors in the future.
 */
internal object SafeBoxExecutor {

    private const val THREAD_NAME = "SafeBox-Worker"

    private val singleThreadExecutor = Executors.newSingleThreadExecutor { runnable ->
        Thread(runnable, THREAD_NAME).apply {
            isDaemon = true
            priority = Thread.NORM_PRIORITY
        }
    }

    fun executeSingleThread(task: () -> Unit) {
        singleThreadExecutor.execute(task)
    }
}
