package design.scala.figure

case class Circle(absolute: Position, radius: Int) extends Figure {
  require(radius >= 0, "radius must be greater than or equal to 0")
}