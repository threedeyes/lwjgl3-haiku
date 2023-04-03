/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.haiku.templates

import core.haiku.*
import org.lwjgl.generator.*

val uio = "UIO".nativeClass(Module.CORE_HAIKU, nativeSubPath = "haiku") {
    nativeImport(
        "<sys/uio.h>",
        "<errno.h>"
    )
    documentation = "Native bindings to &lt;sys/uio.h&gt;."

    // TODO:

    IntConstant("", "UIO_FASTIOV".."8")
    IntConstant("", "UIO_MAXIOV".."1024")

    EnumConstant(
        "Flags for {@code preadv2}/{@code pwritev2}.",

        "RWF_HIPRI".enum("High priority request.", 0x00000001),
        "RWF_DSYNC".enum("per-IO #O_DSYNC", 0x00000002),
        "RWF_SYNC".enum("per-IO #O_SYNC", 0x00000004),
        "RWF_NOWAIT".enum("per-IO nonblocking mode", 0x00000008),
        "RWF_APPEND".enum("per-IO #O_APPEND", 0x00000010),
    )

    SaveErrno..ssize_t(
        "readv",
        "",

        int("__fd", ""),
        iovec.const.p("__iovec", ""),
        int("__count", "")
    )

    SaveErrno..ssize_t(
        "writev",
        "",

        int("__fd", ""),
        iovec.const.p("__iovec", ""),
        int("__count", "")
    )

    SaveErrno..ssize_t(
        "preadv",
        "",

        int("__fd", ""),
        iovec.const.p("__iovec", ""),
        int("__count", ""),
        off_t("__offset", "")
    )

    SaveErrno..ssize_t(
        "pwritev",
        "",

        int("__fd", ""),
        iovec.const.p("__iovec", ""),
        int("__count", ""),
        off_t("__offset", "")
    )

    /*SaveErrno..ssize_t(
        "preadv2",
        "",

        int("__fd", ""),
        iovec.const.p("__iovec", ""),
        int("__count", ""),
        off_t("__offset", ""),
        int("__flags", "")
    )*/

    /*SaveErrno..ssize_t(
        "pwritev2",
        "",

        int("__fd", ""),
        iovec.const.p("__iovec", ""),
        int("__count", ""),
        off_t("__offset", ""),
        int("__flags", "")
    )*/
}
