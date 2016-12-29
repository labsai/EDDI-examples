/*
 * Copyright 2014 Blazebit.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ai.labs.example.lifecycle;

import io.sls.lifecycle.ILifecycleTask;
import io.sls.lifecycle.spi.ILifecycleTaskProviderSpi;

/**
 * @author Moritz Becker (moritz.becker@gmx.at)
 * @since 1.2
 */
public class CustomLifecycleTaskProvider implements ILifecycleTaskProviderSpi {
    public static final String ID = "ai.labs.example.custom-lifecycle-extension";

    public String getLifecycleTaskId() {
        return ID;
    }

    public Class<? extends ILifecycleTask> getLifecycleTaskClass() {
        return CustomLifecycleTask.class;
    }
}
