The aims of this coursework are to gain practice with:
- working against an interface; and
- dynamic data structures by implementing some of their most commonly used methods; and
- array, linked lists, and stacks by writing examples of higher level methods

Github repo must be named 'cw-ds'.

All interfaces referred to in this document are provided. Every class that implements an interface must follow the convention IntefaceImpl except when noted otherwise in the text. For example, the implementation of interface ReturnObject must be called ReturnObjectImpl. Do not make any change to the provided Java files: they will be overwritten when the coursework is graded anyway.

You must not use any complex type to provide a solution to this coursework with the following exceptions: boxed type, Strings, arrays, and any other complex type that you define yourself are allowed. You cannot use third-party libraries either, or any class from the Java library with the exceptions noted above. Do not use generics either, you do not need them.

In order to complete the coursework, you have to:

- write a class that implements interface ReturnObject
- write an implementation of interface List based on arrays called ArrayList
- write an implementation of interface List based on pointers called LinkedList
- write an implementation of interface FunctionalList that extends ArrayList called FunctionalArrayList
- write an implementation of interface FunctionalList that extens LinkedList called FunctionalLinkedList
- write an implementation of interface SampleableList
- write a class StackImpl that extends class AbstractStack
- write an implementation of interface ImprovedStack. This class cannot extend either AbstractStack or StackImpl

We will clone your github repo at the due date and time.

Following several questions from students, the following points clarify several aspects that were undefined or unclear in the assignment's description.

1. Constructors

Some students have asked about the constructors of the classes that will implement the interfaces provided. Several different possiblities are available.

In order to clarify this point, to provide a common learning experience, and to facilitate automatic evaluation of the code, this document specifies the constructor(s) required for each class.

Most classes must have only the default constructor, with no arguments. The exceptions are described below. Classes may not have any constructor not descibred in this document - be careful aout this because using the wrong constructor may result in your code not compiling with the automatic tests used for grading.

ReturnObjectImpl: This class must have two constructors, each of them with only one parameter. The constructor used for succesful operations must receive an Object and the constructor used for failed operations must receive an ErrorMessage as its only parameter.

StackImpl: This class must have only one constructor with only one parameter of type List (i.e. a stack can be created using either an ArrayList or a LinkedList as the underlying data structure).

ImprovedStackImpl: This class must have only one constructor with only on parameter of type List.

2. Exceptions

The code must work without throwing any exceptions in any circumstance (e.g. including NullPointerException, etc).

As we have not covered exception handling yet, the code must not use the keywords throw, throw, try, catch, or finally. (If you do not know what these keywords are, that is perfectly normal; we will learn about them in due time).

3. A couple of clarifications regarding lists

Method add(Object,int) adds an element to the list, inserting it at the given position. If the index is negative or greater or equal than the size of the list, an error must be returned. Note that this means that a new element cannot be added at the end of the list with this method (instead, add(Object) can be used for that).

Implementations of interfaceList do not have to sort the elements added to them based on any natural ordering (e.g. 1 < 2, 'a' < 'b', etc). Elements of a list are sorted by index, and for this assignment they must be sorted by index only. In other words, if strings 'Mark', 'Luke', and 'John' are added to a list in that order, then get(2) must return a ReturnObject such that getReturnValue() will return the string 'John' regardless of the fact that 'J' comes before 'M'.