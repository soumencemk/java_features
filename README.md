# ![java](https://openjdk.java.net/images/duke-thinking.png) Java Features ![java](https://openjdk.java.net/images/duke-thinking.png)
__Soumen Karmakar__
#### JDK 8 (LTS)
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
* Enhancements for Switch Expressions
* Text Blocks instead of Raw String Literals
* Under the hood : 
    * Dynamic CDS Archives
    * ZGC returns unused storage
    * Renewed Socket APIs
#### JDK 14
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
* JEP 371: Hidden Classes
* JEP 372: Remove the Nashorn JavaScript Engine
* JEP 377: ZGC: A Scalable Low-Latency Garbage Collector (Production)
* JEP 378: Text Blocks(Standard)
* JEP 379: Shenandoah: A Low-Pause-Time Garbage Collector (Production)