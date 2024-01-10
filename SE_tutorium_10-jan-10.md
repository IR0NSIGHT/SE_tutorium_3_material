https://github.com/se-tuebingen-exercises-ws23/tut-03-ex-10


https://se.cs.uni-tuebingen.de/teaching/ws23/se/skript/design-by-contract/subtyping.html

Keywords:
- Subtype
- Supertype
- stronger guarantees
- weaker guarantees
- transitive subtype
- reflektive subtype
- schwächste precondition bestimmen
- stärkste postcondition bestimmen
- deklarative
- mengentheoretisch
- Operator S <: T
- Varianz
- funktionstypen A->B <: C->D ?
    - subtyp darf nachbedingungen verstärken
    - subtyp darf vorbedinungen abschwächen
- covarianz
"+"
    postcondition ist covariat: substyp darf restriktiver sein
- contravarianz
"-"
    precondition ist contravariant: subtype darf NICHT restriktiver sein
- doppel kontravarianz
    (A->B)->C
    ziehe kontravarainz von (A->B) in klammer
    flippt die varianzen von A und B:
    A ist covariant
    B ist contravariant
- varianz von objekten
    Array[A] <: Array[B] <=> ???
    => arrays sind invariant in A
    (in java sind arrays kovariant mit exceptions)

"Ein subtyp muss all das können/erlauben was der supertyp auch erlaubt"
