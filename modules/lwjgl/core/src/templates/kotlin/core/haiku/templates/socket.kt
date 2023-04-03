/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.haiku.templates

import core.haiku.*
import org.lwjgl.generator.*

val socket = "Socket".nativeClass(Module.CORE_HAIKU, nativeSubPath = "haiku") {
    nativeImport(
        "<sys/socket.h>",
        "<errno.h>"
    )
    documentation = "Native bindings to &lt;sys/socket.h&gt;."

    // TODO:

    EnumConstant(
        "The following constants should be used for the second parameter of {@code shutdown}.",

        "SHUT_RD".enum("No more receptions.", "0"),
        "SHUT_WR".enum("No more transmissions."),
        "SHUT_RDWR".enum("No more receptions or transmissions.")
    )

    SaveErrno..int(
        "socket",
        """
        Create a new socket of type {@code __type} in domain {@code __domain}, using protocol {@code __protocol}.
        
        If {@code __protocol} is zero, one is chosen automatically.  
        """,

        int("__domain", ""),
        int("__type", ""),
        int("__protocol", ""),

        returnDoc = "a file descriptor for the new socket, or -1 for errors"
    )
}
