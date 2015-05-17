package design.scala.figure

case class Rectangle(absolute: Position, relatives: Seq[Position]) extends Figure {
  require(relatives.size == 4, "# of Points must be 4")
}
