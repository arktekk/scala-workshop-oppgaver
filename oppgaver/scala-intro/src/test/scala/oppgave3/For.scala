package oppgave3

import org.scalatest._
import matchers.ShouldMatchers

class For extends FunSuite with ShouldMatchers {
  /* http://learnyouahaskell.com/ */
  test("pytagoras (a^2 + b^2 = c^2) finn sidene i en rettvinklet trekant der alle sider er <= 10 og omkretsen er 24"){

    // a^2 skrives math.pow(a, 2)

    import math.pow

    val py = for{
      c <- 1 to 10
      b <- 1 to c
      a <- 1 to b
      if pow(a,2) + pow(b,2) == pow(c,2)
      if a + b + c == 24
    } yield (a, b, c)

    py should be(Vector((6,8,10)))
  }
}