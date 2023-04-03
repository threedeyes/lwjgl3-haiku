/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.haiku.templates

import core.haiku.*
import org.lwjgl.generator.*

val sys_stat_h = "Stat".nativeClass(Module.CORE_HAIKU, nativeSubPath = "haiku") {
    nativeImport(
        "<sys/stat.h>",
        "<errno.h>"
    )
    documentation = "Native bindings to &lt;sys/stat.h&gt;."

    // TODO:

    SaveErrno..int(
        "stat",
        "",

        charUTF8.const.p("__file", ""),
        stat.p("__buf", "")
    )

    SaveErrno..int(
        "fstat",
        "",

        int("__fd", ""),
        stat.p("__buf", "")
    )
}
