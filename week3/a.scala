object a {
  def kidsWithCandies(candies: Array[Int], extraCandies: Int): Array[Boolean] = {
    var maximum = candies.max
    var arr = Array[Boolean]()

    for (candy <- candies) {
      if (candy + extraCandies >= maximum) {
        arr :+= true
      } else {
        arr :+= false
      }
    }

    return arr
  }
}