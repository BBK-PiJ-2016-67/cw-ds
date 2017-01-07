# PiJ Coursework Two

## Compile & Test

```
./run.sh
```

The aims of this coursework are to gain practice with:
- working against an interface; and
- dynamic data structures by implementing some of their most commonly used methods; and
- array, linked lists, and stacks by writing examples of higher level methods

No custom interfaces, don't change interfaces. Follow the convention IntefaceImpl except when noted otherwise.

No complex types except boxed type, String, array, self-defined. No generics.

In order to complete the coursework, you have to:

- write an implementation of interface FunctionalList that extends ArrayList called FunctionalArrayList
- write an implementation of interface FunctionalList that extens LinkedList called FunctionalLinkedList

- write an implementation of interface SampleableList
- write a class StackImpl that extends class AbstractStack
- write an implementation of interface ImprovedStack. This class cannot extend either AbstractStack or StackImpl

- add comments and stuff
- reread all interfaces
- add more tests
- rerun all tests

1. Constructors

No constructors except below:

StackImpl: This class must have only one constructor with only one parameter of type List (i.e. a stack can be created using either an ArrayList or a LinkedList as the underlying data structure).

ImprovedStackImpl: This class must have only one constructor with only on parameter of type List.

2. Exceptions

Don't throw errors.

3. A couple of clarifications regarding lists

Method add(Object,int) adds an element to the list, inserting it at the given position. If the index is negative or greater or equal than the size of the list, an error must be returned. Note that this means that a new element cannot be added at the end of the list with this method (instead, add(Object) can be used for that).

Implementations of interfaceList do not have to sort the elements added to them based on any natural ordering (e.g. 1 < 2, 'a' < 'b', etc). Elements of a list are sorted by index, and for this assignment they must be sorted by index only. In other words, if strings 'Mark', 'Luke', and 'John' are added to a list in that order, then get(2) must return a ReturnObject such that getReturnValue() will return the string 'John' regardless of the fact that 'J' comes before 'M'.