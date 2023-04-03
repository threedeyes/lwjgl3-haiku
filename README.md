## LWJGL - Lightweight Java Game Library 3 for Haiku (https://haiku-os.org)

LWJGL (https://www.lwjgl.org) is a Java library that enables cross-platform
access to popular native APIs useful in the development of graphics
(OpenGL/Vulkan), audio (OpenAL) and parallel computing (OpenCL) applications.
This access is direct and high-performance, yet also wrapped in a type-safe
and user-friendly layer, appropriate for the Java ecosystem.

LWJGL is an enabling technology and provides low-level access. It is not a
framework and does not provide higher-level utilities than what the native
libraries expose. As such, novice programmers are encouraged to try one of
the frameworks or game engines that make use of LWJGL, before working
directly with the library.

## Build for Haiku x86_64 architecture:

* pkgman install ant_core openjdk8_jre openjdk17 openjdk17_jre openjdk17_default assimp_devel freetype_devel glfw_devel harfbuzz_devel openal_devel opus_devel
* export JAVA8_HOME=$JRE8_HOME
* LWJGL_BUILD_TYPE=release LWJGL_BUILD_ARCH=x64 LWJGL_BUILD_OFFLINE=no ant init -Djavadoc.skip=true
* LWJGL_BUILD_TYPE=release LWJGL_BUILD_ARCH=x64 LWJGL_BUILD_OFFLINE=yes ant compile-templates release -Djavadoc.skip=true
* LWJGL_BUILD_TYPE=release LWJGL_BUILD_ARCH=x64 LWJGL_BUILD_OFFLINE=yes ant compile release -Djavadoc.skip=true
* LWJGL_BUILD_TYPE=release LWJGL_BUILD_ARCH=x64 LWJGL_BUILD_OFFLINE=yes ant compile-native release -Djavadoc.skip=true
