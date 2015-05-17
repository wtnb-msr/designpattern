package design.scala

import design.scala.figure._

import scala.util.Random

class Screen {

  lazy val width: Int = 320
  lazy val height: Int = 480

  def position: Position = Position(0, 0)
  def center: Position = Position(
    ( width  - position.x ) / 2,
    ( height - position.y ) / 2
  )

  val figures = Seq(
    buildSquare,
    buildRectangle,
    buildTriangle,
    buildCircle
  )

  def move(step: Int) =
    for (i <- 0 to step) {
      print
      Thread.sleep( 1 * 1000 )
    }

  def print = figures foreach { println(_) }

  def moveUp(figure: Figure): Figure =
    figure.moveBy( Position() )


  private def randomPosition: Position =
    Position( Random.nextInt(width), Random.nextInt(height) )

  private def buildSquare: Square =
    Square( center, width = Random.nextInt(width) )

  private def buildRectangle: Rectangle =
    Rectangle( center, Seq.tabulate(4)(_ => randomPosition) )

  private def buildTriangle: Triangle =
    Triangle( center, Seq.tabulate(3)(_ => randomPosition) )

  private def buildCircle: Circle =
    Circle( center, radius = Random.nextInt(100) )

}
