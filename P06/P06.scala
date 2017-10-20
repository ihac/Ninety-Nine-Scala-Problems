object P06 extends App {
  def isPalindrome[T](l: List[T]): Boolean = l == l.reverse
  def isPalindrome2[T](l: List[T]): Boolean =
    l.foldLeft(List[T]()){ (lr, e) => e::lr } == l
  println("isPalindrome(List(1, 2, 3, 2, 1)) = " + isPalindrome2(List(1, 2, 3, 2, 1)))
  println("isPalindrome(List(1, 2, 3, 1)) = " + isPalindrome2(List(1, 2, 3, 1)))
}
