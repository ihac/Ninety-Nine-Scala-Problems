package P41

object P41 {
  import P40.P40._
  def printGoldbachList(r: Range): Unit = {
    r foreach { n =>
      if (n % 2 == 0 && n > 2) {
        val (a, b) = n.goldbach
        println(s"$n = $a + $b")
      }
    }
  }

  def printlnGoldbachListLimited(r: Range, limit: Int): Unit = {
    r foreach { n =>
      if (n % 2 == 0 && n > 2) {
        val (a, b) = n.goldbach
        if (a > limit)
          println(s"$n = $a + $b")
      }
    }
  }
}

object MainRun extends App {
  import P41._
  println("=================")
  printGoldbachList(9 to 20)
  println("=================")
  printGoldbachList(30 to 100)
  println("=================")
  printlnGoldbachListLimited(1 to 2000, 50)
  println("=================")
  printlnGoldbachListLimited(3 to 3000, 50)
  println("=================")
}
