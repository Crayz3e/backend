import scala.collection.mutable.Map

object d {
  def repeatedNTimes(A: Array[Int]): Int = {
    var cnt = collection.mutable.Map[Int, Int]()

    for (a <- A) {
      cnt.put(a, 0)
    }

    for (a <- A) {
      cnt(a) += 1
    }

    for ((k,v) <- cnt) {
      if (v == A.length / 2) {
        return k
      }
    }

    return 0
  }
}