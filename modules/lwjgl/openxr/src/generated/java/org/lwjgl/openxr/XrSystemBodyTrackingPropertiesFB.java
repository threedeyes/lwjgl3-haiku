/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * System property for body tracking.
 * 
 * <h5>Description</h5>
 * 
 * <p>If a runtime returns {@link XR10#XR_FALSE FALSE} for {@code supportsBodyTracking}, the runtime <b>must</b> return {@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED} from {@link FBBodyTracking#xrCreateBodyTrackerFB CreateBodyTrackerFB}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBBodyTracking XR_FB_body_tracking} extension <b>must</b> be enabled prior to using {@link XrSystemBodyTrackingPropertiesFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBBodyTracking#XR_TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_FB TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSystemBodyTrackingPropertiesFB {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrBool32 {@link #supportsBodyTracking};
 * }</code></pre>
 */
public class XrSystemBodyTrackingPropertiesFB extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSBODYTRACKING;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SUPPORTSBODYTRACKING = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrSystemBodyTrackingPropertiesFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemBodyTrackingPropertiesFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** an {@code XrBool32}, indicating if current system is capable of receiving body tracking input. */
    @NativeType("XrBool32")
    public boolean supportsBodyTracking() { return nsupportsBodyTracking(address()) != 0; }

    /** Sets the specified value to the {@link #type} field. */
    public XrSystemBodyTrackingPropertiesFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBBodyTracking#XR_TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_FB TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_FB} value to the {@link #type} field. */
    public XrSystemBodyTrackingPropertiesFB type$Default() { return type(FBBodyTracking.XR_TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSystemBodyTrackingPropertiesFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemBodyTrackingPropertiesFB set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSystemBodyTrackingPropertiesFB set(XrSystemBodyTrackingPropertiesFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemBodyTrackingPropertiesFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemBodyTrackingPropertiesFB malloc() {
        return wrap(XrSystemBodyTrackingPropertiesFB.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSystemBodyTrackingPropertiesFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemBodyTrackingPropertiesFB calloc() {
        return wrap(XrSystemBodyTrackingPropertiesFB.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSystemBodyTrackingPropertiesFB} instance allocated with {@link BufferUtils}. */
    public static XrSystemBodyTrackingPropertiesFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSystemBodyTrackingPropertiesFB.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSystemBodyTrackingPropertiesFB} instance for the specified memory address. */
    public static XrSystemBodyTrackingPropertiesFB create(long address) {
        return wrap(XrSystemBodyTrackingPropertiesFB.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemBodyTrackingPropertiesFB createSafe(long address) {
        return address == NULL ? null : wrap(XrSystemBodyTrackingPropertiesFB.class, address);
    }

    /**
     * Returns a new {@link XrSystemBodyTrackingPropertiesFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemBodyTrackingPropertiesFB.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemBodyTrackingPropertiesFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemBodyTrackingPropertiesFB.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemBodyTrackingPropertiesFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemBodyTrackingPropertiesFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSystemBodyTrackingPropertiesFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemBodyTrackingPropertiesFB.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemBodyTrackingPropertiesFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSystemBodyTrackingPropertiesFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemBodyTrackingPropertiesFB malloc(MemoryStack stack) {
        return wrap(XrSystemBodyTrackingPropertiesFB.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSystemBodyTrackingPropertiesFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemBodyTrackingPropertiesFB calloc(MemoryStack stack) {
        return wrap(XrSystemBodyTrackingPropertiesFB.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSystemBodyTrackingPropertiesFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemBodyTrackingPropertiesFB.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemBodyTrackingPropertiesFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemBodyTrackingPropertiesFB.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSystemBodyTrackingPropertiesFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemBodyTrackingPropertiesFB.NEXT); }
    /** Unsafe version of {@link #supportsBodyTracking}. */
    public static int nsupportsBodyTracking(long struct) { return UNSAFE.getInt(null, struct + XrSystemBodyTrackingPropertiesFB.SUPPORTSBODYTRACKING); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSystemBodyTrackingPropertiesFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemBodyTrackingPropertiesFB.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemBodyTrackingPropertiesFB} structs. */
    public static class Buffer extends StructBuffer<XrSystemBodyTrackingPropertiesFB, Buffer> implements NativeResource {

        private static final XrSystemBodyTrackingPropertiesFB ELEMENT_FACTORY = XrSystemBodyTrackingPropertiesFB.create(-1L);

        /**
         * Creates a new {@code XrSystemBodyTrackingPropertiesFB.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemBodyTrackingPropertiesFB#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected XrSystemBodyTrackingPropertiesFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSystemBodyTrackingPropertiesFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemBodyTrackingPropertiesFB.ntype(address()); }
        /** @return the value of the {@link XrSystemBodyTrackingPropertiesFB#next} field. */
        @NativeType("void *")
        public long next() { return XrSystemBodyTrackingPropertiesFB.nnext(address()); }
        /** @return the value of the {@link XrSystemBodyTrackingPropertiesFB#supportsBodyTracking} field. */
        @NativeType("XrBool32")
        public boolean supportsBodyTracking() { return XrSystemBodyTrackingPropertiesFB.nsupportsBodyTracking(address()) != 0; }

        /** Sets the specified value to the {@link XrSystemBodyTrackingPropertiesFB#type} field. */
        public XrSystemBodyTrackingPropertiesFB.Buffer type(@NativeType("XrStructureType") int value) { XrSystemBodyTrackingPropertiesFB.ntype(address(), value); return this; }
        /** Sets the {@link FBBodyTracking#XR_TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_FB TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_FB} value to the {@link XrSystemBodyTrackingPropertiesFB#type} field. */
        public XrSystemBodyTrackingPropertiesFB.Buffer type$Default() { return type(FBBodyTracking.XR_TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_FB); }
        /** Sets the specified value to the {@link XrSystemBodyTrackingPropertiesFB#next} field. */
        public XrSystemBodyTrackingPropertiesFB.Buffer next(@NativeType("void *") long value) { XrSystemBodyTrackingPropertiesFB.nnext(address(), value); return this; }

    }

}