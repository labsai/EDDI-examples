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

import io.sls.lifecycle.*;
import io.sls.memory.IConversationMemory;

import java.util.List;
import java.util.Map;

/**
 * @author Moritz Becker (moritz.becker@gmx.at)
 * @since 1.2
 */
public class CustomLifecycleTask implements ILifecycleTask {
    public String getId() {
        return CustomLifecycleTaskProvider.ID;
    }

    public Object getComponent() {
        // custom implementation
        return null;
    }

    public List<String> getComponentDependencies() {
        // custom implementation
        return null;
    }

    public List<String> getOutputDependencies() {
        // custom implementation
        return null;
    }

    public void init() {
        // custom implementation
    }

    public void executeTask(IConversationMemory conversationMemory) throws LifecycleException {
        // custom implementation
    }

    public void configure(Map<String, Object> map) throws PackageConfigurationException {
        // custom implementation
    }

    public void setExtensions(Map<String, Object> map) throws UnrecognizedExtensionException, IllegalExtensionConfigurationException {
        // custom implementation
    }
}
