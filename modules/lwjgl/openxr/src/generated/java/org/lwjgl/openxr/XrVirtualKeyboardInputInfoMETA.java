/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrVirtualKeyboardInputInfoMETA {
 *     XrStructureType type;
 *     void const * next;
 *     XrVirtualKeyboardInputSourceMETA inputSource;
 *     XrSpace inputSpace;
 *     {@link XrPosef XrPosef} inputPoseInSpace;
 *     XrVirtualKeyboardInputStateFlagsMETA inputState;
 * }}</pre>
 */
public class XrVirtualKeyboardInputInfoMETA extends Struct<XrVirtualKeyboardInputInfoMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        INPUTSOURCE,
        INPUTSPACE,
        INPUTPOSEINSPACE,
        INPUTSTATE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        INPUTSOURCE = layout.offsetof(2);
        INPUTSPACE = layout.offsetof(3);
        INPUTPOSEINSPACE = layout.offsetof(4);
        INPUTSTATE = layout.offsetof(5);
    }

    protected XrVirtualKeyboardInputInfoMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrVirtualKeyboardInputInfoMETA create(long address, @Nullable ByteBuffer container) {
        return new XrVirtualKeyboardInputInfoMETA(address, container);
    }

    /**
     * Creates a {@code XrVirtualKeyboardInputInfoMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrVirtualKeyboardInputInfoMETA(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code inputSource} field. */
    @NativeType("XrVirtualKeyboardInputSourceMETA")
    public int inputSource() { return ninputSource(address()); }
    /** @return the value of the {@code inputSpace} field. */
    @NativeType("XrSpace")
    public @Nullable long inputSpace() { return ninputSpace(address()); }
    /** @return a {@link XrPosef} view of the {@code inputPoseInSpace} field. */
    public XrPosef inputPoseInSpace() { return ninputPoseInSpace(address()); }
    /** @return the value of the {@code inputState} field. */
    @NativeType("XrVirtualKeyboardInputStateFlagsMETA")
    public long inputState() { return ninputState(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrVirtualKeyboardInputInfoMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAVirtualKeyboard#XR_TYPE_VIRTUAL_KEYBOARD_INPUT_INFO_META TYPE_VIRTUAL_KEYBOARD_INPUT_INFO_META} value to the {@code type} field. */
    public XrVirtualKeyboardInputInfoMETA type$Default() { return type(METAVirtualKeyboard.XR_TYPE_VIRTUAL_KEYBOARD_INPUT_INFO_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrVirtualKeyboardInputInfoMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code inputSource} field. */
    public XrVirtualKeyboardInputInfoMETA inputSource(@NativeType("XrVirtualKeyboardInputSourceMETA") int value) { ninputSource(address(), value); return this; }
    /** Sets the specified value to the {@code inputSpace} field. */
    public XrVirtualKeyboardInputInfoMETA inputSpace(@Nullable XrSpace value) { ninputSpace(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@code inputPoseInSpace} field. */
    public XrVirtualKeyboardInputInfoMETA inputPoseInSpace(XrPosef value) { ninputPoseInSpace(address(), value); return this; }
    /** Passes the {@code inputPoseInSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrVirtualKeyboardInputInfoMETA inputPoseInSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(inputPoseInSpace()); return this; }
    /** Sets the specified value to the {@code inputState} field. */
    public XrVirtualKeyboardInputInfoMETA inputState(@NativeType("XrVirtualKeyboardInputStateFlagsMETA") long value) { ninputState(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrVirtualKeyboardInputInfoMETA set(
        int type,
        long next,
        int inputSource,
        XrSpace inputSpace,
        XrPosef inputPoseInSpace,
        long inputState
    ) {
        type(type);
        next(next);
        inputSource(inputSource);
        inputSpace(inputSpace);
        inputPoseInSpace(inputPoseInSpace);
        inputState(inputState);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrVirtualKeyboardInputInfoMETA set(XrVirtualKeyboardInputInfoMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrVirtualKeyboardInputInfoMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrVirtualKeyboardInputInfoMETA malloc() {
        return new XrVirtualKeyboardInputInfoMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrVirtualKeyboardInputInfoMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrVirtualKeyboardInputInfoMETA calloc() {
        return new XrVirtualKeyboardInputInfoMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrVirtualKeyboardInputInfoMETA} instance allocated with {@link BufferUtils}. */
    public static XrVirtualKeyboardInputInfoMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrVirtualKeyboardInputInfoMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrVirtualKeyboardInputInfoMETA} instance for the specified memory address. */
    public static XrVirtualKeyboardInputInfoMETA create(long address) {
        return new XrVirtualKeyboardInputInfoMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrVirtualKeyboardInputInfoMETA createSafe(long address) {
        return address == NULL ? null : new XrVirtualKeyboardInputInfoMETA(address, null);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardInputInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardInputInfoMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardInputInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardInputInfoMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardInputInfoMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardInputInfoMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrVirtualKeyboardInputInfoMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardInputInfoMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrVirtualKeyboardInputInfoMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrVirtualKeyboardInputInfoMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVirtualKeyboardInputInfoMETA malloc(MemoryStack stack) {
        return new XrVirtualKeyboardInputInfoMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrVirtualKeyboardInputInfoMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVirtualKeyboardInputInfoMETA calloc(MemoryStack stack) {
        return new XrVirtualKeyboardInputInfoMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardInputInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardInputInfoMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardInputInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardInputInfoMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrVirtualKeyboardInputInfoMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrVirtualKeyboardInputInfoMETA.NEXT); }
    /** Unsafe version of {@link #inputSource}. */
    public static int ninputSource(long struct) { return memGetInt(struct + XrVirtualKeyboardInputInfoMETA.INPUTSOURCE); }
    /** Unsafe version of {@link #inputSpace}. */
    public static long ninputSpace(long struct) { return memGetAddress(struct + XrVirtualKeyboardInputInfoMETA.INPUTSPACE); }
    /** Unsafe version of {@link #inputPoseInSpace}. */
    public static XrPosef ninputPoseInSpace(long struct) { return XrPosef.create(struct + XrVirtualKeyboardInputInfoMETA.INPUTPOSEINSPACE); }
    /** Unsafe version of {@link #inputState}. */
    public static long ninputState(long struct) { return memGetLong(struct + XrVirtualKeyboardInputInfoMETA.INPUTSTATE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrVirtualKeyboardInputInfoMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrVirtualKeyboardInputInfoMETA.NEXT, value); }
    /** Unsafe version of {@link #inputSource(int) inputSource}. */
    public static void ninputSource(long struct, int value) { memPutInt(struct + XrVirtualKeyboardInputInfoMETA.INPUTSOURCE, value); }
    /** Unsafe version of {@link #inputSpace(XrSpace) inputSpace}. */
    public static void ninputSpace(long struct, @Nullable XrSpace value) { memPutAddress(struct + XrVirtualKeyboardInputInfoMETA.INPUTSPACE, memAddressSafe(value)); }
    /** Unsafe version of {@link #inputPoseInSpace(XrPosef) inputPoseInSpace}. */
    public static void ninputPoseInSpace(long struct, XrPosef value) { memCopy(value.address(), struct + XrVirtualKeyboardInputInfoMETA.INPUTPOSEINSPACE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #inputState(long) inputState}. */
    public static void ninputState(long struct, long value) { memPutLong(struct + XrVirtualKeyboardInputInfoMETA.INPUTSTATE, value); }

    // -----------------------------------

    /** An array of {@link XrVirtualKeyboardInputInfoMETA} structs. */
    public static class Buffer extends StructBuffer<XrVirtualKeyboardInputInfoMETA, Buffer> implements NativeResource {

        private static final XrVirtualKeyboardInputInfoMETA ELEMENT_FACTORY = XrVirtualKeyboardInputInfoMETA.create(-1L);

        /**
         * Creates a new {@code XrVirtualKeyboardInputInfoMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrVirtualKeyboardInputInfoMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected XrVirtualKeyboardInputInfoMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrVirtualKeyboardInputInfoMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrVirtualKeyboardInputInfoMETA.nnext(address()); }
        /** @return the value of the {@code inputSource} field. */
        @NativeType("XrVirtualKeyboardInputSourceMETA")
        public int inputSource() { return XrVirtualKeyboardInputInfoMETA.ninputSource(address()); }
        /** @return the value of the {@code inputSpace} field. */
        @NativeType("XrSpace")
        public @Nullable long inputSpace() { return XrVirtualKeyboardInputInfoMETA.ninputSpace(address()); }
        /** @return a {@link XrPosef} view of the {@code inputPoseInSpace} field. */
        public XrPosef inputPoseInSpace() { return XrVirtualKeyboardInputInfoMETA.ninputPoseInSpace(address()); }
        /** @return the value of the {@code inputState} field. */
        @NativeType("XrVirtualKeyboardInputStateFlagsMETA")
        public long inputState() { return XrVirtualKeyboardInputInfoMETA.ninputState(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrVirtualKeyboardInputInfoMETA.Buffer type(@NativeType("XrStructureType") int value) { XrVirtualKeyboardInputInfoMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAVirtualKeyboard#XR_TYPE_VIRTUAL_KEYBOARD_INPUT_INFO_META TYPE_VIRTUAL_KEYBOARD_INPUT_INFO_META} value to the {@code type} field. */
        public XrVirtualKeyboardInputInfoMETA.Buffer type$Default() { return type(METAVirtualKeyboard.XR_TYPE_VIRTUAL_KEYBOARD_INPUT_INFO_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrVirtualKeyboardInputInfoMETA.Buffer next(@NativeType("void const *") long value) { XrVirtualKeyboardInputInfoMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code inputSource} field. */
        public XrVirtualKeyboardInputInfoMETA.Buffer inputSource(@NativeType("XrVirtualKeyboardInputSourceMETA") int value) { XrVirtualKeyboardInputInfoMETA.ninputSource(address(), value); return this; }
        /** Sets the specified value to the {@code inputSpace} field. */
        public XrVirtualKeyboardInputInfoMETA.Buffer inputSpace(@Nullable XrSpace value) { XrVirtualKeyboardInputInfoMETA.ninputSpace(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@code inputPoseInSpace} field. */
        public XrVirtualKeyboardInputInfoMETA.Buffer inputPoseInSpace(XrPosef value) { XrVirtualKeyboardInputInfoMETA.ninputPoseInSpace(address(), value); return this; }
        /** Passes the {@code inputPoseInSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrVirtualKeyboardInputInfoMETA.Buffer inputPoseInSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(inputPoseInSpace()); return this; }
        /** Sets the specified value to the {@code inputState} field. */
        public XrVirtualKeyboardInputInfoMETA.Buffer inputState(@NativeType("XrVirtualKeyboardInputStateFlagsMETA") long value) { XrVirtualKeyboardInputInfoMETA.ninputState(address(), value); return this; }

    }

}