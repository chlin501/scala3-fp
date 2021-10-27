package exercise

import collection.mutable.Stack
import org.scalatest._
import flatspec._
import matchers._

class SemigroupSpec extends AnyFlatSpec with should.Matchers {

  "A Semigroup" should "combine two values" in {

    import Semigroup._

    val intS = Semigroup[Int]
    val three = intS.combine(1, 2)
    three should be (3)

    val strS = Semigroup[String]
    val str = strS.combine("abc", "xyz")
    str should be ("abcxyz")
   
  }

}
