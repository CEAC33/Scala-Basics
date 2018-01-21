# Scala-Basics

## 1.- Intro

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


### 1.1.-HelloWorld - Demo0.scala

```scala
// 1.- public (object, method)
// 2.- object =~ static
// 3.- def
// 4.- invert type information
// 5.- arrays + generics in Scala
// 6.- String, Int, Unit in Scala
// 7.- implicit imports

/*public*/ object Demo0
{

  /*public*/ def main(args: Array[String])
  {
    println("\n\n\nHello World!\n\n\n")
  }
}
```

### 1.2.-Object - Demo.scala

```scala
// companion class
class Example
{
  def f(x: Int): Int = x + 1
}

// companion class
object ExampleO
{
  def g(x: Int): Int = x + 1
}

object Demo
{
  def main(args: Array[String]): Unit =
  {
    // Java: class-instance method        |   Scala: class  method
    new Example().f(0)

    // Java: static method, class method  |   Scala: object method
    ExampleO.g(0)

    // Results
    println("\n\n\n// Java: class-instance method        |   Scala: class  method")
    println("new Example().f(0) \t\t\t\tresult:"+new Example().f(0))
    println("\n// Java: static method, class method  |   Scala: object method")
    println("ExampleO.g(0) \t\t\t\t\tresult:"+ExampleO.g(0)+"\n\n\n")
  }
}
```

### 1.3.-TypeAnnotation - Demo.scala

```scala
object Demo
{
  // public static int int f(int x, int y) {return x + y;}
  def f(x: Int, y:Int): Int = x + y

  def main(args: Array[String]): Unit =
  {
    // Results
    println("\n\n\nDemo.f(3,3)\t\t\t\tresult:"+Demo.f(3,3)+"\n\n\n")
  }
}
```

### 1.4.-ArraysGenerics - Demo.scala

```scala
object Demo
{
  // ARRAYS
  // public final int[] arr = new int[]{0, 1, 2, 3}
  val arr: Array[Int] = Array(0, 1, 2, 3)
  // public int elem2 = arr[2]
  var elem2: Int = arr(2)

  // GENERICS/Lists
  // public final java.util.List<Int> list = java.util.Arrays.asList(0, 1, 2, 3)
  val list: List[Int] = List(0, 1, 2, 3)
  // public int elem3 = list.get(3)
  var elem3: Int = list(3)

  // Results
  def main(args: Array[String]): Unit =
  {
    println("\n\n\n")

    println("  // ARRAYS\n  // public final int[] arr = new int[]{0, 1, 2, 3}\n  val arr: Array[Int] = Array(0, 1, 2, 3)\n  // public int elem2 = arr[2]\n  var elem2: Int = arr(2)\n\n  // GENERICS/Lists\n  // public final java.util.List<Int> list = java.util.Arrays.asList(0, 1, 2, 3)\n  val list: List[Int] = List(0, 1, 2, 3)\n  // public int elem3 = list.get(3)\n  var elem3: Int = list(3)")
    println("\nRESULTS:\n")
    println("arr:"    +"\t\t\t"+ arr.deep.mkString(" "))
    println("elem2:"  +"\t\t\t"+ elem2)
    println("list:"   +"\t\t\t"+ list)
    println("elem3:"  +"\t\t\t"+ elem3)

    println("\n\n\n")
  }
}
```

### 1.5.-StringInt - Demo.scala

```scala
// 1.- 'Int'    Compiled            to  'int'
// 2.- 'Int'    "has Methods"       =>  Implicit Conversions
// 3.- 'String' Compiled            to  'java.lang.String'
// 4.- 'String' "has new Methods"   =>  Implicit Conversions
// 5.- Implicit Conversions         to  Different Classes

object Demo
{
  val x           : Int     = 0
  val from0to5    : Range   = x.to(5)             // RichInt

  val s           : String  = "abc"
  val c           : Char    = s.last              // IndexedSeqOptimized
  val capitalized : String  = s.capitalize        // StringLike

  // Results
  def main(args: Array[String]): Unit =
  {
    println("\n\n\n")

    println("  val x           : Int     = 0\n  val from0to5    : x.to(5)                       // RichInt\n\n  val s           : String  = \"abc\"\n  val c           : Char    = s.last              // IndexedSeqOptimized\n  val capitalized : String  = s.capitalize        // StringLike")
    println("\nRESULTS:\n")

    println("x:"          +"\t\t\t" + x)
    println("from0to5:"   +"\t\t"   + from0to5)
    println("")
    println("s:"          +"\t\t\t" + s)
    println("c:"          +"\t\t\t" + c)
    println("capitalized:"+"\t\t"   + capitalized)

    println("\n\n\n")
  }
}
```

### 1.6.-ImplicitImports - Demo.scala

```scala
import java.lang._
import scala._
import scala.Predef._

// 1.- Implicit Imports
// 2.- Imports:   like Java
//          name  -> name
//          *     -> _
//          Static Imports
// 3.- Transparent Imports of Java Classes
// 4.- Packages:  like Java

object Demo0
{
  def main(args: Array[String])
  {
    println("\n\n\n")

    println("Hello World! from Demo0")

    println("\n\n\n")
  }
}

// 1.- App, Application
object Demo1 extends App
{
  println("\n\n\n")

  println("Hello World! from Demo1")

  println("\n\n\n")
}
```

### 1.7.-BaseEntities - DemoClassA.scala

```scala
package DemoClassA

class   DemoClassA  { }               // like Java CLASS without static members

trait   DemoTraitA  { }               // like Java INTERFACE + ABSTRACT CLASS

object  DemoObjectA { }               // like Java CLASS only with static members + SINGLETON


class   DemoClassB

trait   DemoTraitB

object  DemoObjectB



class DemoDef
{
  // Scala Method in Java style Java
  def f0  (x: Int, y: Int)    :   Int =
  {
    return x * x + y * y;
  }

  // Semicolon Interface
  def f1  (x: Int, y: Int)    :   Int =
  {
    return x * x + y * y
  }

  // Last Expression Return
  def f2  (x: Int, y: Int)    :   Int =
  {
    x * x + y * y
  }

  // Single Expression
  def f3  (x: Int, y: Int)    :   Int =       x * x + y * y

  // Return Type Inference
  def f4  (x: Int, y: Int)            =       x * x + y * y

  // NOT method! Nested Function!
  def g   (x: Int, y: Int)    :   Int =
  {
    def sqr (t: Int) = x * x
    sqr(x) + sqr(y)
  }
}

class DemoVarVal
{
  var m_field     :     Int           =     0                   // Mutable    Field
  val i_field     :     Int           =     0                   // Immutable  Field

  def f   (x: Int, y: Int): Int       =
  {
    var m_local   :     Int           =     x * x               // MUTABLE    Local   Variable
    val i_local   :     Int           =     y * y               // IMMUTABLE  Local   Variable

    m_local                           =     1                   // can    change local VAR
    i_local                           =     1                   // can't  change local VAL

    var obj0                          =     new DemoVarVal
    obj0          .m_field            =     1                   // can    change Field VAR
    obj0          .i_field            =     1                   // can't  change Field VAL
    obj0                              =     new DemoVarVal

    var obj1                          =     new DemoVarVal
    obj1          .m_field            =     1
    obj1          .i_field            =     1
    obj1                              =     new DemoVarVal
  }

  // Parameter Values Immutable == val
  def g   (x: Int, y: String) : Unit  =
  {
    x = 1
  }
}
```

# 2.- OOP I - No Inheritance

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
