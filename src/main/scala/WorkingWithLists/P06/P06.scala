package WorkingWithLists.P06

object P06 {
  def isPalindrome[T](l: List[T]): Boolean = l == l.reverse
  // maybe we could use reverse() from package WorkingWithLists.P05
}
