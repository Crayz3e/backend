object g {
  def kWeakestRows(mat: Array[Array[Int]], k: Int): Array[Int] = {
    var arr = Array.fill[Array[Int]](101)(Array[Int]())
    for (i <- 0 to mat.length - 1) {
      var cnt = 0
      for (j <-0 to mat(0).length - 1) {
        if (mat(i)(j) == 1) {
          cnt += 1
        }
      }

      arr(cnt) :+= i
    }

    var tmp = k
    var ans = Array[Int]()
    for (i <- 0 to 100) {
      for (j <- arr(i)) {
        if (tmp == 0) {
          return ans
        } else {
          ans :+= j
          tmp -= 1;
        }
      }
    }

    ans
  }
}