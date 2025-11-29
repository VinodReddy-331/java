# Java Program Execution – High Level Diagram

Below is a high-level diagram showing the main stages of Java program execution, from writing code to running bytecode on the Java Virtual Machine (JVM):

                ┌────────────────────────┐
                │      Your Code         │
                │   BasicVariables.java  │
                └───────────┬────────────┘
                            │
                            ▼
                ┌────────────────────────┐
                │     Java Compiler      │
                │        javac           │
                └───────────┬────────────┘
                            │
                            ▼
                ┌────────────────────────┐
                │   Bytecode (.class)    │
                │   BasicVariables.class │
                └───────────┬────────────┘
                            │
                            ▼
            ┌────────────────────────────────────┐
            │            JVM STARTS               │
            └────────────────────────────────────┘
                            │
                            ▼
        ┌────────────────────────────────────────────┐
        │               Class Loaders                │
        │────────────────────────────────────────────│
        │ 1. Bootstrap Loader (core Java classes)    │
        │ 2. Platform Loader                         │
        │ 3. Application Loader (your classes)       │
        └───────────────────┬────────────────────────┘
                             │
                             ▼
               ┌──────────────────────────────┐
               │       Bytecode Verifier      │
               │ - Security checks            │
               │ - Valid structure            │
               └──────────────┬───────────────┘
                              │
                              ▼
        ┌────────────────────────────────────────────┐
        │            JVM Runtime Memory               │
        │────────────────────────────────────────────│
        │  • Method Area: class info, static data     │
        │  • **Heap: objects  (String name = "Vinod")**   │
        │  • Stack: local variables (age, ispass)     │
        │  • PC Register: current instruction         │
        │  • Native Method Stack                      │
        └──────────────────┬─────────────────────────┘
                            │
                            ▼
                ┌─────────────────────────────┐
                │      Execution Engine        │
                │─────────────────────────────│
                │ • Interpreter (executes line by line) │
                │ • JIT Compiler (speeds execution)     │
                │ • Calls System.out.println()          │
                └───────────────────┬───────────────────┘
                                    │
                                    ▼
                     ┌────────────────────────┐
                     │   Console Output       │
                     │ ---------------------- │
                     │ age = 25               │
                     │ name = Vinod           │
                     │ percentage = 80.5      │
                     │ ispass = true          │
                     └────────────────────────┘
                                    │
                                    ▼
                     ┌────────────────────────┐
                     │   Program Finishes     │
                     │ GC cleans heap pending │
                     └────────────────────────┘
