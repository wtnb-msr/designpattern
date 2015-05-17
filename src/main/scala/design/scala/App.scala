package design.scala

object App {

  def run = {
    val screen = new Screen()
    screen.print
    println("start")
    screen.move(10)
    println("finish")
    Thread.sleep( 10 * 1000 )
  }

  def main(args: Array[String]) = {
    run
  }
}
