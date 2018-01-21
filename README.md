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


### 1.1.-HelloWorld

- Demo0.scala
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

### 1.2.-Object

- Demo.scala
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

### 1.3.-TypeAnnotation 

- Demo.scala
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

### 1.4.-ArraysGenerics 

- Demo.scala
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

### 1.5.-StringInt 

- Demo.scala
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

### 1.6.-ImplicitImports 

- Demo.scala
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

### 1.7.-BaseEntities 

- DemoClassA.scala
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

### 2.1.-Var-Val-Implementation 

- Person0.scala
```scala
class Person0
{
  // var  age   :   Int             // not defaults! => abstract field!
  // var  age   :   Int   =   _     // Scala defaults
  // var  age   :   Int   =   1     // field initial value
}
```

- Person1.scala
```scala
class Person1
      extends AnyRef
{
  val   age   :   Int     =     1
}
```

- Person1Demo.scala
```scala
object  Person1Demo
        extends App
{
  val   person  :   Person1     =   new Person1()

  // accesor  ==  getter
  val   age                     =   person.age

  // mutator  ==  setter
  person.age                    =   1
}
```

- Person1DemoJ.java
```java
//import Reflector

public class    Person1DemoJ
                extends Object
{
    public static void main(String[] args)
    {
        Reflector.reflect(Person1.class);

        Person1 person  = new Person1();
        // accessor == getter
        int     age     = person.age();
    }
}
```

- Person1J.java
```java
public class Person1J
{
    public                  Person1J()
    {
        /* EMPTY */
    }

    private final   int     age         =   1;

    public          int     age     ()
    {
        return this.age;
    }
}
```

- Person2.scala
```scala
class Person2
{
  var   age   :   Int     =   1
}
```

- Person2Demo.scala
```scala
object  Person2Demo
  extends App
{
  val   person                  =   new Person2()

  // accesor  ==  getter
  val   age                     =   person.age

  // mutator  ==  setter
  person.age                    =   1
}
```

- Person2DemoJ.java
```java
//import Reflector

public class    Person2DemoJ
{
    public static void main(String[] args)
    {
        Reflector.reflect(Person2.class);

        Person2 person1  = new Person2();
        // accessor ==  getter
        int     age     = person.age();
        // mutator  ==  setter
        person1.age_$eq(45);
    }
}
```

- Person2J.java
```java
public class Person2J
{
    private int     age         =   1;

    public                  Person2J()
    {
        /* EMPTY */
    }

    // accessor
    public  int     age     ()
    {
        return this.age;
    }

    // mutator, '$' special Scala compiler character
    public  voic    age_$eq (int age)
    {
        this.age                =   age
    }
}
```

### 2.2.-Override-Accessor-Mutator

- Person0.scala
```scala
// 1.- make field private
class Person0
{
  private var   age   :   Int     =   _
}
```

- Person0DemoJ.java
```java
// import Reflector

public class Person0DemoJ
{
    public static void main(String[] args)
    {
        Reflector.reflect(Person0.class)
    }
}
```

- Person1.scala
```scala
// 1.- make field private[this]
class Person1
{
  private[this] var   age   :   Int     =   _
}
```

- Person1DemoJ.java
```java
// import Reflector

public class Person1DemoJ
{
    public static void main(String[] args)
    {
        Reflector.reflect(Person1.class)
    }
}
```

- Person2.scala
```scala
// 1.- make field private / private[this]
// 2.- rename field
// 3.- create accessor 'def fieldName: fieldType = {...}'
// 4.- create mutator  'def fieldName_$eq(...): Unit = ()'

class Person2
{
  private[this] var privateAge    :   Int     =     _

  // accessor
  def age                   : Int =
  {
    println("Hello from accesor!")
    privateAge
  }

  // mutator: fieldName_$eq(...)
  def age_$eq(value : Int)  : Unit =
  {
    println("Hello from mutator!")
    privateAge = value
  }
}
```

- Person2Demo.scala
```scala
object  Person2Demo
        extends App
{
  val   person    =   new Person2

  // accessor demo
  val   age       =   person.age

  // mutator  demo
  person.age      =   45

  // 'parasite' mutators demo
  person.age_$eq(45)
  person.age_     =   (45)
}
```

- Person3.scala
```scala
// 1.- make field private / private[this]
// 2.- rename field
// 3.- create accessor 'def fieldName: fieldType = {...}'
// 4.- create mutator  'def fieldName_$eq(...): Unit = ()'

class Person2
{
  private[this] var privateAge    :   Int     =     _

  // accessor
  def age                   : Int =
  {
    println("Hello from accesor!")
    privateAge
  }

  // mutator: fieldName_ = (...)
  def age_ = (value : Int)  : Unit =
  {
    println("Hello from mutator!")
    privateAge = value
  }
}
```

- Person3Demo.scala
```scala
object  Person3Demo
  extends App
{
  val   person    =   new Person3

  // accessor demo
  val   age       =   person.age

  // mutator  demo
  person.age      =   45

  // 'parasite' mutators demo
  person.age_$eq(45)
  person.age_     =   (45)
}
```

### 2.3.-Java-Bean-Style-Getter-Setter

- Person0.scala
```scala
class Person0
{
  private[this] var   age               :   Int   =   _

  def                 getAge()                    =   this.age

  def                 setAge(age : Int) :   Unit  =   this.age  = age
}
```

- Person0DemoJ.java
```java
// import Reflector;

public class Person0DemoJ
{
    public static void main(String[] args)
    {
        Reflector.reflect(Person0.class);

        Person0 person = new Person0();

        //Java bean style: getter / setter
        person.setAge(  person.getAge() + 1 );
    }
}
```

- Person1.scala
```scala
import scala.beans.BeanProperty

class Person1
{
  @BeanProperty   var   age   :   Int     =   _
}
```

- Person1DemoJ.java
```java
// import Reflector

public class Person1DemoJ
{
    public static void main(String[] args)
    {
        Reflector.reflect(Person1.class);

        Person1     person      = new Person1();

        // Scala bean style:    accessor / mutator
        person.age_$eq(     person.age()    + 1     );

        // Java  bean style:    getter   / setter   (@BeanProperty needed)
        person.setAge (     person.getAge() + 1     );
    }
}
```

- Person2.scala
```scala
import scala.beans.BeanProperty

class Person2   (@BeanProperty   var   age   :   Int)
```

- Person2DemoJ.java
```java
// import Reflector

public class Person2DemoJ
{
    public static void main(String[] args)
    {
        Reflector.reflect(Person2.class);

        Person2     person      = new Person2(0);

        // Scala bean style:    accessor / mutator
        person.age_$eq(     person.age()    + 1     );

        // Java  bean style:    getter   / setter   (@BeanProperty needed)
        person.setAge (     person.getAge() + 1     );
    }
}
```

### 2.4.-Constructor-Primary

- Person0.scala
```scala
// primary constructor
// no fields!
class Person0(  age   :   Int   )
```

- Person0Demo.scala
```scala
object  Person0Demo
        extends App
{
  val person  =   new Person0(45)

  // accessor   ==  getter
  // val age    = person.age
  // mutator    ==  setter
  // person.age = 1
}
```

- Person0DemoJ.java
```java
// import Reflector

public class Person0DemoJ
{
    public static void main(String[] args)
    {
        Reflector.reflect(Person0.class);
    }
}
```

- Person1.scala
```scala
class Person1(  _age  :   Int   )
{
  var   age   :   Int   = _age
}
```

- Person1Demo.scala
```scala
object  Person1Demo
        extends App
{
  val   person    =   new Person1(45)

  //    accessor  ==  getter
  val   age       =   person.age

  //    mutator   ==  setter
  person.age
}
```

- Person1DemoJ.java
```java
// import Reflector

public class Person1DemoJ
{
    public static void main(String[] args)
    {
        Reflector.reflect(      Person1.class   )
    }
}
```

- Person2.scala
```scala
class Person2(  var   age   :   Int,  val   name    :   String)
```

- Person2Demo.scala
```scala
object  Person2Demo
        extends App
{
  val   person      =     new Person2(45, "Mike")

  //    accessor    ==    getter
  val   age         =     person.age
  //    mutator     ==    setter
  person.age        =     1

  //    accessor    ==    getter
  val   name        =     person.name

  //    mutator     ==    setter
  //    person.name =     "Sara"
}
```

- Person2DemoJ.java
```java
// import Reflector

public class Person2DemoJ
{
    public static void main(String[] args)
    {
        Reflector.reflect(      Person2.class   )
    }
}
```

- Person3.scala
```scala
protected class Person3 protected ( private var   age   :   Int,  val   name    :   String)
```

### 2.5.-Constructor-Auxiliary

- Person0.scala
```scala
// auxiliary constructors
class Person0 (   var   name    :   String,   var   age   :   Int   )
{
  def this  (   age   :   Int     )
  {
    this    (  Person0.DEFAULT_NAME , age  )
  }

  def this  (   name  :   String  )
  {
    this    (   name                , Person0.DEFAULT_AGE)
  }

  def this  ()
  {
    this    (   Person0.DEFAULT_NAME, Person0.DEFAULT_AGE)
  }
}

// 'companion object' as constant holder
object Person0
{
  val   DEFAULT_NAME    =   "Mike"
  val   DEFAULT_AGE     =   45
}
```

- Person0Demo.scala
```scala
object  Person0Demo
        extends App
{
  new Person0()
  new Person0("Mike")
  new Person0(45)
  new Person0("Mike", 45)
}
```

- Person1.scala
```scala
// 'default parameters' values
class   Person1   (   var   name  :   String  =   "Mike",   var   age   :   Int   =   45)

object  Person1Demo
        extends App
{
  new Person1()

  new Person1("A")

  new Person1( age = 0)

  new Person1("A", 0)
}
```

- Person2.scala
```scala
// 'named parameters' demo
class   Person2       (   var   name  :   String,   var   age   :   Int   )

object  Person2Demo
        extends App
{
  new Person2 (   "Mike"        ,   45            )
  new Person2 (   name = "Mike" ,   45            )
  new Person2 (   "Mike"        ,   age  = 45     )
  new Person2 (   name = "Mike" ,   age  = 45     )

  // another parameter order!
  new Person2 (   age  = 45     ,   name = "Mike" )
}
```

### 2.6.-Object-Utility-Functions-Constants

- Demo.scala
```scala
import IntLib.max

// 1.- utility "functions"/"constants"
object Demo
{
  def main(args: Array[String])
  {
    println(max(7,3))
  }
}

object IntLib
{
  val MAX_INT = java.lang.Integer.MAX_VALUE
  def max(x: Int, y: Int) = if (x > y) x else y
}
```

### 2.7.-Object-Companion-Object -  demo

- DemoJ.java
```java
package demo;

public class DemoJ
{
    public int              f()     {   return 0;   }
    public final    int     k   =   0;

    //public static   int     f()     {   return 0;   }
    //public static final int k   =   0;
}

class DemoJTest
{
    public static void main(String[] args)
    {
        System.out.println(     new DemoJ().k       );
        System.out.println(     new DemoJ().f()     );
    }
}
```

- DemoS.scala
```scala
package  demo

class DemoS
{
  def f() : Int   =   0
  val k   : Int   =   1
}

object DemoS
{
  def f() : Int   =   0
  val k   : Int   =   1
}

class X
{
  //new DemoS().k
  //new DemoS().f

  //DemoS.k
  //DemoS.f
}
```

- JPerson.java
```java
package demo;

import static  demo.JPerson.JPerson;

public class JPerson
{
    public final int    age;
    public final String name;

    public JPerson                  (String name, int age)
    {
        this.name   = name;
        this.age    = age;
    }

    public static JPerson JPerson   (String name, int age)
    {
        return new JPerson(name, age);
    }
}

class JDemo
{
    public static void main(String[] args)
    {
        JPerson person0 = new JPerson       ("Mike", 45);
        JPerson person1 = JPerson.JPerson   ("Mike", 45);
        JPerson person2 = JPerson           ("Mike", 45);
    }
}
```

- Person.scala
```scala
package demo

// package

class   Person  (   val   name  :   String,   val   age   :   Int)

// Java/static class members == Scala/companion object, companion module
object  Person
{
  val MAX_AGE           =   256
  val MAX_NAME_LENGTH   =   1024

  def apply   (   name  :   String,   age   :   Int   ) = new Person(name, age)
}

object  Demo
        extends App
{
  val person0           =   new Person  ("Mike", 45)

  val person1           =   Person.apply("Mike", 45)

  val person2           =   Person      ("Mike", 45)
}
```

- PrivateDemo.scala
```scala
package demo

// companion class
class PrivateDemo
{
  private val classPrivate  = 0
  val         tmp           = PrivateDemo.objectPrivate
}

// companion object
object PrivateDemo
{
  private val objectPrivate = 0
  val         tmp           = new PrivateDemo().classPrivate
}
```

### 2.8.-Object-Singleton

- Demo.scala
```scala
// type definition
trait   T
class   C
object  O

object  Demo
        extends App
{
  val   x   :   T                             =   null
  val   y   :   C                             =   null
  //val   z   :   O                             =   null
  val   z   :   O.type                        =   null

  def   f(  x   :   T         )   :   T       =   ???
  def   g(  x   :   C         )   :   C       =   ???
  //def   h(  x   :   O         )   :   O       =   ???
  def   h(  x   :   O.type    )   :   O.type  =   ???

  def   r(  arg :   Any       )   :   String  =   arg
  match
  {
    case _: T       =>    "T"
    case _: C       =>    "C"
    //case _: O       =>    "O"
    case _: O.type  =>    "O"
  }
}
```

- Demo0.scala
```scala
trait   T
class   C
object  OT  extends T
object  OC  extends C

object  Demo0
        extends App
{
  def   f   (   arg   :   T   )   :   Unit    =     ???

  f ( new T{} )
  f ( OT      )

  def   g   (   arg   :   C   )   :   Unit    =     ???

  g ( new C   )
  g ( OC      )


  def   r   (   arg   :   Any )               =     arg
  match
  {
    case _:   C         =>    "C"
    case _:   T         =>    "T"

    case      OT        =>    "OT"
    case _:   OT.type   =>    "OT"

    case      OC        =>    "OC"
    case _:   OC.type   =>    "OC"

    case      1         =>    "1"
//    case _:   1         =>    "1"
    case _:   Int       =>    "1"
  }
}
```

### 2.9.-Methods-Simplification

- Demo.scala
```scala
class Demo
{
  // Scala method in Java style Java
  def f0 (x: Int, y: Int): Int  =
  {
    return x * x + y * y;
  }

  // Semicolon inference
  def f1 (x: Int, y: Int): Int  =
  {
    return x * x + y * y
  }


  // Last expression return
  def f2 (x: Int, y: Int): Int  =
  {
    x * x + y * y
  }

  // Single expression
  def f3 (x: Int, y: Int): Int  = x * x + y * y

  // Return type inference
  def f4 (x: Int, y: Int)       = x * x + y * y
  //def f4 (x, y)       = x * x + y * y

  // Public API- don't use type inference
  //def f  (x: Int , y: Long)      = x * x + y * y
  //def f  (x: Long, y: Int)       = x * x + y * y

  //params == val
  def f5 (x: Int, y: Int): Int = {
    // x = x * x
    // y = y * y
    x + y
  }

  def f6 (x: Int, y: Int): Int = {
    val sqrX = x * x
    val sqrY = y * y
    sqrX + sqrY
  }

  // Nested function!
  def f7 (x: Int, y: Int): Int = {
    def sqr (t: Int) = x * x
    sqr(x) + sqr(y)
  }

  // recursive def definition and return type inference
  // def f (x: Int)         = if (x == 0) 1 else x * f(x - 1)
  // def f (x: Int): Int    = if (x == 0) 1 else x * f(x - 1)
}
```

### Methods: Parentless

- Composition and Inheritance - Defining parameterless methods - http://www.artima.com/pins1ed/composition-and-inheritance.html#10.3
- Glossary - Scala Documentation - http://docs.scala-lang.org/glossary/#uniform-access-principle
- Uniform access principle - https://en.wikipedia.org/wiki/Uniform_access_principle

### 2.10.-Methods-Parentless

- Demo.scala
```scala
class Demo
{
  // f0 == f1
  // g0 == g1
  // (f0, f1) != (g0, g1)

  def f0        = 1

  def f1  : Int = 1

  def g0()      = 1

  def g1(): Int = 1
}

object  DemoTest
        extends App
{
  new Demo().f0
  //new Demo().f0()

  new Demo().g0
  new Demo().g0()
}
```


- Demo1.scala
```scala
class   Demo1
{
  def property  =
  {
    val x = 44
    val y = x + 1
    y
  }
}

object  Demo1Test
        extends App
{
  val age       = new Demo1().property
}

/*
  Uniform Acess Principle
  All services offered by a module should be available through a uniform notation,
  which does not betray whether they are implemented through storage or through computation
 */
```

### Methods: "Procedure" Style
- Basic Declarations and Definitions - http://www.scala-lang.org/files/archive/spec/2.11/04-basic-declarations-and-definitions.html#procedures
- Style - Declarations - http://docs.scala-lang.org/style/declarations.html#procedure-syntax
- Deprecate procedure syntax - https://issues.scala-lang.org/browse/SI-7605

### 2.11.-Methods-Procedure-Style

- Demo.scala
```scala
object Demo
{
  def f0() : Int  =   {1}
  def f1() : Int  =   1
  def f2()        =   {1}
  def f3()        =   1

  // 1.- the equals sign are  omitted
  // 2.- the result type is   omitted
  // 3.- method defining expression must be a block

  //def g0() : Int      {1}
  //def g1() : Int      1
  //def g2()            {1}
  //def g3()            1

  // AnyVal -> Unit
  def g4() : Unit =   1
  def g5() : Unit =   {1}
  def g6() : Unit =   {return 1}
  // AnyRef -> Unit
  def g7() : Unit =   "A"
  def g8() : Unit =   {"A"}
  def g9() : Unit =   {return "A"}
  // Any    -> Unit
  val any  : Any  =   null
  def ga() : Unit =   any
  def gb() : Unit =   {any}
  def gc() : Unit =   {return any}
}
```

### 2.12.-Imports

- Demo0.scala
```scala
import java.util.ArrayList
import java.util.{HashMap, TreeMap}
import java.io._

object Demo0
{
  val x = new ArrayList[String]()
  val y = new HashMap[String, TreeMap[String, String]]()
  val z = new StringWriter()
}
```

- Demo1.scala
```scala
import java.lang.Integer.valueOf
import java.lang.Double.{isInfinite => isInf, isNaN}
import java.lang.Float._

object Demo1
{
  val x = valueOf("42")
  def y(d: Double) = isInf(_) || isNaN(_)
  val z = floatToRawIntBits(0.1f)
}
```

- Demo2.scala
```scala
class Person  (val name: String, val age: Int)

object Demo2
{
  def f       (p: Person) : Unit =
  {
    import p._
    println("name: " + name + ", age: " + age)
  }
}
```

- Demo3.scala
```scala
import java.util.{ArrayList => AList}
import java.util.{TreeMap => TMap, HashMap, LinkedList => LList}
import java.io.{StringWriter => SW, _}

object Demo3
{
  val x: AList  [String]          = null
  val y: TMap   [String, String]  = null
  val z                           = new SW()
}
```

- Demo4.scala
```scala
import java.util.{ArrayList => _, _}

object Demo4
{
  val x   =   new LinkedList[String]()
}
```

- Demo5.scala
```scala
object Demo5
{
  import java.util.ArrayList
  val x: ArrayList[String] = null


  def f(): Unit =
  {
    import java.util.{LinkedList => LList}
    val x: LList[String] = null
  }
}
```

- Demo6.scala
```scala
import java.util

object Demo6
{
  def main(args: Array[String])
  {
    val x = new util.ArrayList[String]()
  }
}
```

- Demo7.scala
```scala
import java.util

object Demo7
{
  def main(args: Array[String])
  {
    import util.LinkedList
    val x = new LinkedList[String]()
  }
}
```

- Demo8.scala
```scala
import java.util

// java.util.concurrent.locks.ReentrantLock
//
// java.util
//      util.concurrent
//           concurrent.locks
//                      locks.ReentrantLock

object Demo8
{
  import util.concurrent
  def main(args: Array[String])
  {
    import concurrent.locks
    if (1 > 0)
    {
      import locks.ReentrantLock
      if(2 > 1)
      {
        val x = new ReentrantLock()
      }
    }
  }
}
```

- Demo9.scala
```scala
import java.{util => U}

object Demo9
{
  import U.{concurrent => C}

  def main(args: Array[String])
  {
    import C.{locks => L}
    if (1 > 0)
    {
      import L.{ReentrantLock => RL}
      if (2 > 1)
      {
        val x = new RL()
      }
    }
  }
}
```

# OOP II - Operator Overloading

### Operators: Intro
- Operators - https://docs.oracle.com/javase/specs/jls/se8/html/jls-3.html#jls-3.12
- Prefix, Infix and Postfix Operations- http://www.scala-lang.org/files/archive/spec/2.11/06-expressions.html#prefix-infix-and-postfix-operations


# Testing Tools
- https://www.scalacheck.org/

# References 
- https://www.udemy.com/scala-for-java-developers-ru/learn/v4/
