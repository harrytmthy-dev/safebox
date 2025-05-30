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

package com.harrytmthy.safebox.constants

internal object ValueTypeTag {
    const val INT: Byte = 0x01
    const val LONG: Byte = 0x02
    const val FLOAT: Byte = 0x03
    const val BOOLEAN: Byte = 0x04
    const val STRING: Byte = 0x05
    const val STRING_SET: Byte = 0x06
}
