# VL 07 Modularity
- Rückblick Imperative Shell/Functional Core

## Software Design
- one problem usually has infinite amount of possible solutions => infinite possible implementations

Quality Measures:
- Extensibility, maintainability, understandability, readability, reusability
- robustness to change
- low coupling/high cohesion
=> Modularity

Definition of modular system:
- composed of smaller components
- components are self contained
- components are connected by small and precise interfaces

## Components
- can be anything 
- usually function or class

## Interfaces
- abstraction barrier
- user cant see how logic is implemented behind the interface
- user only uses what the interfaces offers him
- interface != java interface keyword!
### Advantages:
- decouple usage from implementation
- one interface can be implemented by many implemaentations
=> allows changing out implementation 
=> allows using different implementations depending on use case

Components have interfaces
- comp. use interfaces to communicate with other components
- can have list of required interfaces (services) it needs to function
- list of interfaces the component implements: provides

## Motivation to modularize
- Modular systems are easier to understand
- easier to add new featuers to module, without affecting other modules
- if component is self contained, i can work inside the component (fixing bugs => maintenance) without affecting other modules

## 5 Criteria
- Modular Decomposability
    decompose a problem into less complex subproblems, that are connected by simple structure
    subproblems are independent enough to work on them alone

- Modular Composablity
    results in elements that can be freely combined with each other to produce new systems

    directly connected to reusability
    f.e.: libraries

- Modular Understandability
    a human can understand a module wihtout having to know every other module in the program

    side effects/mutable state break understandability

- Modular Continuity
    small change in the problem will trigger only small change in a single module

    => hardcoding values breaks continuity

- Modular Protection
    abnormal conditions cant leave the modules they appear in
    exceptions are handled locally

## 5 rules of modularity
1. Direct Mapping
    technical solution structure is similar to the structure of the problem
    
2. Few Dependencies
    have as few dependencies to other modules as possible

3. Small interfaces
    exchange as little information as possible between two modules
    => exchanged info causes dependencies

4. explicit interfaces
    communication between modules is only allowed through interfaces

5. Information hiding
    official information used by client is 
    just tip of iceberg

###################
- What is a module
- What is an interface
- What is an API

https://github.com/se-tuebingen-exercises-ws23/tut-03-termin-08





