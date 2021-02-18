object c {
  def smallerNumbersThanCurrent(nums: Array[Int]): Array[Int] = {
    var arr = Array[Int]()

    for (i <- 0 to nums.length - 1) {
      arr :+= 0
    }

    for (i <- 0 to nums.length - 1) {
      for (j <- 0 to nums.length - 1) {
        if (nums(i) > nums(j)) {
          arr(i) += 1
        }
      }
    }

    arr
  }
}