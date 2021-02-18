object j {
  def buildArray(target: Array[Int], n: Int): List[String] = {
    var ans = List[String]()
    var j = 0
    var i = 1
    while (true) {
      if (i == target(j)) {
        ans :+= "Push"
        j += 1

        if (j == target.length) {
          return ans
        }
      } else {
        ans :+= "Push"
        ans :+= "Pop"
      }

      i += 1
    }

    return ans
  }
}