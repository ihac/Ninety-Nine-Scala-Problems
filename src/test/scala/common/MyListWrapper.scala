package common

import scala.language.implicitConversions

object MyListWrapper {
  implicit def toMyList[T](l: List[T]): MyList[T] = new MyList[T](l)

  class MyList[T](v: List[T]) {
    def removeAt(i: Int): List[T] = v.splitAt(i) match {
      case (start, h::tail) => start:::tail
      case _ => throw new java.util.NoSuchElementException
    }
    def isSub(that: List[T]): Boolean = v match {
      case h :: tail => that.contains(h) && tail.isSub(that.removeAt(that.indexWhere(_ == h)))
      case Nil => true
    }
  }
}
