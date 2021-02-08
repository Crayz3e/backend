object Main extends App {
  println("Hello world, new")

  def ex1(): Int = {
    1 + 1
  }

  println(ex1())

  def ex2(): Int = {
    val x = 1
    val y = x + 1
    y
  }

  println(ex2())

  def ex3(): Unit = {
    val x = 1
    val s = "a string"
  }

  def ex4(): Unit = {
    val x: Int = 1
    val s: String = "a string"
  }

  def ex5(): Unit = {
    if (1 == 1) {
      println("1 equals 1")
    } else {
      println("1 not equals 1")
    }
  }

  ex5()

  def ex6(): Int = {
    val x = if (3 < 6) 6 else 3
    x
  }

  println(ex6())

  def ex7(i: Int): String = {
    val result = i match {
      case 1 => "one"
      case 2 => "two"
      case _ => "not 1 or 2"
    }

    result
  }

  println(ex7(2))

  def ex8(bool: Boolean): String = {
    val booleanAsString = bool match {
      case true => "true"
      case false => "false"
    }

    booleanAsString
  }

  def getClassAsString(x: Any): String = x match {
    case s: String => s + " is a String"
    case i: Int => "Int"
    case f: Float => "Float"
    case l: List[_] => "List"
    case _ => "Unknown"
  }

  def ex9(): String = {
    var s: String = ""
    try {
      val x: Int = 1
      x / 0
      s = "successful"
    } catch {
      case _: ArithmeticException => s = "division by zero"
    }

    s
  }

  println(ex9())

  def ex10(): Unit = {
    for (arg <- args) print(arg + " ")
    println()

    // "x to y" syntax
    for (i <- 0 to 5) print(i + " ")
    println()

    // "x to y by" syntax
    for (i <- 0 to 10 by 2) print(i + " ")
    println()
  }

  ex10()

  def ex11(): IndexedSeq[Int] = {
    val x = for (i <- 1 to 5) yield i * 2
    x
  }

  println(ex11)

  def ex12(): List[Int] = {
    val fruits = List("apple", "banana", "lime", "orange")

    val fruitLengths = for {
      f <- fruits
      if f.length > 4
    } yield f.length

    fruitLengths
  }

  println(ex12())
}