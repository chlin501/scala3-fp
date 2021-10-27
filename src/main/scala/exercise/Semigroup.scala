package exercise

trait Semigroup[T] {
    def combine(a: T, b: T): T
}

object Semigroup {

  def apply[T](using ev: Semigroup[T]): Semigroup[T] = ev

  given intSemigroup: Semigroup[Int] = new Semigroup[Int] {
    override def combine(a: Int, b: Int): Int = a + b
  }

  given doubleSemigroup: Semigroup[Double] = new Semigroup[Double] {
    override def combine(a: Double, b: Double): Double = a + b
  }

  given stringSemigroup: Semigroup[String] = new Semigroup[String] {
    override def combine(a: String, b: String): String = a + b
  }

}
