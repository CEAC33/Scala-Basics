# Scala-Basics

## Intro

### Scala Levels 
(Ref: http://www.scala-lang.org/old/node/8610)

Oderski introduced the concept of the Levels of Mastery of Scala (A1, A2/L1, A3/L2, L3) 
- Level A1: Beginning Application Programmer
- Level A2: Intermediate Application Programmer
- Level A3: Expert Application Programmer
- Level L1: Junior Library Designer
- Level L2: Senior Library Designer
- Level L3: Expert Library Designer

You have mastered the language perfectly if you can read "heavy" "type acrobatic" Libraries and understand both the Constructions/Algorithms and the reasons for Architectural Solutions
- Scalaz    - https://github.com/scalaz/scalaz
- Shapeless - https://github.com/milessabin/shapeless 

Recommended Blog: https://typelevel.org/blog/

### Introductory Articles on Scala
- A Tour of the Scala Programming Language - http://www.scala-lang.org/docu/files/ScalaTour-1.6.pdf
- An Overview of the Scala Programming Language - http://www.cse.unt.edu/~tarau/teaching/ScalaCourse/ScalaPapers/ScalaOverview.pdf
- A Scala Tutorial for Java programmers - http://scala-lang.org/docu/files/ScalaTutorial.pdf

### Scala Style Guide
- PayPal Style Guide - https://github.com/paypal/scala-style-guide
- Twitter.com: "Effective Scala" - http://twitter.github.io/effectivescala/
- scala-lang.org: Style Guide - http://docs.scala-lang.org/style/

### Interesting Collection of Examples
- Twitter.com: Scala School! - https://twitter.github.io/scala_school/
- "Learning Scala in Small Bites" - http://matt.might.net/articles/learning-scala-in-small-bites/
- "Scala coans" - You can download a zip-archive with examples of code (approximately 5-15 examples) on 20-30 basic topics - http://www.scalakoans.org/

### Video Courses
- Coursera: Functional Programming Principles in Scala - https://www.coursera.org/learn/progfun1
- Coursera: Functional Programming in Scala Specialization - https://www.coursera.org/specializations/scala

### JRE, Java, JVM, Reflection API and Scala

![jdk](
https://lh3.googleusercontent.com/h57LTjY5qb0bywx4TLmZRxo767teqktTzyKWENsZxnrC_J-E1dzRw-fk_q2RQPHxQsY5acbeH5p7Vxopl-sb1jZ2zzSxd5LY-kFJ0Hmc1G3LVd-kEFeOW1GepseQUmUUMWsxLNrHwtNYAmeE-i47yF0n9TOMbrNcYowiqQtwzP32ezcchsLfThZ2TgjfGvzwG7J13SnQdy70A0xykv5juEU7lkNFD-YIVKKJ8AyBziCkNj29WbmP1SeVw9r08S-7Ujr9AHX_V0UK7Q6QycFNgGKghpSsC5iXGYOwJFAtTGO3M2UMdr6I8FvGWfesoDhjCsYXzcp39fdbcgJ07Mo4mTv1dwhbnmiY8OB3qPrtseAaEbHz1I4dbu-w5t0HrejQQKa6TjoJ6wuZG3EdO0jodXB2CDPXj44qqaa1iDzG2PaCoy6jPFSr5xd9ApQPNS21MGakdwJqXnXVg7xCq9NTn7vryp7kyuJvIBmxwncjjcdH_5-zG6-jul40r3Y24EyYVcKMI0BjvpzfbHNcL0HqQiq0_rsUxhwCbBU79E4qhl1MCQnYQaZMpGvWHN63CWTF=w2884-h1458
)

### Important Sources for Scala
- Scala Glossary - http://docs.scala-lang.org/glossary/
- Scala Style Guide - http://docs.scala-lang.org/style/
- Scala Language Specification (2.12) - http://www.scala-lang.org/files/archive/spec/2.12/ 

# OOP I - No Inheritance

### OOP Intro
| Java                                  | Scala                                                  |  
|---------------------------------------|--------------------------------------------------------|
| class (only non-statics)              | class                                                  |
| class (only statics)                  | object                                                 |
| + field, method, constructor          | field (var, val), method (def), constructor            | 
|	+ inner class 					              | inner class (type projection)                          |
|	-								                      | inner class (path dependent)                           |
|	- 								                    | type (type)                                            |
| object = class instance				        | class instance                                         |
| abs.class, interface (methods, Java 8)| abs. class, trait (def, var, constructor)              |
|=============================|=================================|
|	-								                      | case class  = class  + auto-generated code             |
|	-								                      | case object = object + auto-generated code             |
|	-								                      | package object                                         |

### Object Intro
| Scala Object                          | Java static (fields, methods)                          |  
|---------------------------------------|--------------------------------------------------------|
| companion object = companion module   | class static members    (Person.MAX_AGE, ...)          |
| object (single, not companion) methods| utility "functions"/"constants" (Math.sin, Math.PI) .. |
| singleton                             | -                                                      |
| package object                        | -                                                      |

### Methods: Parentless

- Composition and Inheritance - Defining parameterless methods - http://www.artima.com/pins1ed/composition-and-inheritance.html#10.3
- Glossary - Scala Documentation - http://docs.scala-lang.org/glossary/#uniform-access-principle
- Uniform access principle - https://en.wikipedia.org/wiki/Uniform_access_principle

### Methods: "Procedure" Style
- Basic Declarations and Definitions - http://www.scala-lang.org/files/archive/spec/2.11/04-basic-declarations-and-definitions.html#procedures
- Style - Declarations - http://docs.scala-lang.org/style/declarations.html#procedure-syntax
- Deprecate procedure syntax - https://issues.scala-lang.org/browse/SI-7605

# OOP II - Operator Overloading

### Operators: Intro
- Operators - https://docs.oracle.com/javase/specs/jls/se8/html/jls-3.html#jls-3.12
- Prefix, Infix and Postfix Operations- http://www.scala-lang.org/files/archive/spec/2.11/06-expressions.html#prefix-infix-and-postfix-operations


# Testing Tools
- https://www.scalacheck.org/

# References 
- https://www.udemy.com/scala-for-java-developers-ru/learn/v4/
