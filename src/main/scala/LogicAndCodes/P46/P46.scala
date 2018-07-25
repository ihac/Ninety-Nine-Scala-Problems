package LogicAndCodes.P46

object P46 {
  def and(a: Boolean, b: Boolean): Boolean = (a, b) match {
    case (true, true) => true
    case _ => false
  }

  def or(a: Boolean, b: Boolean): Boolean = (a, b) match {
    case (true, _) | (_, true) => true
    case _ => false
  }

  def not(a: Boolean): Boolean = a match {
    case true => false
    case false => true
  }

  def equ(a: Boolean, b: Boolean): Boolean = or(and(a, b), not(or(a, b)))
  def nand(a: Boolean, b: Boolean): Boolean = not(and(a, b))
  def nor(a: Boolean, b: Boolean): Boolean = not(or(a, b))
  def xor(a: Boolean, b: Boolean): Boolean = not(equ(a, b))
  def impl(a: Boolean, b: Boolean): Boolean = ???

  def table2(f: (Boolean, Boolean) => Boolean): Unit = {
    println("A     B     result")
    for {
      a <- List(true, false)
      b <- List(true, false)
    } { println(f"$a%-6s$b%-6s${f(a, b)}") }
  }
}

object MainRun extends App {
  import P46._
  table2(and)
  table2(xor)
}
