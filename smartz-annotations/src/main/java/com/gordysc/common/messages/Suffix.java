/**
 * Copyright 2015 Luke Gordon
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gordysc.common.messages;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ResourceBundle;

@Retention( RetentionPolicy.RUNTIME )
@Target( ElementType.METHOD )
public @interface Suffix {
    /**
     * @return {@link String} to append to a {@link MessageKey} for fetching text from a {@link ResourceBundle}
     */
    String value() default "";

    /**
     * @return true if this {@link Suffix} must be present, false otherwise
     */
    boolean required() default true;
}
