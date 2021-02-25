object Solution {
  def max(a: Int, b: Int): Int = {
    if (a > b) return a
    return b
  }

  def min(a: Int, b: Int): Int = {
    if (a > b) return b
    return a
  }

  def findMax(nums: Array[Int], n: Int): Int = {
    if (n == 1) return nums(0)
    return max(nums(n - 1), findMax(nums, n - 1))
  }

  def findMin(nums: Array[Int], n: Int): Int = {
    if (n == 1) return nums(0)
    return min(nums(n - 1), findMin(nums, n - 1))
  }

  def average(salary: Array[Int]): Double = {
    var arr = salary
    val mn = findMin(arr, arr.length)
    var mn1 = mn
    for (i <- 0 until salary.length) {
      if (arr(i) == mn1) {
        arr(i) = 0
        mn1 = -1
      }
    }

    val mx = findMax(salary, salary.length)
    var mx1 = mx
    for (i <- 0 until salary.length) {
      if (arr(i) == mx1) {
        arr(i) = 0
        mx1 = -1
      }
    }

    var sum = 0.0
    for (i <- arr) {
      sum += i
    }

    val a: Double = sum / (salary.length - 2)
    a
  }
}