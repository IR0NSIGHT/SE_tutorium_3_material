Themen der Vorlesung:
VL 04:
- External Qualtiy
- Internal QUality
- Software Metrics/Measure Quality
- Improving software quality
    - manual 
    - dynamic (assertions, tests)
    - static (type system, linter)
- Code Reviews
- Pair Programming
- Coding Conventions
    - Readable Code
    - Naming, Name length
- Documentation
    - external
    - internal
    - self documenting code
    - comments into functions

VL 05 - Refactorings
Technical Debt
Code Smells
Refactoring
    - invisible change
    - what is a context
    - specific refactoring removes specific smell
Finding Smells
- Linters
- Static Analysis
Coding Principles
- DRY (in code and activity)
- Boyscout
- KISS
- Premature Optimization
- You aint gonna need it
- When in Rome do as the Romans do
- Not invented here (and friends)
    => noob detector: we need to rebuild this from scratch

VL 06 - Effects
What are effects
- depends on or modifies the context
Why do we care
How do we control them
- effectful
- pure
    output ONLY depends on input
- referential transparency
- values vs computations
- idempotency
- controlling effects
    - avoid mutable state
        - localize
        - pass dont mutate
    - exceptions
        - responsibility shift
        - pierce through scopes        
        - error vs exception
        - handle strategy
    - I/O
        - Imperative Shell, Functional Core
        - interfaces

- Coding Principles: KISS, DRY
- Code Smells: Null, mutable state

https://github.com/se-tuebingen-exercises-ws23/tut3-ex07/tree/main