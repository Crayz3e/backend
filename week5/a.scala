object Solution {
  def max(a: Int, b: Int): Int = {
    if (a > b) return a
    return b
  }

  def findMax(nums: Array[Int], n: Int): Int = {
    if (n == 1) return nums(0)
    return max(nums(n - 1), findMax(nums, n - 1))
  }

  def maxProduct(nums: Array[Int]): Int = {
    val mx = findMax(nums, nums.length)
    var mx1 = mx
    var arr = nums
    for (i <- 0 until nums.length) {
      if (arr(i) == mx1) {
        arr(i) = 1
        mx1 = 0
      }
    }

    val mx2 = findMax(arr, arr.length)
    return (mx - 1) * (mx2 - 1)
  }
}