/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.haiku;

import org.lwjgl.system.*;

import javax.annotation.*;
import java.nio.*;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.haiku.DynamicLinkLoader.*;

/** Implements a {@link SharedLibrary} on the Haiku OS. */
public class HaikuLibrary extends SharedLibrary.Default {

    public HaikuLibrary(String name) {
        this(name, loadLibrary(name));
    }

    public HaikuLibrary(String name, long handle) {
        super(name, handle);
    }

    private static long loadLibrary(String name) {
        long handle;
        try (MemoryStack stack = stackPush()) {
            handle = dlopen(stack.UTF8(name), RTLD_LAZY | RTLD_LOCAL);
        }
        if (handle == NULL) {
            throw new UnsatisfiedLinkError("Failed to dynamically load library: " + name + "(error = " + dlerror() + ")");
        }
        return handle;
    }

    @Nullable
    @Override
    public String getPath() {
        return SharedLibraryUtil.getLibraryPath(address());
    }

    @Override
    public long getFunctionAddress(ByteBuffer functionName) {
        return dlsym(address(), functionName);
    }

    @Override
    public void free() {
        dlclose(address());
    }

}
