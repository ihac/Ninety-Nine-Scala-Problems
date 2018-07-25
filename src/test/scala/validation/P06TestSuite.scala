package validation

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import WorkingWithLists.P06._

@RunWith(classOf[JUnitRunner])
class P06TestSuite extends FunSuite {
  test("palindrome check - ordinary Int list: isPalindrome(List(1, 2, 3, 4)) = false") {
    assert(P06.isPalindrome(List(1, 2, 3, 4)) === false)
  }
  test("palindrome check - ordinary Int list: isPalindrome(List(1, 2, 2, 1)) = true") {
    assert(P06.isPalindrome(List(1, 2, 2, 1)) === true)
  }
  test("palindrome check - ordinary String list: isPalindrome(List(\"hello\", \"world\", \"hello\")) = true") {
    assert(P06.isPalindrome(List("hello", "world", "hello")) === true)
  }
  test("palindrome check - one-item list: isPalindrome(List(3)) = true") {
    assert(P06.isPalindrome(List(3)) === true)
  }
  test("palindrome check - empty list: isPalindrome(List()) = true") {
    assert(P06.isPalindrome(List()) === true)
  }
}

