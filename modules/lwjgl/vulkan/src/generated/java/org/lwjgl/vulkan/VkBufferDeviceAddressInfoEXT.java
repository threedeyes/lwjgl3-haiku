/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkBufferDeviceAddressInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBuffer buffer;
 * }}</pre>
 */
public class VkBufferDeviceAddressInfoEXT extends VkBufferDeviceAddressInfo {

    protected VkBufferDeviceAddressInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkBufferDeviceAddressInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkBufferDeviceAddressInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkBufferDeviceAddressInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBufferDeviceAddressInfoEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkBufferDeviceAddressInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO} value to the {@code sType} field. */
    @Override
    public VkBufferDeviceAddressInfoEXT sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkBufferDeviceAddressInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code buffer} field. */
    @Override
    public VkBufferDeviceAddressInfoEXT buffer(@NativeType("VkBuffer") long value) { nbuffer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkBufferDeviceAddressInfoEXT set(
        int sType,
        long pNext,
        long buffer
    ) {
        sType(sType);
        pNext(pNext);
        buffer(buffer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBufferDeviceAddressInfoEXT set(VkBufferDeviceAddressInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBufferDeviceAddressInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBufferDeviceAddressInfoEXT malloc() {
        return new VkBufferDeviceAddressInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkBufferDeviceAddressInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBufferDeviceAddressInfoEXT calloc() {
        return new VkBufferDeviceAddressInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkBufferDeviceAddressInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkBufferDeviceAddressInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBufferDeviceAddressInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkBufferDeviceAddressInfoEXT} instance for the specified memory address. */
    public static VkBufferDeviceAddressInfoEXT create(long address) {
        return new VkBufferDeviceAddressInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkBufferDeviceAddressInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkBufferDeviceAddressInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkBufferDeviceAddressInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferDeviceAddressInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBufferDeviceAddressInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferDeviceAddressInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferDeviceAddressInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferDeviceAddressInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkBufferDeviceAddressInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBufferDeviceAddressInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkBufferDeviceAddressInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBufferDeviceAddressInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBufferDeviceAddressInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBufferDeviceAddressInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBufferDeviceAddressInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBufferDeviceAddressInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBufferDeviceAddressInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBufferDeviceAddressInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBufferDeviceAddressInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkBufferDeviceAddressInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferDeviceAddressInfoEXT malloc(MemoryStack stack) {
        return new VkBufferDeviceAddressInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkBufferDeviceAddressInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferDeviceAddressInfoEXT calloc(MemoryStack stack) {
        return new VkBufferDeviceAddressInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkBufferDeviceAddressInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferDeviceAddressInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferDeviceAddressInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferDeviceAddressInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkBufferDeviceAddressInfoEXT} structs. */
    public static class Buffer extends VkBufferDeviceAddressInfo.Buffer {

        private static final VkBufferDeviceAddressInfoEXT ELEMENT_FACTORY = VkBufferDeviceAddressInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkBufferDeviceAddressInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBufferDeviceAddressInfoEXT#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container);
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
        protected VkBufferDeviceAddressInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkBufferDeviceAddressInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkBufferDeviceAddressInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO} value to the {@code sType} field. */
        @Override
        public VkBufferDeviceAddressInfoEXT.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkBufferDeviceAddressInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkBufferDeviceAddressInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code buffer} field. */
        @Override
        public VkBufferDeviceAddressInfoEXT.Buffer buffer(@NativeType("VkBuffer") long value) { VkBufferDeviceAddressInfoEXT.nbuffer(address(), value); return this; }

    }

}