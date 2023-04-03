/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.haiku.templates

import core.haiku.*
import org.lwjgl.generator.*

val pthread = "PThread".nativeClass(Module.CORE_HAIKU, prefixMethod = "pthread_", nativeSubPath = "haiku") {
    nativeImport("<pthread.h>")
    documentation = "Native bindings to &lt;pthread.h&gt;."

    pthread_t(
        "self",
        "",

        void()
    )
}
