/**
 * Copyright (C) 2014 Microsoft Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.microsoft.wake.time.runtime;

import javax.inject.Inject;

public final class RealTimer implements Timer {

    @Inject
    public RealTimer() {
    }

    @Override
    public long getCurrent() {
        return System.currentTimeMillis();
    }

    @Override
    public long getDuration(final long time) {
        return time - getCurrent();
    }

    @Override
    public boolean isReady(final long time) {
        return getDuration(time) <= 0;
    }
}
