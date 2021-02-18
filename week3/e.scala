object e {
  def decompressRLElist(nums: Array[Int]): Array[Int] = {
    var arr = Array[Int]()
    for (i <- 0 to (nums.length / 2) - 1) {
      arr = arr ++: Array.fill[Int](nums(2 * i))(nums(2 * i + 1))
    }

    arr
  }
}