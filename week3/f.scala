object f {
  def sumZero(n: Int): Array[Int] = {
    var arr = Array[Int]()
    var VOOOOOOOOOOBSHE_NENUZNAYA_VESH = 0
    for (i <- (-n / 2) to (n / 2)) {
      if (i == 0 && n % 2 == 0) VOOOOOOOOOOBSHE_NENUZNAYA_VESH += 1
      else arr :+= i
    }

    arr
  }
}