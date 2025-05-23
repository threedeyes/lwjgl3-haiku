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
 * struct VkMemoryMapInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkMemoryMapFlags flags;
 *     VkDeviceMemory memory;
 *     VkDeviceSize offset;
 *     VkDeviceSize size;
 * }}</pre>
 */
public class VkMemoryMapInfo extends Struct<VkMemoryMapInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        MEMORY,
        OFFSET,
        SIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        MEMORY = layout.offsetof(3);
        OFFSET = layout.offsetof(4);
        SIZE = layout.offsetof(5);
    }

    protected VkMemoryMapInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMemoryMapInfo create(long address, @Nullable ByteBuffer container) {
        return new VkMemoryMapInfo(address, container);
    }

    /**
     * Creates a {@code VkMemoryMapInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryMapInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkMemoryMapFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code memory} field. */
    @NativeType("VkDeviceMemory")
    public long memory() { return nmemory(address()); }
    /** @return the value of the {@code offset} field. */
    @NativeType("VkDeviceSize")
    public long offset() { return noffset(address()); }
    /** @return the value of the {@code size} field. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkMemoryMapInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_MEMORY_MAP_INFO STRUCTURE_TYPE_MEMORY_MAP_INFO} value to the {@code sType} field. */
    public VkMemoryMapInfo sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_MEMORY_MAP_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkMemoryMapInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkMemoryMapPlacedInfoEXT} value to the {@code pNext} chain. */
    public VkMemoryMapInfo pNext(VkMemoryMapPlacedInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkMemoryMapInfo flags(@NativeType("VkMemoryMapFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code memory} field. */
    public VkMemoryMapInfo memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }
    /** Sets the specified value to the {@code offset} field. */
    public VkMemoryMapInfo offset(@NativeType("VkDeviceSize") long value) { noffset(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
    public VkMemoryMapInfo size(@NativeType("VkDeviceSize") long value) { nsize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryMapInfo set(
        int sType,
        long pNext,
        int flags,
        long memory,
        long offset,
        long size
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        memory(memory);
        offset(offset);
        size(size);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMemoryMapInfo set(VkMemoryMapInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryMapInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryMapInfo malloc() {
        return new VkMemoryMapInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryMapInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryMapInfo calloc() {
        return new VkMemoryMapInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryMapInfo} instance allocated with {@link BufferUtils}. */
    public static VkMemoryMapInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryMapInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryMapInfo} instance for the specified memory address. */
    public static VkMemoryMapInfo create(long address) {
        return new VkMemoryMapInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkMemoryMapInfo createSafe(long address) {
        return address == NULL ? null : new VkMemoryMapInfo(address, null);
    }

    /**
     * Returns a new {@link VkMemoryMapInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryMapInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryMapInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryMapInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryMapInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryMapInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMemoryMapInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryMapInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkMemoryMapInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkMemoryMapInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryMapInfo malloc(MemoryStack stack) {
        return new VkMemoryMapInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMemoryMapInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryMapInfo calloc(MemoryStack stack) {
        return new VkMemoryMapInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMemoryMapInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryMapInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryMapInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryMapInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkMemoryMapInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryMapInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkMemoryMapInfo.FLAGS); }
    /** Unsafe version of {@link #memory}. */
    public static long nmemory(long struct) { return memGetLong(struct + VkMemoryMapInfo.MEMORY); }
    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return memGetLong(struct + VkMemoryMapInfo.OFFSET); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetLong(struct + VkMemoryMapInfo.SIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkMemoryMapInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryMapInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkMemoryMapInfo.FLAGS, value); }
    /** Unsafe version of {@link #memory(long) memory}. */
    public static void nmemory(long struct, long value) { memPutLong(struct + VkMemoryMapInfo.MEMORY, value); }
    /** Unsafe version of {@link #offset(long) offset}. */
    public static void noffset(long struct, long value) { memPutLong(struct + VkMemoryMapInfo.OFFSET, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { memPutLong(struct + VkMemoryMapInfo.SIZE, value); }

    // -----------------------------------

    /** An array of {@link VkMemoryMapInfo} structs. */
    public static class Buffer extends StructBuffer<VkMemoryMapInfo, Buffer> implements NativeResource {

        private static final VkMemoryMapInfo ELEMENT_FACTORY = VkMemoryMapInfo.create(-1L);

        /**
         * Creates a new {@code VkMemoryMapInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryMapInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMemoryMapInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryMapInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMemoryMapInfo.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkMemoryMapFlags")
        public int flags() { return VkMemoryMapInfo.nflags(address()); }
        /** @return the value of the {@code memory} field. */
        @NativeType("VkDeviceMemory")
        public long memory() { return VkMemoryMapInfo.nmemory(address()); }
        /** @return the value of the {@code offset} field. */
        @NativeType("VkDeviceSize")
        public long offset() { return VkMemoryMapInfo.noffset(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkMemoryMapInfo.nsize(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkMemoryMapInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryMapInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_MEMORY_MAP_INFO STRUCTURE_TYPE_MEMORY_MAP_INFO} value to the {@code sType} field. */
        public VkMemoryMapInfo.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_MEMORY_MAP_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkMemoryMapInfo.Buffer pNext(@NativeType("void const *") long value) { VkMemoryMapInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkMemoryMapPlacedInfoEXT} value to the {@code pNext} chain. */
        public VkMemoryMapInfo.Buffer pNext(VkMemoryMapPlacedInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkMemoryMapInfo.Buffer flags(@NativeType("VkMemoryMapFlags") int value) { VkMemoryMapInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code memory} field. */
        public VkMemoryMapInfo.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkMemoryMapInfo.nmemory(address(), value); return this; }
        /** Sets the specified value to the {@code offset} field. */
        public VkMemoryMapInfo.Buffer offset(@NativeType("VkDeviceSize") long value) { VkMemoryMapInfo.noffset(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        public VkMemoryMapInfo.Buffer size(@NativeType("VkDeviceSize") long value) { VkMemoryMapInfo.nsize(address(), value); return this; }

    }

}