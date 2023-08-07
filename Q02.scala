def calculateSquare(list: List[Int]): List[Int] = {
  list.map((x: Int) => x * x)
}

def main(args: Array[String]): Unit = {
    // val list = List(1, 2, 3, 4, 5, 6, 7, 8)
    print("Enter a list of numbers:")
    val list = scala.io.StdIn.readLine().split(" ").map(_.toInt).toList

    println(calculateSquare(list))
}