package design.scala

case class ThreadCount(var numThreads: Int) {
  require(numThreads > -1, "numThreads must be greater than or equal to 0")
}