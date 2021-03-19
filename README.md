# ![java](https://openjdk.java.net/images/duke-thinking.png) Java Features ![java](https://openjdk.java.net/images/duke-thinking.png)
## `Soumen Karmakar`
#### JDK 8 (LTS)
-----------------
* language-level support for lambda expressions and default methods (virtual extension methods) which allow the addition of methods to interfaces without breaking existing implementations.
* Project Nashorn, a JavaScript runtime which allows developers to embed JavaScript code within applications
* Annotation on Java types
* Unsigned integer arithmetic
* Repeating annotations
* Date and time API
* Statically-linked JNI libraries
* Launch JavaFX applications (direct launching of JavaFX application JARs)
* Remove the permanent generation
#### JDK 9
-----------------
* Modularization of the JDK under Project Jigsaw (Java Platform Module System)
* Ahead-of-time compilation
* Interface private methods
* Compact Strings Improvement
* JShell
* Stream of Dates
* Stream API Improvements
    * Limiting Stream with `takeWhile()` and `dropWhile()` methods
    * Overloaded Stream iterate method
    * New Stream `ofNullable()` method
* Immutable Collections with Factory Methods
#### JDK 10
-----------------
* Local Variable Type Inference
* Time-Based Release Versioning
* Garbage-Collector Interface
* Parallel Full GC for G1
* Heap Allocation on Alternative Memory Devices
* Consolidate the JDK Forest into a Single Repository
* Application Class-Data Sharing
* Additional Unicode Language-Tag Extensions
* Root Certificates
* Experimental Java-Based JIT Compiler
* Thread-Local Handshakes
* Remove the Native-Header Generation Tool
#### JDK 11 (LTS)
-----------------
* HTTP Client API
* Launch Single-File Programs Without Compilation
* String API Changes
    * `String.repeat(Integer)`
    * `String.isBlank()`
    * `String.strip()`
    * `String.lines()`
* `Collection.toArray(IntFunction)`
* `Files.readString()` and `Files.writeString()`
* `Optional.isEmpty()`
#### JDK 12
-----------------
* Collectors.teeing() in Stream API
* String API Changes
    * `String.indent()`
    * `String.transform()`
    * `String constants`
* `Files.mismatch(Path, Path)`
* Compact Number Formatting
* Support for Unicode 11
* Switch Expressions (Preview)
#### JDK 13
-----------------
* Enhancements for Switch Expressions
* Text Blocks instead of Raw String Literals
* Under the hood :
    * Dynamic CDS Archives
    * ZGC returns unused storage
    * Renewed Socket APIs
#### JDK 14
-----------------
* Pattern Matching for instanceof
* Non-Volatile Mapped Byte Buffers
* Helpful NullPointerExceptions
* Packaging Tool - jpackage
* NUMA-Aware Memory Allocation for G1
* JFR Event Streaming
* Records (Preview)
* Deprecate the Solaris and SPARC Ports
* Build-configuration changes
* Remove the Concurrent Mark Sweep (CMS) Garbage Collector
* JEP 368: Text Blocks (Second Preview)
* JEP 370: Foreign-Memory Access API (Incubator)
#### JDK 15
-----------------
* **JEP 339:** Edwards-Curve Digital Signature Algorithm (EdDSA)
* **JEP 360:** Sealed Classes (Preview)
* **JEP 371:** Hidden Classes
* **JEP 372:** Remove the Nashorn JavaScript Engine
* **JEP 374:** Disable and Deprecate Biased Locking
* **JEP 375:** Pattern Matching for instanceof (Second Preview)
* **JEP 377:** ZGC: A Scalable Low-Latency Garbage Collector
* **JEP 378:** Text Blocks
* **JEP 379:** Shenandoah: A Low-Pause-Time Garbage Collector
* **JEP 381:** Remove the Solaris and SPARC Ports
* **JEP 383:** Foreign-Memory Access API (Second Incubator)
* **JEP 384:** Records (Second Preview)
* **JEP 385:** Deprecate RMI Activation for Removal
#### JDK 16
-------------
* **JEP 338:** Vector API (Incubator)
  * `jdk.incubator.vector`, that provides vector computation (i.e. SIMD) supported by hardware instructions when available (e.g. SSE, AVX) and providing a “graceful degradation” to software implementation when SIMD hardware support is not available
* **JEP 376:** _ZGC_: Concurrent Thread-Stack Processing
* **JEP 380:** Unix-Domain Socket Channels
  * UNIX-domain sockets (_AF_UNIX_) through `java.net.UnixDomainSocketAddress`.
* **JEP 386:** Alpine Linux Port
* **JEP 387:** Elastic Metaspace
* **JEP 388:** Windows/AArch64 Port
* **JEP 389:** Foreign Linker API (Incubator)
  * This API will offer a pure-Java way to access native code, replacing JNI.
* **JEP 390:** Warnings for Value-Based Classes
  * Primitive wrapper classes, that are annotated as `@jdk.internal.ValueBased`, will have their constructors which are already marked as deprecated in Java 9, will produce removal warnings
* **JEP 392:** Packaging Tool
  * jpackage becomes a standard feature
* **JEP 393:** Foreign-Memory Access API (Third Incubator)
* **JEP 394:** Pattern Matching for instanceof
* **JEP 395:** Records
* **JEP 396:** Strongly Encapsulate JDK Internals by Default
* **JEP 397:** Sealed Classes (Second Preview)
