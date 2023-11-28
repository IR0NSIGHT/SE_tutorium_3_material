# Exercise #06 - Refactoring

## Lernziele
1. Scala in Intellij entwickeln und debuggen können
2. Testbaren Scala Code produzieren können
3. Grundlagen Coding Principles
4. Grundlagen Refactoring
5. Task für Hausaufgabe 5 verstanden haben

<details>
Funny things of HWK2

Tested and reviewed locally.

Throughout the code you have changed formatting by creating a space between
the curly brackets and else-if statements. Please revert these changes.
Main.java Line 242: Please do not use capital letters for variables.

Game runs without any issues and as the issue described it, so if you fix above mentioned issues, I can approve.


features should have an acceptance criteria:
a clear and deterministic list of things that must be completed when the feature is done:
- room 2 has "evil monster" npc in it, that can be fought and drops 2 gold coins
- when player uses "rizz", trader NPC lowers price by 20% once

=> reviewer should have a checklist to see if the feature has all 


demonstrate your new features.
give a very precise list on what to do, to see the new feature:
go to room 2 (library), use FIGHT to fight snake
your feature is pointless, if the customer cant see it.


bitte vermeidet anonyme class instanzen.
macht eine eigene, explizite klasse "Sword" mit eigener datei etc.
Mit deiner Implementation von Sword kann man es nur am name erkennen, nicht an der klasse (schlecht)
wiederverwenden kann man es auch nicht.

"item.getName().equalsIgnoreCase("SWORD")"
böse böse böse
das sollte "item instanceOf sword" sein


use randomness = bad, cant control for debugging/testing.
use seeded randomness = good, controllable.


hört auf in hausaufgaben zu denken.
euer feature sollte als standalone funktionieren, und nicht nur halbfertig sein, weil ihr auf irgend ein anderes wartet.

</details>

## Homework questions

https://www.mentimeter.com/app/presentation/aldhz1wzgjqoo5wuiir8r4w4j5wcv49c/qdzc2nwbaqa5/edit

## Scala is pain, Scala is life => life is pain
1. Projekt öffnen
2. Projekt einstellen
3. Projekt laufen lassen
4. Projekt debuggen/steppen

## How to entwickeln Dinge (like a pro)
1. Debuggen: 
    - Welchen Zustand hat mein Programm?
    - Welchen Wert hat meine Variable
2. Testen
    - println ist kein Test
    - assert
    - Zustand testen in isolierten Tests
    - Tests sind Grundlage für Refactorings

#### What you already know from the lecture:

1. What is a refactoring? Can you provide the exact definition?
2. Do you have an example of a refactoring?
3. What is a code smell? How do we fix it?
4. Do you have an example of a code smell?

---

## 1. Coding Principles

**Goal:** Learn about coding principles.

- KISS
- DRY

Go through the "Coding Principles" section of the [slides from the latest lecture](https://ps-forum.cs.uni-tuebingen.de/t/vorlesung-5-refactorings-online/4440) and discuss the contents.

## 2. Context

**Goal:** Know what a _context_ is, can construct a context that distinguishes two different terms.

For each subtask, construct a context that can distinguish the pair of terms:

#### a)
```scala
x += 1
//-----
x = 1
```
 
#### b)
```scala
var result = 0
numbers.forEach { number =>
  result += number
}
return result
```

```scala
// reduceLeft is called foldl in ISL
return numbers.reduceLeft((a, b) => a + b)
```

#### c)
```scala
foo() + foo()
```

```scala
val result = foo()
result + result
```

#### d)
```scala
var flag = true

// some more code
if (flag) { f() }
if (flag) { g() }
```

```scala
var flag = true

// some more code
if (flag) { f() }
else { g() }
```

#### e)
```scala
class Person {
  // ...
  def sayHello() = {
    return "Hello!"
  }
}
```

```scala
class Person { ... }
def sayHello(p: Person) = {
  return "Hello!"
}
```

_How is this relevant to refactoring?_

## 3. Refactor together

**Goal:** Recognize and fix code smells.

In [`smelly_smell.scala`](./tut_06_exercise/smelly_smell.scala), you can find a small example of smelly code in Scala which was used last year in the makeup exam (_Nachklausur_).

These were the tasks, all done on paper:
1. Identify at least three code smells in the code and mark them.
2. For each code smell, describe why that particular code smell can be problematic.
3. Sketch a refactoring the code that eliminates the code smells you identified.
4. Using the concepts from the lecture, explain why the newly refactored version is better than the original.


## 4. Refactor on your own / in pairs

**Goal:** Recognize and fix code smells on your own.

These are a few homework-like exercises with very small steps similar to the ones in the upcoming Homework 6.
The individual steps provided are very small, but please try to adhere to them.
In the exam, you will be expected to identify smells and refactor them on your own.

- [`./tut1`](./tut1) -- Task 1: Process People
- [`./tut2`](./tut2) -- Task 2: People and Car
- [`./tut3`](./tut3) -- Task 3: Greet
- [`./tut4`](./tut4) -- Task 4: Maximum


## HW5-related questions:
    - What is an "argument-parsing library"?
    - Go through [the forum post which describes the interaction](https://ps-forum.cs.uni-tuebingen.de/t/hausaufgabe-5-best-practices-documentation/4430/2?u=jiribenes)
    - How should you split up the work into smaller, runnable pieces?
    - **Hint:** Look at the interaction steps again, can you test them individually?

## Füllt das Kurs feedback aus!