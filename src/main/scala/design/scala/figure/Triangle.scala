package design.scala.figure

case class Triangle(absolute: Position, relatives: Seq[Position]) extends Figure {
  require(relatives.size == 3, "# of Points must be 3")
}