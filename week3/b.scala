/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object b {
  def getDecimalValue(head: ListNode): Int = {
    var sz = 0
    var node = head
    while (node != null) {
      node = node.next
      sz += 1
    }

    var ans = 0
    node = head
    while (node != null) {
      ans += scala.math.pow(2, sz - 1).toInt * node.x
      sz -= 1
      node = node.next
    }

    ans
  }
}