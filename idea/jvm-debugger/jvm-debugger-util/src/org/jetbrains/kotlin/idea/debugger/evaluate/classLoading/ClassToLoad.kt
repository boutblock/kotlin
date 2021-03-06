/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.idea.debugger.evaluate.classLoading

const val GENERATED_FUNCTION_NAME = "generated_for_debugger_fun"
const val GENERATED_CLASS_NAME = "Generated_for_debugger_class"

@Suppress("ArrayInDataClass")
data class ClassToLoad(val className: String, val relativeFileName: String, val bytes: ByteArray) {
    val isMainClass: Boolean
        get() = className == GENERATED_CLASS_NAME
}