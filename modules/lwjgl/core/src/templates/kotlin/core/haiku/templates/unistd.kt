/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.haiku.templates

import core.haiku.*
import org.lwjgl.generator.*

val unistd = "UNISTD".nativeClass(Module.CORE_HAIKU, nativeSubPath = "haiku") {
    nativeImport(
        "<unistd.h>",
        "<errno.h>"
    )

    documentation = "Native bindings to &lt;unistd.h&gt;."

    EnumConstant(
        "",

        "_SC_OPEN_MAX".enum("", "4"),
        "_SC_PAGE_SIZE".enum("", "30"),
        "_SC_IOV_MAX".enum("", "60")
    )

    SaveErrno..int(
        "close",
        """

        """,

        int("fd", "")
    )

    SaveErrno..long(
        "sysconf",
        """

        """,

        int("name", "")
    )

    SaveErrno..ssize_t(
        "read",
        "",

        int("fd", ""),
        void.p("buf", ""),
        AutoSize("buf")..size_t("count", "")
    )

    pid_t(
        "getpid",
        "",

        void()
    )

    pid_t(
        "getppid",
        "",

        void()
    )
}
