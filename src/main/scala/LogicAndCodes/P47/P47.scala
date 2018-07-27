package LogicAndCodes.P47

import scala.language.implicitConversions

class P47(e: Boolean) {
  import P47._

  def and(f: Boolean): Boolean = (e, f) match {
    case (true, true) => true
    case _ => false
  }

  def or(f: Boolean): Boolean = (e, f) match {
    case (true, _) | (_, true) => true
    case _ => false
  }

  def equ(f: Boolean): Boolean = (e and f) or not(e or f)
  def nand(f: Boolean): Boolean = not(e and f)
  def nor(f: Boolean): Boolean = not(e or f)
  def xor(f: Boolean): Boolean = not(e equ f)
  def impl(f: Boolean): Boolean = ???
}

object P47 {
  implicit def toP47Boolean(e: Boolean): P47 = new P47(e)

  def not(e: Boolean): Boolean = e match {
    case true => false
    case false => true
  }

  def table2(f: (Boolean, Boolean) => Boolean): Unit = {
    println("A     B     result")
    for {
      a <- List(true, false)
      b <- List(true, false)
    } { println(f"$a%-6s$b%-6s${f(a, b)}") }
  }
}

object MainRun extends App {
  import P47._
  table2((a: Boolean, b: Boolean) => a and (a or not(b)))
}
