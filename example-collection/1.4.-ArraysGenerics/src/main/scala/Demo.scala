
// 4.- var, val
// 5.- Generics/Lists use '[..]' for type
// 6.- Lists use '(..)' for index
// 7.- Lists indexing from zero

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