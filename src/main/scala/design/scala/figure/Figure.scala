package design.scala.figure

case class Position(x: Int = 0, y: Int = 0)

trait Figure {

  def absolute: Position

  def moveBy(relative: Position): Position =
    absolute.copy(
      absolute.x + relative.x,
      absolute.y + relative.y
    )

  def moveTo(absolute: Position) =
    this.absolute.copy(
      absolute.x,
      absolute.y
    )

}
