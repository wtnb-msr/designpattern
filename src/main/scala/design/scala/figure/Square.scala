package design.scala.figure

case class Square(absolute: Position, relatives: Seq[Position]) extends Figure {
  require(relatives.size == 4, "# of Points must be 4")
}

object Square {

  def apply(absolute: Position, width: Int): Square =
    Square(
      absolute,
      Seq(
        Position(    0,     0),
        Position(width,     0),
        Position(    0, width),
        Position(width, width)
      )
    )

}